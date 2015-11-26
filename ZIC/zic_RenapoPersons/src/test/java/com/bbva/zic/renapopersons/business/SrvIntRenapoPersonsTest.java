package com.bbva.zic.renapopersons.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.jaxrs.ext.search.PrimitiveStatement;
import org.apache.cxf.jaxrs.ext.search.SearchCondition;
import org.apache.cxf.jaxrs.ext.search.SearchParseException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.bbva.jee.arq.spring.core.host.transporte.ws.ExcepcionWS;
import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.bbva.jee.arq.spring.core.servicing.test.BusinessServiceTestContextLoader;
import com.bbva.jee.arq.spring.core.servicing.test.MockInvocationContextTestExecutionListener;
import com.bbva.jee.arq.spring.core.servicing.utils.BusinessServicesToolKit;
import com.bbva.jee.arq.spring.core.servicing.utils.ExtFiqlParser;
import com.bbva.zic.renapopersons.business.dto.DTOIntPerson;
import com.bbva.zic.renapopersons.business.utils.Constant;
import com.bbva.zic.renapopersons.business.utils.Validator;
import com.bbva.zic.renapopersons.facade.v01.dto.Person;
import com.bbva.zic.renapopersons.facade.v01.dto.util.RequestDto;
import com.bbva.zic.renapopersons.facade.v01.mapper.Mapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = BusinessServiceTestContextLoader.class, locations = {
		"classpath*:/META-INF/spring/applicationContext-*.xml", "classpath:/META-INF/spring/business-service.xml",
		"classpath:/META-INF/spring/business-service-test.xml" })
@TestExecutionListeners(listeners = { MockInvocationContextTestExecutionListener.class,
		DependencyInjectionTestExecutionListener.class })
public class SrvIntRenapoPersonsTest {
	
	private static final Log LOG = LogFactory.getLog(SrvIntRenapoPersonsTest.class);

	@Autowired
	ISrvIntRenapoPersons srvIntRenapoPersons;

	@Autowired
	@Qualifier("dataValidator")
	private Validator validator;

	@Autowired
	@Qualifier("myMapper")
	private Mapper mapper;

	@Autowired
	BusinessServicesToolKit bussinesToolKit;

