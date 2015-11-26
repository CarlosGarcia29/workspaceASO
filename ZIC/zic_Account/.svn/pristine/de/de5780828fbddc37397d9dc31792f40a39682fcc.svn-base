package com.bbva.zic.accountsv02.facade.v02;



import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import com.bbva.jee.arq.spring.core.servicing.utils.BusinessServicesToolKit;
import com.bbva.zic.accountsv02.business.dto.DTOIntAccount;
import com.bbva.zic.accountsv02.facade.v02.dto.Account;
import com.bbva.zic.accountsv02.facade.v02.mapper.Mapper;
import com.bbva.zic.accountsv02.facade.v02.utils.Validator;
import com.bbva.zic.accountsv02.business.ISrvIntAccountsV02;


	
@Path("/V02")
@VN(vnn="V02")
@SN(registryID="SNMX1500047",logicalID="AccountsV02")
@Api(value="/AccountsV02/V02",description="Entidad que modela un convenio.")
@Produces({ MediaType.APPLICATION_JSON})
@Service
public class SrvAccountsV02V02 implements ISrvAccountsV02V02, com.bbva.jee.arq.spring.core.servicing.utils.ContextAware {

	private static Log LOG = LogFactory.getLog(SrvAccountsV02V02.class);

	public HttpHeaders httpHeaders;
	
	public UriInfo uriInfo;
	
	@Autowired
	public BusinessServicesToolKit bussinesToolKit;
	
	@Autowired
	ISrvIntAccountsV02 srvIntAccountsV02;
	
	@Autowired
	private Mapper mapper;
	
	@Autowired
	private Validator validator;
	
	@Override
	public void setUriInfo(UriInfo ui) {
		this.uriInfo = ui;		
	}

