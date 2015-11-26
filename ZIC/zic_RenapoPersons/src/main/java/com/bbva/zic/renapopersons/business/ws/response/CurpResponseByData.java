package com.bbva.zic.renapopersons.business.ws.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CURPCollection")
public class CurpResponseByData {

	private String statusOper;
	private String message;
	private String tipoError;
	private String codigoError;
	private String sessionID;
	
	List<CurpResponse> curpResponse;

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

	@XmlElement(name = "CURPStruct")
	public List<CurpResponse> getCurpResponse() {
		return curpResponse;
	}

	public void setCurpResponse(List<CurpResponse> curpResponse) {
		this.curpResponse = curpResponse;
	}
	
}
