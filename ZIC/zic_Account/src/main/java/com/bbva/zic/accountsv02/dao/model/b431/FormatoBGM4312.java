package com.bbva.zic.accountsv02.dao.model.b431;

import java.util.Date;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import com.bbva.jee.arq.spring.core.host.Formato;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;


/**
 * Formato de datos <code>BGM4312</code> de la transacci&oacute;n <code>B431</code>
 * 
 * @author Arquitectura Spring BBVA
 */
@Formato(nombre = "BGM4312")
@RooJavaBean
@RooToString
@RooSerializable
public class FormatoBGM4312 {
	
	/**
	 * <p>Campo <code>PRCHEQ</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "PRCHEQ", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 9, longitudMaxima = 9)
	private String prcheq;
	
	/**
	 * <p>Campo <code>ULCHEQ</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "ULCHEQ", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 9, longitudMaxima = 9)
	private String ulcheq;
	
	/**
	 * <p>Campo <code>TOTAL</code>, &iacute;ndice: <code>3</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 3, nombre = "TOTAL", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 6, longitudMaxima = 6)
	private String total;
	
	/**
	 * <p>Campo <code>DISP</code>, &iacute;ndice: <code>4</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 4, nombre = "DISP", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 5, longitudMaxima = 5)
	private String disp;
	
	/**
	 * <p>Campo <code>CLASET</code>, &iacute;ndice: <code>5</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 5, nombre = "CLASET", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 5, longitudMaxima = 5)
	private String claset;
	
	/**
	 * <p>Campo <code>TCTAMAN</code>, &iacute;ndice: <code>6</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 6, nombre = "TCTAMAN", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String tctaman;
	
	/**
	 * <p>Campo <code>FECALTA</code>, &iacute;ndice: <code>7</code>, tipo: <code>FECHA</code>
	 */
	@Campo(indice = 7, nombre = "FECALTA", tipo = TipoCampo.FECHA, longitudMinima = 10, longitudMaxima = 10, formato = "dd/MM/yyyy")
	private Date fecalta;
	
	/**
	 * <p>Campo <code>FECENT</code>, &iacute;ndice: <code>8</code>, tipo: <code>FECHA</code>
	 */
	@Campo(indice = 8, nombre = "FECENT", tipo = TipoCampo.FECHA, longitudMinima = 10, longitudMaxima = 10, formato = "dd/MM/yyyy")
	private Date fecent;
	
	/**
	 * <p>Campo <code>ESTADOT</code>, &iacute;ndice: <code>9</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 9, nombre = "ESTADOT", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 16, longitudMaxima = 16)
	private String estadot;
	
	/**
	 * <p>Campo <code>SOLAUT</code>, &iacute;ndice: <code>10</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 10, nombre = "SOLAUT", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String solaut;
	
	/**
	 * <p>Campo <code>CRENVIO</code>, &iacute;ndice: <code>11</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 11, nombre = "CRENVIO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 4, longitudMaxima = 4)
	private String crenvio;
	
}