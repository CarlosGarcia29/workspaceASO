package com.bbva.zic.renapopersons.business.utils;

public class Constant {
	
	public static final String WRONG_PARAMETERS = "wrongParameters";
	public static final String WRONG_PARAMETERS_CURP="La CURP no cumple con el formato requerdo";
	public static final String WRONG_PARAMETERS_DATE_FORMAT="El parametro birthDate debe cumplir con el criterio yyyy-mm-dd";
	public static final String WRONG_PARAMETERS_DATE="El parametro birthDate no es valido";
	
	public static final String PARAMETERS_MISSING_NAMES="Si no se recibe la CURP, el parametro names es obligatorio";
	public static final String PARAMETERS_MISSING_LAST_NAME="Si no se recibe la CURP, el parametro lastName es obligatorio";
	public static final String PARAMETERS_MISSING_BIRTH_DATE="Si no se recibe la CURP, el parametro birthDate es obligatorio";
	
	public static final String PARAMETERS_FORMAT_MOTHER_LAST_NAME="El parametro motherLastName solo puede contener letras: [a-zA-Z]	";
	public static final String PARAMETERS_FORMAT_LAST_NAME="El parametro lastName solo puede contener letras: [a-zA-Z]	";
	public static final String PARAMETERS_FORMAT_NAMES="names";
	
	
	public static final String NO_DATA = "No se pudo encontrar informacion con los datos recibidos";
	
	public static final String TECHNICAL_ERROR_WS_RENAPO = "El ws de renapo no desponde";
	
//	TODO datos que pueden estar en el request
	public static final String LAST_NAME = "lastName";
	public static final String MOTHER_LAST_NAME = "motherLastName";
	public static final String NAMES = "name";
	public static final String SEX = "sex";
	public static final String BIRTH_DATE = "birthDate";
	public static final String BIRTH_PLACE = "birthPlace";
	public static final String CURP = "curp";
	
	public static final String CURP_STATUS = "AH";
	
//	TODO constantes sonbre la busqueda de propiedades en archivos de configuracion
	public static final String WS_HOST = "servicioCurpRenapo.ws.datos.host";
	public static final String WS_USER = "servicioCurpRenapo.ws.datos.user";
	public static final String WS_PASSWORD = "servicioCurpRenapo.ws.datos.password";
	public static final String WS_TX_CURP = "servicioCurpRenapo.ws.datos.txconsulta.curp";
	public static final String WS_TX_DATA = "servicioCurpRenapo.ws.datos.txconsulta.data";
	
	public static final String WS_NO_EXITOSO = "NO EXITOSO";

}
