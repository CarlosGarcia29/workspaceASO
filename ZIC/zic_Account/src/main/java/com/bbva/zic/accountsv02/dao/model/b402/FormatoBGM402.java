package com.bbva.zic.accountsv02.dao.model.b402;


import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.Formato;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * Formato de datos <code>BGM402</code> de la transacci&oacute;n <code>B402</code>
 * 
 * @author Arquitectura Spring BBVA
 */
@Formato(nombre = "BGM402")
@RooJavaBean
@RooToString
@RooSerializable
public class FormatoBGM402 {

	/**
	 * <p>Campo <code>CCC</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "CCC", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 20, longitudMaxima = 20)
	private String ccc;
	
	/**
	 * <p>Campo <code>OPCION</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "OPCION", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String opcion;
	
	/**
	 * <p>Campo <code>PAPEL</code>, &iacute;ndice: <code>3</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 3, nombre = "PAPEL", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String papel;
	
	/**
	 * <p>Campo <code>LIBRE</code>, &iacute;ndice: <code>4</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 4, nombre = "LIBRE", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 12, longitudMaxima = 12)
	private String libre;
	
}