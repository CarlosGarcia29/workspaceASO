
package com.bbva.zic.proxyservicemppm.facade.v01.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.wordnik.swagger.annotations.ApiModelProperty;



@XmlRootElement(name = "RespuestaTransaccionMPPMV01", namespace = "urn:com:bbva:zic:proxyservicemppm:facade:v01:dto")
@XmlType(name = "RespuestaTransaccionMPPMV01", namespace = "urn:com:bbva:zic:proxyservicemppm:facade:v01:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaTransaccionMPPMV01
    implements Serializable
{

    public final static long serialVersionUID = 1L;
    @ApiModelProperty("N\u00famero de cliente")
    private String clientNumber;
    
    @ApiModelProperty("N\u00famero de cuenta")
    private String accountNumber;

    @ApiModelProperty("N\u00famero de tarjeta")
    private String cardNumber;
    
    public RespuestaTransaccionMPPMV01() {
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
