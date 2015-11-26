package com.bbva.zic.renapopersons.business.ws.response;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CURPStruct")
public class CurpResponse {

	private String statusOper;
	private String message;
	private String tipoError;
	private String codigoError;
	private String sessionID;

	private String CURP;
	private String apellido1;
	private String apellido2;
	private String nombres;
	private String sexo;
	private String fechNac;
	private String nacionalidad;
	private String docProbatorio;
	private String anioReg;
	private String foja;
	private String tomo;
	private String libro;
	private String numActa;
	private String CRIP;
	private String numEntidadReg;
	private String cveMunicipioReg;
	private String numRegExtranjeros;
	private String folioCarta;
	private String cveEntidadNac;
	private String cveEntidadEmisora;
	private String statusCurp;
	private String curpHistoricas;

	/**
	 * @return the statusOper
	 */
	@XmlAttribute
	public final String getStatusOper() {
		return statusOper;
	}

	/**
	 * @param statusOper
	 *            the statusOper to set
	 */
	public final void setStatusOper(final String statusOper) {
		this.statusOper = statusOper;
	}

	/**
	 * @return the message
	 */
	@XmlAttribute
	public final String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public final void setMessage(final String message) {
		this.message = message;
	}

	/**
	 * @return the tipoError
	 */
	@XmlAttribute
	public final String getTipoError() {
		return tipoError;
	}

	/**
	 * @param tipoError
	 *            the tipoError to set
	 */
	public final void setTipoError(final String tipoError) {
		this.tipoError = tipoError;
	}

	/**
	 * @return the codigoError
	 */
	@XmlAttribute
	public final String getCodigoError() {
		return codigoError;
	}

	/**
	 * @param codigoError
	 *            the codigoError to set
	 */
	public final void setCodigoError(final String codigoError) {
		this.codigoError = codigoError;
	}

	/**
	 * @return the sessionID
	 */
	@XmlAttribute
	public final String getSessionID() {
		return sessionID;
	}

	/**
	 * @param sessionID
	 *            the sessionID to set
	 */
	public final void setSessionID(final String sessionID) {
		this.sessionID = sessionID;
	}

	/**
	 * @return the cURP
	 */
	@XmlElement
	public final String getCURP() {
		return CURP;
	}

	/**
	 * @param cURP
	 *            the cURP to set
	 */
	public final void setCURP(final String cURP) {
		CURP = cURP;
	}

	/**
	 * @return the apellido1
	 */
	@XmlElement
	public final String getApellido1() {
		return apellido1;
	}

