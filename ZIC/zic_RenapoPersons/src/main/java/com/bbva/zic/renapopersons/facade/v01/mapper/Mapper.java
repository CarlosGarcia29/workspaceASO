package com.bbva.zic.renapopersons.facade.v01.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.jaxrs.ext.search.PrimitiveStatement;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bbva.zic.renapopersons.business.dto.DTOIntCountry;
import com.bbva.zic.renapopersons.business.dto.DTOIntIdentityDocument;
import com.bbva.zic.renapopersons.business.dto.DTOIntOptionList;
import com.bbva.zic.renapopersons.business.dto.DTOIntPerson;
import com.bbva.zic.renapopersons.business.dto.DTOIntPersonExtendedData;
import com.bbva.zic.renapopersons.business.utils.Constant;
import com.bbva.zic.renapopersons.business.utils.Validator;
import com.bbva.zic.renapopersons.facade.v01.SrvRenapoPersonsV01;
import com.bbva.zic.renapopersons.facade.v01.dto.Country;
import com.bbva.zic.renapopersons.facade.v01.dto.IdentityDocument;
import com.bbva.zic.renapopersons.facade.v01.dto.OptionList;
import com.bbva.zic.renapopersons.facade.v01.dto.Person;
import com.bbva.zic.renapopersons.facade.v01.dto.PersonExtendedData;

@Component(value = "myMapper")
public class Mapper {
	
	private static Log log = LogFactory.getLog(Mapper.class);
	
	@Autowired
	@Qualifier("dataValidator")
	private Validator validator;
	

	/**
	 * convierve la cadena curp a un objeto renapoPerson
	 * 
	 * @param curp
	 * @return
	 */
	public Person getFromId(final String curp) {
		Person rp = new Person();
		rp.setIdentityDocument(new ArrayList<IdentityDocument>(1));
		rp.getIdentityDocument().add(new IdentityDocument());
		if (!validator.isBlank(curp)) {
			rp.getIdentityDocument().get(0).setNumber(curp.toUpperCase());
		}		
		return rp;
	}

	/**
	 * convierte un dtoInt a un dtoExt
	 * 
	 * @param dtoIntRenapoPerson
	 * @return
	 */
	public Person dtoIntToDtoExtRenapoPerson(final DTOIntPerson dtoIntPerson) {
		log.info("[SrvRenapoPersonsV01]: Convirtiendo el DTO interno al externo");
		
		Person dtoExt = new Person();
		dtoExt.setBirthDate(dtoIntPerson.getBirthDate());
		dtoExt.setLastName(dtoIntPerson.getLastName());
		dtoExt.setMotherLastName(dtoIntPerson.getMotherLastName());
		dtoExt.setName(dtoIntPerson.getName());
		
		dtoExt.setCountry(CountryMap(dtoIntPerson.getCountry()));
		dtoExt.setExtendedData(PersonExtendedDataMap(dtoIntPerson.getExtendedData()));

		if (dtoIntPerson.getIdentityDocument() != null && !dtoIntPerson.getIdentityDocument().isEmpty()) {
			DTOIntIdentityDocument dtoIntIdentityDocument = dtoIntPerson.getIdentityDocument().get(0);
			
			IdentityDocument dtoIdentityDocument = new IdentityDocument();
			dtoIdentityDocument.setNumber(dtoIntIdentityDocument.getNumber());			
			dtoIdentityDocument.setType(OptionListMap(dtoIntIdentityDocument.getType()));
			dtoIdentityDocument.setStatus(OptionListMap(dtoIntIdentityDocument.getStatus()));

			List<IdentityDocument> listIdentityDocument = new ArrayList<IdentityDocument>(1);
			listIdentityDocument.add(dtoIdentityDocument);
			dtoExt.setIdentityDocument(listIdentityDocument);
		}
		return dtoExt;
	}

	/**
	 * convierte una lista del dto int a una lista de un dto ext
	 * 
	 * @param listDtoIntRenapoPerson
	 * @return
	 */
	public List<Person> listDtoIntToDtoExtRenapoPerson(final List<DTOIntPerson> listDtoIntPerson) {
		log.info("[SrvRenapoPersonsV01]: Convirtiendo la lista de DTO interno al externo");
		List<Person> listDtoExtRenapoPerson = new ArrayList<Person>(1);
		if (listDtoIntPerson != null && !listDtoIntPerson.isEmpty()) {
			for (DTOIntPerson dtoInt : listDtoIntPerson) {
				listDtoExtRenapoPerson.add(dtoIntToDtoExtRenapoPerson(dtoInt));
			}
		}
		return listDtoExtRenapoPerson;
	}

	/**
	 * genera un mapa objeto valor a partir del parametro filtro.
	 * 
	 * @param splitDateFilter
	 * @return
	 */
	public Map<String, Object> getFilterData(final List<PrimitiveStatement> splitDateFilter) {
		Map<String, Object> objectMap = new HashMap<String, Object>();
		for (PrimitiveStatement primitiveStatement : splitDateFilter) {
			objectMap.put(primitiveStatement.getProperty(), primitiveStatement.getValue());
		}
		return objectMap;
	}

