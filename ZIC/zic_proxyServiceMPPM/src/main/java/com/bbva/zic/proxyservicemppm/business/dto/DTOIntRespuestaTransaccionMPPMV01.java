
package com.bbva.zic.proxyservicemppm.business.dto;

public class DTOIntRespuestaTransaccionMPPMV01 {

    public final static long serialVersionUID = 1L;
    
    private String clientNumber;
    
    private String accountNumber;

    private String cardNumber;

    public DTOIntRespuestaTransaccionMPPMV01() {
        //default constructor
    }

	public String getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(String clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
}