	@Before
	public void cargaDatos() {

		System.setProperty("javax.net.ssl.trustStore",
				"C:\\Users\\XMZ6738\\Documents\\CERTIFICADOS_JVM\\keyStoreJVM.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "myPassword");

//		System.setProperty("htttps.proxyHost", "150.100.210.40");
		System.setProperty("https.proxyHost", "150.100.210.40");
		System.setProperty("https.proxyPort", "8080");
	}

	@Test
	public void testGetRenapoPersons() {
		
	}
	
}
/**
	@Test
	public void testGetRenapoPersons() {
		try {
			String curp = "GABC870629HTSRRR01";
			validator.checkGetParamsValidatePerson(curp);

			Person rp = mapper.getFromId(curp);
			DTOIntPerson dto = srvIntRenapoPersons.getRenapoPerson(rp);
			rp = mapper.dtoIntToDtoExtRenapoPerson(dto);
			System.out.println("Resultado de la operacion : " + rp.toString());
		} catch (BusinessServiceException e) {
			LOG.error("Error en la busqueda de informacion: " + e);
			e.printStackTrace();
		} catch (ExcepcionWS e) {
			LOG.error("Error al consultar el ws de renapo: " + e);
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetRenapoPersonsDummy1() {
		try {
			String curp = "GABC870629HTSRRR01";
			validator.checkGetParamsValidatePerson(curp);

			Person rp = mapper.getFromId(curp);
			DTOIntPerson dto = srvIntRenapoPersons.getRenapoPersonDummy1(rp);
			rp = mapper.dtoIntToDtoExtRenapoPerson(dto);
			System.out.println("Resultado de la operacion : " + rp.toString());
		} catch (BusinessServiceException e) {
			LOG.error("Error en la busqueda de informacion: " + e);
			e.printStackTrace();
		} catch (ExcepcionWS e) {
			LOG.error("Error al consultar el ws de renapo: " + e);
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetRenapoPersonsDummy2() {
		try {
			String curp = "GABC870629HTSRRR01";
			validator.checkGetParamsValidatePerson(curp);

			Person rp = mapper.getFromId(curp);
			DTOIntPerson dto = srvIntRenapoPersons.getRenapoPersonDummy2(rp);
			rp = mapper.dtoIntToDtoExtRenapoPerson(dto);
			System.out.println("Resultado de la operacion : " + rp.toString());
		} catch (BusinessServiceException e) {
			LOG.error("Error en la busqueda de informacion: " + e);
			e.printStackTrace();
		} catch (ExcepcionWS e) {
			LOG.error("Error al consultar el ws de renapo: " + e);
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void textGetList() {
//		String filter = "name==carlos,motherLastName==barrera,lastName==garcia,sex==H,birthDate==29/06/2015,birthPlace==TS";
		String filter = "motherLastName==barrera,sex==H,birthPlace==TS";
		Person rp = new Person();
		
		
		SearchCondition<RequestDto> sc;
		List<PrimitiveStatement> splitDateFilter = new ArrayList<PrimitiveStatement>();
		try {
			sc = new ExtFiqlParser<RequestDto>(RequestDto.class).parse(filter);
			splitDateFilter = bussinesToolKit.getDataFromFilter(sc);
		} catch (SearchParseException e) {
			e.printStackTrace();
			throw new BusinessServiceException(Constant.WRONG_PARAMETERS, e);
		}

		Map<String, Object> filterMapData = mapper.getFilterData(splitDateFilter);
		mapper.mapFilterData(filterMapData, rp);
		mapper.setNames("carlos fernando", rp);
		mapper.setLastName("garcüaÑ", rp);
		mapper.setBirthDate("1987-06-29", rp);
//		mapper.setBirthDate("29/06/1987", rp);

		validator.checkGetParamsListPerson(rp);

		List<DTOIntPerson> listDto = srvIntRenapoPersons.listRenapoPersons(rp);
		List<Person> listDtoExt = mapper.listDtoIntToDtoExtRenapoPerson(listDto);
	}
	
	@Test
	public void textGetListDummy1() {
//		String filter = "name==carlos,motherLastName==barrera,lastName==garcia,sex==H,birthDate==29/06/2015,birthPlace==TS";
		String filter = "motherLastName==barrera,sex==H,birthPlace==TS";
		Person rp = new Person();
		
		
		SearchCondition<RequestDto> sc;
		List<PrimitiveStatement> splitDateFilter = new ArrayList<PrimitiveStatement>();
		try {
			sc = new ExtFiqlParser<RequestDto>(RequestDto.class).parse(filter);
			splitDateFilter = bussinesToolKit.getDataFromFilter(sc);
		} catch (SearchParseException e) {
			e.printStackTrace();
			throw new BusinessServiceException(Constant.WRONG_PARAMETERS, e);
		}

		Map<String, Object> filterMapData = mapper.getFilterData(splitDateFilter);
		mapper.mapFilterData(filterMapData, rp);
		mapper.setNames("carlos fernando", rp);
		mapper.setLastName("garcüaÑ", rp);
		mapper.setBirthDate("1987-06-29", rp);

		validator.checkGetParamsListPerson(rp);

		List<DTOIntPerson> listDto = srvIntRenapoPersons.listRenapoPersonsDummy1(rp);
		List<Person> listDtoExt = mapper.listDtoIntToDtoExtRenapoPerson(listDto);
	}
	
	@Test
	public void textGetListDummy2() {
//		String filter = "name==carlos,motherLastName==barrera,lastName==garcia,sex==H,birthDate==29/06/2015,birthPlace==TS";
		String filter = "motherLastName==barrera,sex==H,birthPlace==TS";
		Person rp = new Person();
		
		
		SearchCondition<RequestDto> sc;
		List<PrimitiveStatement> splitDateFilter = new ArrayList<PrimitiveStatement>();
		try {
			sc = new ExtFiqlParser<RequestDto>(RequestDto.class).parse(filter);
			splitDateFilter = bussinesToolKit.getDataFromFilter(sc);
		} catch (SearchParseException e) {
			e.printStackTrace();
			throw new BusinessServiceException(Constant.WRONG_PARAMETERS, e);
		}

		Map<String, Object> filterMapData = mapper.getFilterData(splitDateFilter);
		mapper.mapFilterData(filterMapData, rp);
		mapper.setNames("carlos fernando", rp);
		mapper.setLastName("garcüaÑ", rp);
		mapper.setBirthDate("1987-06-29", rp);

		validator.checkGetParamsListPerson(rp);

		List<DTOIntPerson> listDto = srvIntRenapoPersons.listRenapoPersonsDummy2(rp);
		List<Person> listDtoExt = mapper.listDtoIntToDtoExtRenapoPerson(listDto);
	}

}
*/