	/**
	 * genera un objeto persona a partir del mapa de datos
	 * 
	 * @param filterData
	 * @return
	 */
	public Person mapFilterData(Map<String, Object> filterData, Person dtoExt) {
		dtoExt.setExtendedData(new PersonExtendedData());

		if (filterData.containsKey(Constant.MOTHER_LAST_NAME.toLowerCase())) {
			dtoExt.setMotherLastName(filterData.get(Constant.MOTHER_LAST_NAME.toLowerCase()).toString());
		}
		if (filterData.containsKey(Constant.BIRTH_PLACE.toLowerCase())) {
			dtoExt.getExtendedData().setBirthPlace(filterData.get(Constant.BIRTH_PLACE.toLowerCase()).toString());
		}
		if (filterData.containsKey(Constant.SEX.toLowerCase())) {
			dtoExt.getExtendedData().setSex(filterData.get(Constant.SEX.toLowerCase()).toString());
		}
		return dtoExt;
	}
	
	/**
	 * asigna la variable names al objeto Person
	 * @param names
	 * @param dtoExt
	 */
	public void setNames(final String names, Person dtoExt){
		if (!validator.isBlank(names)) {
			dtoExt.setName(names.toLowerCase());
		}
	}
	
	/**
	 * asigna la variable lastname al objeto Person
	 * @param lastName
	 * @param dtoExt
	 */
	public void setLastName(final String lastName, Person dtoExt){
		if (!validator.isBlank(lastName)) {
			dtoExt.setLastName(lastName.toLowerCase());
		}
	}
	
	/**
	 * asigna la variable birthDate al objeto Person
	 * @param birthDate
	 * @param dtoExt
	 */
	public void setBirthDate(final String birthDate, Person dtoExt){
		if (!validator.isBlank(birthDate)) {
			dtoExt.setBirthDate(birthDate.toLowerCase());
		}
	}

	/**
	 * extrae los datos del dto interno para asignarlos al dto externo
	 * @param dtoIntPersonExtendedData
	 * @return
	 */
	public static PersonExtendedData PersonExtendedDataMap(DTOIntPersonExtendedData dtoIntPersonExtendedData) {
		PersonExtendedData PersonExtendedData = new PersonExtendedData();
		BeanUtils.copyProperties(dtoIntPersonExtendedData, PersonExtendedData);
		return PersonExtendedData;
	}

	/**
	 * extrae los datos del dto interno para asignarlos al dto externo
	 * @param dtoIntOptionList
	 * @return
	 */
	public static OptionList OptionListMap(DTOIntOptionList dtoIntOptionList) {
		OptionList OptionList = new OptionList();
		BeanUtils.copyProperties(dtoIntOptionList, OptionList);
		return OptionList;
	}
	
	/**
	 * extrae los datos del dto interno para asignarlos al dto externo
	 * @param dtoIntIdentityDocument
	 * @return
	 */
	public static IdentityDocument IdentityDocumentMap(DTOIntIdentityDocument dtoIntIdentityDocument) {
		IdentityDocument IdentityDocument = new IdentityDocument();
		BeanUtils.copyProperties(dtoIntIdentityDocument, IdentityDocument);
		return IdentityDocument;
	}

	/**
	 * extrae los datos del dto interno para asignarlos al dto externo
	 * @param dtoIntCountry
	 * @return
	 */
	public static Country CountryMap(DTOIntCountry dtoIntCountry) {
		Country Country = new Country();
		BeanUtils.copyProperties(dtoIntCountry, Country);
		return Country;
	}

	/**
	 * extrae los datos del dto interno para asignarlos al dto externo
	 * @param dtoIntPerson
	 * @return
	 */
	public static Person PersonMap(DTOIntPerson dtoIntPerson) {
		Person Person = new Person();
		BeanUtils.copyProperties(dtoIntPerson, Person);
		return Person;
	}
}

//public static DTOIntPersonExtendedData dtoIntPersonExtendedDataMap(PersonExtendedData PersonExtendedData) {
//DTOIntPersonExtendedData dtoIntPersonExtendedData = new DTOIntPersonExtendedData();
//BeanUtils.copyProperties(PersonExtendedData, dtoIntPersonExtendedData);
//return dtoIntPersonExtendedData;
//}
//
//
//public static DTOIntOptionList dtoIntOptionListMap(OptionList OptionList) {
//	DTOIntOptionList dtoIntOptionList = new DTOIntOptionList();
//	BeanUtils.copyProperties(OptionList, dtoIntOptionList);
//	return dtoIntOptionList;
//}
//
//
//public static DTOIntIdentityDocument dtoIntIdentityDocumentMap(IdentityDocument IdentityDocument) {
//	DTOIntIdentityDocument dtoIntIdentityDocument = new DTOIntIdentityDocument();
//	BeanUtils.copyProperties(IdentityDocument, dtoIntIdentityDocument);
//	return dtoIntIdentityDocument;
//}
//
//
//public static DTOIntCountry dtoIntCountryMap(Country Country) {
//	DTOIntCountry dtoIntCountry = new DTOIntCountry();
//	BeanUtils.copyProperties(Country, dtoIntCountry);
//	return dtoIntCountry;
//}
////
//public static DTOIntPerson dtoIntPersonMap(Person Person) {
//	DTOIntPerson dtoIntPerson = new DTOIntPerson();
//	BeanUtils.copyProperties(Person, dtoIntPerson);
//	return dtoIntPerson;
//}