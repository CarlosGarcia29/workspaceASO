package com.bbva.zic.proxyservicemppm.dao.model.mppm;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import com.bbva.jee.arq.spring.core.host.Formato;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;


/**
 * Formato de datos <code>MPPM00S</code> de la transacci&oacute;n <code>MPPM</code>
 * 
 * @author Arquitectura Spring BBVA
 */
@Formato(nombre = "MPPM00S")
@RooJavaBean
@RooToString
@RooSerializable
public class FormatoMPPM00S {
	
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
	
}