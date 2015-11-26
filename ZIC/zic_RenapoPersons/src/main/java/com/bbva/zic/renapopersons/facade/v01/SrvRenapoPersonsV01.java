package com.bbva.zic.renapopersons.facade.v01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.jaxrs.ext.search.PrimitiveStatement;
import org.apache.cxf.jaxrs.ext.search.SearchCondition;
import org.apache.cxf.jaxrs.ext.search.SearchParseException;
import org.apache.cxf.jaxrs.ext.search.SearchParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bbva.jee.arq.spring.core.host.transporte.ws.ExcepcionWS;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.bbva.jee.arq.spring.core.servicing.utils.BusinessServicesToolKit;
import com.bbva.jee.arq.spring.core.servicing.utils.ExtFiqlParser;
import com.bbva.zic.renapopersons.business.ISrvIntRenapoPersons;
import com.bbva.zic.renapopersons.business.dto.DTOIntPerson;
import com.bbva.zic.renapopersons.business.utils.Validator;
import com.bbva.zic.renapopersons.facade.v01.dto.Person;
import com.bbva.zic.renapopersons.facade.v01.dto.util.RequestDto;
import com.bbva.zic.renapopersons.facade.v01.mapper.Mapper;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;


	
@Path("/V01")
@SN(registryID="SNMX1500131",logicalID="RenapoPersons")
@VN(vnn="V01")
@Api(value="/RenapoPersons/V01",description="Entidad que modela los datos provenientes de una persona en RENAPO.")
@Produces({ MediaType.APPLICATION_JSON})
@Service	
public class SrvRenapoPersonsV01 implements ISrvRenapoPersonsV01, com.bbva.jee.arq.spring.core.servicing.utils.ContextAware {

	private static Log log = LogFactory.getLog(SrvRenapoPersonsV01.class);

	public HttpHeaders httpHeaders;
	
	@Autowired
	BusinessServicesToolKit bussinesToolKit;
	

	public UriInfo uriInfo;
	
	@Override
	public void setUriInfo(UriInfo ui) {
		this.uriInfo = ui;		
	}

	@Override
	public void setHttpHeaders(HttpHeaders httpHeaders) {
		this.httpHeaders = httpHeaders;
	}
	
	@Autowired
	ISrvIntRenapoPersons srvIntRenapoPersons;
	
	@Autowired
	@Qualifier("myMapper")
	private Mapper mapper;

	@Autowired
	@Qualifier("dataValidator")
	private Validator validator;

	/*
	 * (non-Javadoc)
	 * @see com.bbva.zic.renapopersons.facade.v01.ISrvRenapoPersonsV01#listRenapoPersons(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@ApiOperation(value="Listar Personas en RENAPO basado en ciertos criterios de busqueda", notes="Aqui se a�adira una JSON de ejemplo...",response=Person.class)
	@ApiResponses(value = {
			@ApiResponse(code=200,message="FoundSucessfully", response = Person.class),
			@ApiResponse(code=500,message="Technical Error"),
			@ApiResponse(code=500,message="Technical Error",response=ExcepcionWS.class),
			@ApiResponse(code=409,message="Functional Error",response=BusinessServiceException.class),
			@ApiResponse(code=400,message="Peticion Error",response=BusinessServiceException.class)})
	@GET
	@Path("/")
	@SMC(registryID="SMCMX1500198",logicalID="listRenapoPersons")
	public List<Person> listRenapoPersons(@ApiParam(value="filter param")@DefaultValue("null") @QueryParam("$filter") String filter, 
			@ApiParam("Primer apellido") @QueryParam("lastName") String lastName,
			@ApiParam("Nombre") @QueryParam("name") String name,
			@ApiParam("Fecha de nacimiento") @QueryParam("birthDate") String birthDate) {
		
		log.info("[SrvRenapoPersonsV01]: Inicio de servicio listRenapoPersons");
		
		Person rp = new Person();
		mapper.setNames(name, rp);
		mapper.setLastName(lastName, rp);
		mapper.setBirthDate(birthDate, rp);
		
		if (filter != null && !"null".equals(filter)) {
			SearchCondition<RequestDto> sc;
			List<PrimitiveStatement> splitDateFilter = new ArrayList<PrimitiveStatement>();
			try {
				sc = new ExtFiqlParser<RequestDto>(RequestDto.class).parse(filter);
				splitDateFilter = bussinesToolKit.getDataFromFilter(sc);
				Map<String, Object> filterMapData = mapper.getFilterData(splitDateFilter);
				mapper.mapFilterData(filterMapData, rp);
			} catch (SearchParseException e) {
				log.error("[SrvRenapoPersonsV01]: " + e);
			}			
		}
		
		validator.checkGetParamsListPerson(rp);

		List<DTOIntPerson> listDto = srvIntRenapoPersons.listRenapoPersons(rp);
		List<Person> listDtoExt = mapper.listDtoIntToDtoExtRenapoPerson(listDto);

		return listDtoExt;
	}

	/*
	 * (non-Javadoc)
	 * @see com.bbva.zic.renapopersons.facade.v01.ISrvRenapoPersonsV01#getRenapoPerson(java.lang.String)
	 */
	@ApiOperation(value="Buscar una Persona en RENAPO basado en su CURP", notes="Aqui se a�adira una JSON de ejemplo...",response=Person.class)
	@ApiResponses(value = {
			@com.wordnik.swagger.annotations.ApiResponse(code = 200, message = "Found Sucessfully", response = Person.class),
			@com.wordnik.swagger.annotations.ApiResponse(code = 500, message = "Technical Error"),
			@com.wordnik.swagger.annotations.ApiResponse(code = 500, message = "Technical Error", response = ExcepcionWS.class),
			@com.wordnik.swagger.annotations.ApiResponse(code = 400, message = "Functional Error", response = com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException.class),
			@com.wordnik.swagger.annotations.ApiResponse(code = 400, message = "Peticion Error", response = com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException.class) })
	@GET
	@Path("/{curp}")
	@SMC(registryID="SMCMX1500197",logicalID="getRenapoPerson")
	public Person getRenapoPerson(@ApiParam("Identificador del documento") @PathParam("curp") String curp) {
		log.info("[SrvRenapoPersonsV01]: Inicio de servicio getRenapoPerson");
		
		
		validator.checkGetParamsValidatePerson(curp);
		Person rp = mapper.getFromId(curp);
		DTOIntPerson dto = srvIntRenapoPersons.getRenapoPerson(rp);
		rp = mapper.dtoIntToDtoExtRenapoPerson(dto);

//		return Response.status(200).entity(rp).build();
		return rp;
	}

	

}
