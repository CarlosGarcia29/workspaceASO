package com.bbva.zic.renapopersons.business.mapper;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bbva.jee.arq.spring.core.host.transporte.ws.ExcepcionWS;
import com.bbva.jee.arq.spring.core.servicing.configuration.ConfigurationManager;
import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.bbva.zic.renapopersons.business.dto.DTOIntCountry;
import com.bbva.zic.renapopersons.business.dto.DTOIntIdentityDocument;
import com.bbva.zic.renapopersons.business.dto.DTOIntOptionList;
import com.bbva.zic.renapopersons.business.dto.DTOIntPerson;
import com.bbva.zic.renapopersons.business.dto.DTOIntPersonExtendedData;
import com.bbva.zic.renapopersons.business.utils.Constant;
import com.bbva.zic.renapopersons.business.utils.Converter;
import com.bbva.zic.renapopersons.business.utils.Validator;
import com.bbva.zic.renapopersons.business.ws.byCurp.xsd.DatosConsultaCurp;
import com.bbva.zic.renapopersons.business.ws.byData.xsd.DatosConsultaDetalles;
import com.bbva.zic.renapopersons.business.ws.response.CurpResponse;
import com.bbva.zic.renapopersons.business.ws.response.CurpResponseByData;
import com.bbva.zic.renapopersons.facade.v01.dto.Person;

@Component
public class MapperWS {
	
	private static Log log = LogFactory.getLog(MapperWS.class);
	
	@Autowired 
	private ConfigurationManager configurationManager;
	
	@Autowired
	@Qualifier("objectFactoryByCURP")
	com.bbva.zic.renapopersons.business.ws.byCurp.xsd.ObjectFactory factoryByCurp;
	
	@Autowired
	@Qualifier("objectFactoryByData")
	com.bbva.zic.renapopersons.business.ws.byData.xsd.ObjectFactory factoryByData;
	
	@Autowired
	@Qualifier("dataValidator")
	Validator validator;
	
	/**
	 * realiza un map de un objeto {@link PersonCurp} a un objeto {@link DatosConsultaCurp}.
	 * @param personCurp
	 * @return
	 */
	public DatosConsultaCurp mapPersonCurpToDatosConsultaCurp (final Person person) {
		log.info("[SrvRenapoPersonsV01]: armando el objeto de peticion");
		
		DatosConsultaCurp dao = new DatosConsultaCurp();
		dao.setCveCurp(factoryByCurp.createDatosConsultaCurpCveCurp(person.getIdentityDocument().get(0).getNumber()));
		
		System.out.println(Constant.WS_HOST + " " + configurationManager.getProperty(Constant.WS_HOST));
		System.out.println(Constant.WS_PASSWORD + " " + configurationManager.getProperty(Constant.WS_PASSWORD));
		System.out.println(Constant.WS_USER + " " + configurationManager.getProperty(Constant.WS_USER));
		System.out.println(Constant.WS_TX_CURP + " " + configurationManager.getProperty(Constant.WS_TX_CURP));		
		
		dao.setDireccionIp(factoryByCurp.createDatosConsultaCurpDireccionIp(configurationManager.getProperty(Constant.WS_HOST)));
		dao.setPassword(factoryByCurp.createDatosConsultaCurpPassword(configurationManager.getProperty(Constant.WS_PASSWORD)));
		dao.setUsuario(factoryByCurp.createDatosConsultaCurpUsuario(configurationManager.getProperty(Constant.WS_USER)));
		dao.setTipoTransaccion(configurationManager.getIntegerProperty(Constant.WS_TX_CURP));
		return dao;
	}
	
	/**
	 * realiza un map de un objeto {@link PersonCurp} a un objeto {@link DatosConsultaDetalles}.
	 * @param personCurp
	 * @return
	 */
	public DatosConsultaDetalles mapPersonCurpToDatosConsultaDetalles (final Person person) {
		log.info("[SrvRenapoPersonsV01]: armando el objeto de peticion");
		
		DatosConsultaDetalles dao = new DatosConsultaDetalles();
		
		System.out.println(Constant.WS_HOST + " " + configurationManager.getProperty(Constant.WS_HOST));
		System.out.println(Constant.WS_PASSWORD + " " + configurationManager.getProperty(Constant.WS_PASSWORD));
		System.out.println(Constant.WS_USER + " " + configurationManager.getProperty(Constant.WS_USER));
		System.out.println(Constant.WS_TX_DATA + " " + configurationManager.getProperty(Constant.WS_TX_DATA));
		
		dao.setDireccionIp(factoryByData.createDatosConsultaDetallesDireccionIp(configurationManager.getProperty(Constant.WS_HOST)));
		dao.setPassword(factoryByData.createDatosConsultaDetallesPassword(configurationManager.getProperty(Constant.WS_PASSWORD)));
		dao.setCveUsuario(factoryByData.createDatosConsultaDetallesCveUsuario(configurationManager.getProperty(Constant.WS_USER)));
		dao.setTipoTransaccion(configurationManager.getIntegerProperty(Constant.WS_TX_DATA));
		
		if (person.getExtendedData().getBirthPlace() != null) {
			dao.setCveAlfaEntFedNac(factoryByData.createDatosConsultaDetallesCveAlfaEntFedNac(person.getExtendedData().getBirthPlace().toUpperCase()));
		}
		if (person.getBirthDate() != null) {
			dao.setFechaNacimiento(factoryByData.createDatosConsultaDetallesFechaNacimiento(Converter.converterToDateDashToSlash(person.getBirthDate())));
		}
		if (person.getName() != null) {
			dao.setNombre(factoryByData.createDatosConsultaDetallesNombre(person.getName().toUpperCase()));
		}
		if (person.getLastName() != null) {
			dao.setPrimerApellido(factoryByData.createDatosConsultaDetallesPrimerApellido(person.getLastName().toUpperCase()));
		}
		if (person.getMotherLastName() != null) {
			dao.setSegundoApellido(factoryByData.createDatosConsultaDetallesSegundoApellido(person.getMotherLastName().toUpperCase()));
		}
		if (person.getExtendedData().getSex() != null) {
			dao.setSexo(factoryByData.createDatosConsultaDetallesSexo(person.getExtendedData().getSex().toUpperCase()));	
		}		
		return dao;
	}
	
