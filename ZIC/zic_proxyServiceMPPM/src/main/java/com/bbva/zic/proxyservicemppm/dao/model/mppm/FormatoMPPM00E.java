package com.bbva.zic.proxyservicemppm.dao.model.mppm;


import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.Formato;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * Formato de datos <code>MPPM00E</code> de la transacci&oacute;n <code>MPPM</code>
 * 
 * @author Arquitectura Spring BBVA
 */
@Formato(nombre = "MPPM00E")
@RooJavaBean
@RooToString
@RooSerializable
public class FormatoMPPM00E {

	/**
	 * <p>Campo <code>NUMCLIE</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "NUMCLIE", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 8, longitudMaxima = 8)
	private String numclie;
	
	/**
	 * <p>Campo <code>NUMCTA</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "NUMCTA", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 18, longitudMaxima = 18)
	private String numcta;
	
	/**
	 * <p>Campo <code>NUMTARA</code>, &iacute;ndice: <code>3</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 3, nombre = "NUMTARA", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 19, longitudMaxima = 19)
	private String numtara;
	
	/**
	 * <p>Campo <code>TARANT</code>, &iacute;ndice: <code>4</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 4, nombre = "TARANT", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 19, longitudMaxima = 19)
	private String tarant;
	
	/**
	 * <p>Campo <code>OPCION</code>, &iacute;ndice: <code>5</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 5, nombre = "OPCION", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 2, longitudMaxima = 2)
	private String opcion;
	
}