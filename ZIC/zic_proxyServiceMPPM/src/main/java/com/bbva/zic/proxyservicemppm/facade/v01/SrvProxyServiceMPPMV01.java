package com.bbva.zic.proxyservicemppm.facade.v01;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.bbva.jee.arq.spring.core.servicing.utils.BusinessServicesToolKit;
import com.bbva.zic.proxyservicemppm.business.ISrvIntProxyServiceMPPM;
import com.bbva.zic.proxyservicemppm.business.dto.DTOIntPeticionTransaccionMPPMV01;
import com.bbva.zic.proxyservicemppm.business.dto.DTOIntRespuestaTransaccionMPPMV01;
import com.bbva.zic.proxyservicemppm.facade.v01.dto.PeticionTransaccionMPPMV01;
import com.bbva.zic.proxyservicemppm.facade.v01.dto.RespuestaTransaccionMPPMV01;
import com.bbva.zic.proxyservicemppm.facade.v01.mapper.Mapper;
import com.bbva.zic.proxyservicemppm.facade.v01.utils.Validator;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/V01")
@SN(registryID="SNMX1500143",logicalID="proxyServiceMPPM")
@VN(vnn="V01")
@Api(value="/proxyServiceMPPM/V01",description="Servicio proxi de la transacción MPPM")
@Produces({ MediaType.APPLICATION_JSON})
@Service
public class SrvProxyServiceMPPMV01 implements ISrvProxyServiceMPPMV01, com.bbva.jee.arq.spring.core.servicing.utils.ContextAware {

	private static Log LOG = LogFactory.getLog(SrvProxyServiceMPPMV01.class);

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
	ISrvIntProxyServiceMPPM srvIntProxyServiceMPPM;
	
	@Autowired
	Validator validator;
	
	@POST
	@SMC(registryID="SMCMX1500224",logicalID="proxyServiceMPPM")
	@ApiOperation(value="Ejecutar la transaccion MPPM", notes="Aqui se a�adira una JSON de ejemplo...", response=PeticionTransaccionMPPMV01.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Found Sucessfully", response=Response.class),
		@ApiResponse(code = 409, message = "MPE0001 TECLA PULSADA INCORRECTA.", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE0007 -> @@@@@@@@@@@@@@@@@@@@ NO EXISTE.", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE0048 CUENTA NO PERMITIDA.", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE0113 TARJETA NO VIGENTE", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE0143 CUENTA CANCELADA.", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE1022 TITULAR CUENTA NO ES PERSONA FISICA.", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE1100 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE1103 SE REQUIERE CONSULTA PREVIA", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2164 OBLIGATORIO INFORMAR NUMERO DE CLIENTE", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2165 OBLIGATORIO INFORMAR NUMERO DE CUENTA", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2166 OBLIGATORIO INFORMAR NUMERO DE TARJETA", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2167 ESTADO DE TARJETA NO PERMITE SU ENTREGA", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2168 TIPO DE CONTRATO NO COINCIDE CON CUENTA", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2169 SE REQUIERE TARJETA EXPRESS", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2170 SUBPRODUCTO INVALIDO, DEBE SER 0260", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2171 LA TARJETA INGRESADA NO ES PRESTAMPADA", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2172 CODIGO DE RETENCION DE TARJETA NO VALIDO", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2173 EL NUMERO DE CLIENTE NO ES TITULAR O AUTORIZADO", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2174 NO. DE CLIENTE NO EXISTE EN PERSONAS", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2175 NO EXISTE EL NO. DE CONTRATO INFORMADO", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2176 NO EXISTE EL NUMERO DE TARJETA INFORMADO", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2177 SIN DATOS DE STOCK PARA TIPO DE TJ  #1", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2178 SIN DATOS DE STOCK PARA TIPO DE TJ  #2", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2179 SIN DATOS DE STOCK PARA TIPO DE TJ  #3", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPE2180 'OBLIGATORIO INFORMAR NUMERO DE TARJETA ANTERIOR'", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "MPA4007 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@", response = BusinessServiceException.class),
		@ApiResponse(code = 500, message = "Technical Error")})
	public RespuestaTransaccionMPPMV01 proxyServiceMPPM(@ApiParam(value="objeto json de la peticion") PeticionTransaccionMPPMV01 peticionTransaccionMPPMV01) {
		LOG.info("[proxyServiceMPPM]: Inicio de servicio proxyServiceMPPM");
		
		validator.checkPostProxyServiceMPPM(peticionTransaccionMPPMV01);
		
		DTOIntPeticionTransaccionMPPMV01 dtoIntPeticionTransaccion = Mapper.dtoIntPeticionTransaccionMap(peticionTransaccionMPPMV01);
		
		DTOIntRespuestaTransaccionMPPMV01 dtoIntRespuestaTransaccion = srvIntProxyServiceMPPM.proxyServiceMPPM(dtoIntPeticionTransaccion);
		
		RespuestaTransaccionMPPMV01 respuestaTransaccion = Mapper.RespuestaTransaccionMap(dtoIntRespuestaTransaccion);
		
		return respuestaTransaccion;
	}
}