	/**
	 * realiza la conversion de la respuesta del ws al dto interno
	 * @param respuesta
	 * @return
	 * @throws JAXBException
	 * @throws BusinessServiceException
	 */
	public DTOIntPerson mapResponceToDatosConsultaCurp(final Reader reader) throws JAXBException, BusinessServiceException, ExcepcionWS {
		log.info("[SrvRenapoPersonsV01]: armando el objeto de respuesta");
        JAXBContext jaxbContext = JAXBContext.newInstance(CurpResponse.class);
        Unmarshaller jaxbunmarshaller = jaxbContext.createUnmarshaller();
        CurpResponse cr = (CurpResponse) jaxbunmarshaller.unmarshal(reader);
        
        if (!validator.isBlank(cr.getTipoError())) {
        	log.error(Constant.TECHNICAL_ERROR_WS_RENAPO + " El ws regreso un codigo de error");
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
        }
        
        if (!validator.isBlank(cr.getStatusOper()) && Constant.WS_NO_EXITOSO.equals(cr.getStatusOper())) {
        	log.error(cr.getMessage());
			throw new ExcepcionWS(cr.getMessage());
        }
        
        return mapCurpResponseToDTOIntPersonCurp(cr);
    }
	
	/**
	 * realiza la conversion de la respuesta del ws a la lista de dto internos
	 * @param respuesta
	 * @return
	 * @throws BusinessServiceException
	 * @throws JAXBException
	 */
	public List<DTOIntPerson> mapResponceToDatosConsultaDetalles(final Reader reader) throws BusinessServiceException, JAXBException, ExcepcionWS {
		log.info("[SrvRenapoPersonsV01]: armando el objeto de respuesta");
		List<DTOIntPerson> resultados = new ArrayList<DTOIntPerson>();
        JAXBContext jaxbContext = JAXBContext.newInstance(CurpResponseByData.class);
        Unmarshaller jaxbunmarshaller = jaxbContext.createUnmarshaller();
        CurpResponseByData cr = (CurpResponseByData) jaxbunmarshaller.unmarshal(reader);
        
        if (!validator.isBlank(cr.getTipoError())) {
        	log.error(Constant.TECHNICAL_ERROR_WS_RENAPO + " El ws regreso un codigo de error");
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
        }
        
        if (!validator.isBlank(cr.getStatusOper()) && Constant.WS_NO_EXITOSO.equals(cr.getStatusOper())) {
        	log.error(cr.getMessage());
			throw new ExcepcionWS(cr.getMessage());
        }
        
        if (cr != null) {
        	if (cr.getCurpResponse() != null) {
        		for (CurpResponse elemento : cr.getCurpResponse()) {
        			resultados.add(mapCurpResponseToDTOIntPersonCurp(elemento));
        		}
        		return resultados;
        	}
        }
        throw new BusinessServiceException(Constant.NO_DATA);
    }
	
	/**
	 * realiza la conversion de un objeto curpResponse a un objeto dtoInt
	 * @param curpResponse
	 * @return
	 * @throws BusinessServiceException
	 */
	private DTOIntPerson mapCurpResponseToDTOIntPersonCurp(final CurpResponse curpResponse) throws BusinessServiceException {
		DTOIntPerson dto = new DTOIntPerson();
		
		if (curpResponse.getCURP() == null || curpResponse.getCURP().isEmpty() ) {
			throw new BusinessServiceException(Constant.NO_DATA);
		}
		
		DTOIntOptionList optLstType = new DTOIntOptionList();
//		optLstType.setId("1");
//		optLstType.setName("CURP");
		
		DTOIntOptionList optLstStatus = new DTOIntOptionList();
		optLstStatus.setName(StringToXML(curpResponse.getStatusCurp()));
		
		DTOIntCountry country = new DTOIntCountry();
		country.setId(StringToXML(curpResponse.getNacionalidad()));
		
		DTOIntIdentityDocument identityDocument = new DTOIntIdentityDocument();
		identityDocument.setType(optLstType);
		identityDocument.setNumber(StringToXML(curpResponse.getCURP()));
		identityDocument.setStatus(optLstStatus);
				
		DTOIntPersonExtendedData extendedData = new DTOIntPersonExtendedData();
		extendedData.setSex(StringToXML(curpResponse.getSexo()));
		extendedData.setBirthPlace(StringToXML(curpResponse.getCveEntidadNac()));
		
		dto.setExtendedData(extendedData);
		dto.setIdentityDocument(new ArrayList<DTOIntIdentityDocument>(1));
		dto.getIdentityDocument().add(identityDocument);
		
		dto.setBirthDate(StringToXML(Converter.converterToDateSlashToDash(curpResponse.getFechNac())));
		
		dto.setCountry(country);
		dto.setLastName(StringToXML(curpResponse.getApellido1()));
		dto.setMotherLastName(StringToXML(curpResponse.getApellido2()));
		dto.setName(StringToXML(curpResponse.getNombres()));
		
		
		return dto;
	}
	
	/**
	 * reestructura una cadena a formato xml
	 * @param cadena
	 * @return
	 */
	private String StringToXML(String cadena){
		if (cadena != null) {
			return StringEscapeUtils.escapeXml(cadena);
		}
		return null;
	}
}