	/**
	 * @param apellido1
	 *            the apellido1 to set
	 */
	public final void setApellido1(final String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * @return the apellido2
	 */
	@XmlElement
	public final String getApellido2() {
		return apellido2;
	}

	/**
	 * @param apellido2
	 *            the apellido2 to set
	 */
	public final void setApellido2(final String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * @return the nombres
	 */
	@XmlElement
	public final String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres
	 *            the nombres to set
	 */
	public final void setNombres(final String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the sexo
	 */
	@XmlElement
	public final String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo
	 *            the sexo to set
	 */
	public final void setSexo(final String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the fechNac
	 */
	@XmlElement
	public final String getFechNac() {
		return fechNac;
	}

	/**
	 * @param fechNac
	 *            the fechNac to set
	 */
	public final void setFechNac(final String fechNac) {
		this.fechNac = fechNac;
	}

	/**
	 * @return the nacionalidad
	 */
	@XmlElement
	public final String getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * @param nacionalidad
	 *            the nacionalidad to set
	 */
	public final void setNacionalidad(final String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	 * @return the docProbatorio
	 */
	@XmlElement
	public final String getDocProbatorio() {
		return docProbatorio;
	}

	/**
	 * @param docProbatorio
	 *            the docProbatorio to set
	 */
	public final void setDocProbatorio(final String docProbatorio) {
		this.docProbatorio = docProbatorio;
	}

	/**
	 * @return the anioReg
	 */
	@XmlElement
	public final String getAnioReg() {
		return anioReg;
	}

	/**
	 * @param anioReg
	 *            the anioReg to set
	 */
	public final void setAnioReg(final String anioReg) {
		this.anioReg = anioReg;
	}

	/**
	 * @return the foja
	 */
	@XmlElement
	public final String getFoja() {
		return foja;
	}

	/**
	 * @param foja
	 *            the foja to set
	 */
	public final void setFoja(final String foja) {
		this.foja = foja;
	}

	/**
	 * @return the tomo
	 */
	@XmlElement
	public final String getTomo() {
		return tomo;
	}

	/**
	 * @param tomo
	 *            the tomo to set
	 */
	public final void setTomo(final String tomo) {
		this.tomo = tomo;
	}

	/**
	 * @return the libro
	 */
	@XmlElement
	public final String getLibro() {
		return libro;
	}

	/**
	 * @param libro
	 *            the libro to set
	 */
	public final void setLibro(final String libro) {
		this.libro = libro;
	}

	/**
	 * @return the numActa
	 */
	@XmlElement
	public final String getNumActa() {
		return numActa;
	}

	/**
	 * @param numActa
	 *            the numActa to set
	 */
	public final void setNumActa(final String numActa) {
		this.numActa = numActa;
	}

	/**
	 * @return the cRIP
	 */
	@XmlElement
	public final String getCRIP() {
		return CRIP;
	}

	/**
	 * @param cRIP
	 *            the cRIP to set
	 */
	public final void setCRIP(final String cRIP) {
		CRIP = cRIP;
	}

	/**
	 * @return the numEntidadReg
	 */
	@XmlElement
	public final String getNumEntidadReg() {
		return numEntidadReg;
	}

	/**
	 * @param numEntidadReg
	 *            the numEntidadReg to set
	 */
	public final void setNumEntidadReg(final String numEntidadReg) {
		this.numEntidadReg = numEntidadReg;
	}

	/**
	 * @return the cveMunicipioReg
	 */
	@XmlElement
	public final String getCveMunicipioReg() {
		return cveMunicipioReg;
	}

	/**
	 * @param cveMunicipioReg
	 *            the cveMunicipioReg to set
	 */
	public final void setCveMunicipioReg(final String cveMunicipioReg) {
		this.cveMunicipioReg = cveMunicipioReg;
	}

	/**
	 * @return the numRegExtranjeros
	 */
	@XmlElement
	public final String getNumRegExtranjeros() {
		return numRegExtranjeros;
	}

	/**
	 * @param numRegExtranjeros
	 *            the numRegExtranjeros to set
	 */
	public final void setNumRegExtranjeros(final String numRegExtranjeros) {
		this.numRegExtranjeros = numRegExtranjeros;
	}

	/**
	 * @return the folioCarta
	 */
	@XmlElement
	public final String getFolioCarta() {
		return folioCarta;
	}

	/**
	 * @param folioCarta
	 *            the folioCarta to set
	 */
	public final void setFolioCarta(final String folioCarta) {
		this.folioCarta = folioCarta;
	}

	/**
	 * @return the cveEntidadNac
	 */
	@XmlElement
	public final String getCveEntidadNac() {
		return cveEntidadNac;
	}

	/**
	 * @param cveEntidadNac
	 *            the cveEntidadNac to set
	 */
	public final void setCveEntidadNac(final String cveEntidadNac) {
		this.cveEntidadNac = cveEntidadNac;
	}

	/**
	 * @return the cveEntidadEmisora
	 */
	@XmlElement
	public final String getCveEntidadEmisora() {
		return cveEntidadEmisora;
	}

	/**
	 * @param cveEntidadEmisora
	 *            the cveEntidadEmisora to set
	 */
	public final void setCveEntidadEmisora(final String cveEntidadEmisora) {
		this.cveEntidadEmisora = cveEntidadEmisora;
	}

	/**
	 * @return the statusCurp
	 */
	@XmlElement
	public final String getStatusCurp() {
		return statusCurp;
	}

	/**
	 * @param statusCurp
	 *            the statusCurp to set
	 */
	public final void setStatusCurp(final String statusCurp) {
		this.statusCurp = statusCurp;
	}

	/**
	 * @return the curpHistoricas
	 */
	@XmlElement
	public final String getCurpHistoricas() {
		return curpHistoricas;
	}

	/**
	 * @param curpHistoricas
	 *            the curpHistoricas to set
	 */
	public final void setCurpHistoricas(final String curpHistoricas) {
		this.curpHistoricas = curpHistoricas;
	}

}
