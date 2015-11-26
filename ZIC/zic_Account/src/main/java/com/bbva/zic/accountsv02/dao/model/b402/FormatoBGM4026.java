package com.bbva.zic.accountsv02.dao.model.b402;

import java.math.BigDecimal;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import com.bbva.jee.arq.spring.core.host.Formato;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;


/**
 * Formato de datos <code>BGM4026</code> de la transacci&oacute;n <code>B402</code>
 * 
 * @author Arquitectura Spring BBVA
 */
@Formato(nombre = "BGM4026")
@RooJavaBean
@RooToString
@RooSerializable
public class FormatoBGM4026 {
	
	/**
	 * <p>Campo <code>CON05</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "CON05", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con05;
	
	/**
	 * <p>Campo <code>DEPTO</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "DEPTO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 4, longitudMaxima = 4)
	private String depto;
	
	/**
	 * <p>Campo <code>CON06</code>, &iacute;ndice: <code>3</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 3, nombre = "CON06", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con06;
	
	/**
	 * <p>Campo <code>COND23</code>, &iacute;ndice: <code>4</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 4, nombre = "COND23", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String cond23;
	
	/**
	 * <p>Campo <code>COND24</code>, &iacute;ndice: <code>5</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 5, nombre = "COND24", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String cond24;
	
	/**
	 * <p>Campo <code>COND31</code>, &iacute;ndice: <code>6</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 6, nombre = "COND31", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String cond31;
	
	/**
	 * <p>Campo <code>CUOTIMP</code>, &iacute;ndice: <code>7</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 7, nombre = "CUOTIMP", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 17, longitudMaxima = 17)
	private String cuotimp;
	
	/**
	 * <p>Campo <code>LITAHOI</code>, &iacute;ndice: <code>8</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 8, nombre = "LITAHOI", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 20, longitudMaxima = 20)
	private String litahoi;
	
	/**
	 * <p>Campo <code>SALAHOI</code>, &iacute;ndice: <code>9</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 9, nombre = "SALAHOI", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 17, longitudMaxima = 17)
	private String salahoi;
	
}