
package com.bbva.zic.proxyservicemppm.facade.v01.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.wordnik.swagger.annotations.ApiModelProperty;



@XmlRootElement(name = "PeticionTransaccionMPPMV01", namespace = "urn:com:bbva:zic:proxyservicemppm:facade:v01:dto")
@XmlType(name = "PeticionTransaccionMPPMV01", namespace = "urn:com:bbva:zic:proxyservicemppm:facade:v01:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class PeticionTransaccionMPPMV01
    implements Serializable
{

    public final static long serialVersionUID = 1L;
    @ApiModelProperty("N\u00famero de cliente")
    private String clientNumber;

    @ApiModelProperty("N\u00famero de cuenta")
    private String accountNumber;
    
    @ApiModelProperty("N\u00famero de tarjeta a asignar")
    private String cardNumberAssign;
    
    @ApiModelProperty("N\u00famero de tarjeta a anterior")
    private String lastCardNumber;
    
    @ApiModelProperty("Opcion")
    private String option;
    
    public PeticionTransaccionMPPMV01() {
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
