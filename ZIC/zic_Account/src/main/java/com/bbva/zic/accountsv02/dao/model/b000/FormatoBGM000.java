package com.bbva.zic.accountsv02.dao.model.b000;


import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.Formato;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * Formato de datos <code>BGM000</code> de la transacci&oacute;n <code>B000</code>
 * 
 * @author Arquitectura Spring BBVA
 */
@Formato(nombre = "BGM000")
@RooJavaBean
@RooToString
@RooSerializable
public class FormatoBGM000 {

	/**
	 * <p>Campo <code>PRODUCT</code>, &iacute;ndice: <code>1</code>, tipo: <code>ENTERO</code>
	 */
	@Campo(indice = 1, nombre = "PRODUCT", tipo = TipoCampo.ENTERO, longitudMinima = 2, longitudMaxima = 2)
	private Integer product;
	
	/**
	 * <p>Campo <code>ENTCTO</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "ENTCTO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 8, longitudMaxima = 8)
	private String entcto;
	
	/**
	 * <p>Campo <code>CONCEPT</code>, &iacute;ndice: <code>3</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 3, nombre = "CONCEPT", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 40, longitudMaxima = 40)
	private String concept;
	
	/**
	 * <p>Campo <code>PAPEL</code>, &iacute;ndice: <code>4</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 4, nombre = "PAPEL", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String papel;
	
	/**
	 * <p>Campo <code>LIBRE</code>, &iacute;ndice: <code>5</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 5, nombre = "LIBRE", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 12, longitudMaxima = 12)
	private String libre;
	
}