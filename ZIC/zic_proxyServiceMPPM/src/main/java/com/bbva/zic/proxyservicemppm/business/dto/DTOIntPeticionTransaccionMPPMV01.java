
package com.bbva.zic.proxyservicemppm.business.dto;

public class DTOIntPeticionTransaccionMPPMV01 {

    public final static long serialVersionUID = 1L;
    
    private String clientNumber;

    private String accountNumber;
    
    private String cardNumberAssign;
    
    private String lastCardNumber;
    
    private String option;

    public DTOIntPeticionTransaccionMPPMV01() {
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

	public String getCardNumberAssign() {
		return cardNumberAssign;
	}

	public void setCardNumberAssign(String cardNumberAssign) {
		this.cardNumberAssign = cardNumberAssign;
	}

	public String getLastCardNumber() {
		return lastCardNumber;
	}

	public void setLastCardNumber(String lastCardNumber) {
		this.lastCardNumber = lastCardNumber;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}    
}