	@Override
	public void setHttpHeaders(HttpHeaders httpHeaders) {
		this.httpHeaders = httpHeaders;
	}
	
	

	
	@GET
	@Path("/{accountId}")
	@SMC(registryID = "SMCMX1500086", logicalID = "getAccount")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Consulta la informacion basica de una cuenta, sus saldos, " + 
			"las fechas de apertura, expiracion y cierre, y el tipo de cuenta.", 
			notes = "Aqui se anadira una JSON de ejemplo...",
			response = Account.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Found Sucessfully", response = Account.class),
		@ApiResponse(code = 409, message = "(BGE0007) CAMPO PAPEL ERRONEO. VALORES PERMITIDOS: (S) O (N)", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "(BGE0007) CAMPO CONSULTA AMPLIADA ERRONEO. VALORES PERMITIDOS: (S) O (N)", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "(BGE1084) IMPOSIBLE REALIZAR OPERACION PARA ESTE TIPO DE PRODUCTO", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "(BGE0002) CUENTA NO EXISTE", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "(BGE0002) DIVISA NO EXISTE", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "(BGE0040) PRODUCTO NOEXISTE. ANOTAR ERR,AVISE AL SOS REGIONAL", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "(BGE1156) USUARIO NO AUTORIZADO. CTA BLOQ.POR DEPTO @@@@@@@", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "(BGE1156) USUARIO NO AUTORIZADO. BLOQUEO POR SISTEMA", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "(BGE1156) USUARIO NO AUTORIZADO. CUENTA CONFIDENCIAL", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "(BGE1183) NIVEL DE CONFIDENC. SUPERIOR AL PERMITIDO POR FACULT. AUT BGE1183", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "(BGE1184) USUARIO NO AUTORIZADO. AUT BGE1184", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "(BGE0365) DATOS DE ENTRADA ERRONEOS. POSIBLE DISCORDANCIA CON LA PETICION", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "(BGE1138) OPERACION PERMITIDA SOLO A SUCURSAL O UNIDAD GESTORA DE LA CUENTA", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "(BQE0041) DATOS DE ENTRADA ERRONEOS", response = BusinessServiceException.class),		
		@ApiResponse(code = 500, message = "Technical Error")})
	
	public Account getAccount(		
			@ApiParam(value = "Identificador de cuenta") @PathParam("accountId") String accountId,
			@ApiParam(value = "Fields param") @QueryParam("$fields") String fields) {
			
		LOG.info("[SrvAccountsV01]: Inicio de servicio getAccount");
		
		validator.checkGetAccountParams(accountId);
		
		DTOIntAccount businessResponse = srvIntAccountsV02.getAccount(accountId, fields);
		Account facadeResponse = mapper.mapDTOIntAccountToExt(businessResponse);
		
		return facadeResponse;
	}

	/*
	 * (non-Javadoc)
	 * @see com.bbva.zic.accountsv02.facade.v02.ISrvAccountsV02V02#prospectAccountNumbers(com.bbva.zic.accountsv02.facade.v02.dto.Account)
	 */
	@POST
	@Path("/prospectAccountNumbers")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@SMC(registryID="SMCMX1500202",logicalID="createProspectAccountNumber")
	@ApiOperation(value="Generar el prospecto a ser el N�mero de Cuenta", notes="Aqui se a�adira una JSON de ejemplo...", response=Account.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Found Sucessfully", response=Account.class),
		@ApiResponse(code = 409, message = "BGE0048 - @@@@@@@@@@@@@@@@@@@@ NO ES @@@@@@@@@@@@@@@@@@@@ PERSONA/REGIMEN FIS. NO ES VALIDO CAMBIO SUBPRO SUC FUERA ZONA FRONT NO ES AUTORIZADA.", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BGE0007 - CAMPO @@@@@@@@@@@@@@@@@@@@ ERRONEO. VALORES PERMITIDOS:@@@@@@@@@@@@@@@. CAMPO PAPEL ERRONEO. VALORES PERMITIDOS:S,N.	", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BGE0002 - ENTIDAD/CENTRO @@@@@ NO EXISTE.NUMERACION@@@@@@@@@@ NO EXISTE.CENTRO@@@@@@@@@@@@@@ NO EXISTE", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BGE0561 - @@@@@@@@@@@@@@ NO OPERATIVO. CENTRO", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BGE0040 - @@@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@@@@. ANOTAR ERR,AVISE AL SOS REGIONAL ERROR EN ACCESO TABLA 0568. "
				+ "ERROR EN ACCESO TABLA DE CENTROS TABLA DE DEPURADOS S/FOLIOS DISPONIBLES ERROR ACCESO MODULONUMERACION "
				+ "CONTRATOS ERROR EN ACCESO A  RUTINA PE2C7200", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BGE0738 - CENTRO NO AUTORIZADO", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BGE0527 - NO EXISTE AUTORIZACION PARA ESTE TIPO DE OPERACIONES", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BHE0032 - @@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@. CONSULTE PRODUCTOS EN TRANSACCION B491 TIPO OPERACIÓN NO EXISTE PRODUCTO NO EXISTE", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BGE0223 - EL DIGITO DE ENTIDAD/OFICINA TECLEADO NO ES CORRECTO.", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BGE0625 - ERR DAT ENT MODULO @@@@@@@@: @@@@@@@@@@@@@@@@@@@. AVISE A SOS REGIONAL TC2C1700  RC: 'W050-CDRETORN' (CONTENIDO DE) TC2C1700 RC: 'W050-TABLENAME' (SU CONTENIDO)", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BGE0901 - FECHA DE OPERACION ERRONEA", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BGE1112 - NO SE PUEDE @@@@@@@@@@@@@@@@@@@@ EN CUENTA @@@@@@@@@@@@@@@@@@@@ NUMERAR SOLICITADA", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BRE0043 - PARAMETROS DIGITO CONTROL ERRONEOS.ANOTAR Nº DE ERROR Y AVISAR AVERIAS", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BRE0024 - NUMERO DE CUENTA NO SE PUEDE ASIGNAR", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BRE0009 - DIGITO DE COMPROBACION DE CUENTA ERRONEO", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BRE0044 - ERROR CALCULO DIGITOS CONTROL. ANOTAR NUMERO DE ERROR Y AVISAR AVERIAS", response = BusinessServiceException.class),
		@ApiResponse(code = 409, message = "BGE2185 - ERROR EN LA SUBRUTINA  @@@@@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@ PROB. LINK PROGRAM   QG7CTCK1", response = BusinessServiceException.class),
		@ApiResponse(code = 400, message = "Parámetros obligatorios no informados", response = BusinessServiceException.class),
		@ApiResponse(code = 400, message = "El Producto debe ser numerico", response = BusinessServiceException.class),
		@ApiResponse(code = 500, message = "Technical Error")})
	public Account prospectAccountNumbers(@ApiParam("Entidad que esta relacionada a las cuentas") Account account) {
		LOG.info("[SrvAccountV02]: Inicio de servicio prospectAccountNumbers");
		
		
		validator.checkPostProspectAccountParams(account);
		
		DTOIntAccount accountInt = Mapper.mapDTOExtAccountToInt(account);
		
		accountInt = srvIntAccountsV02.prospectAccountNumber(accountInt);
		account = mapper.mapDTOIntAccountToExt(accountInt);

		
		return account;
	}	
}
