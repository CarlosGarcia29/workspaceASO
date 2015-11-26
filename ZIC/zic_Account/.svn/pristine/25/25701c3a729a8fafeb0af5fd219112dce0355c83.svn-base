package com.bbva.zic.accountsv02.facade.v02.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "Money", namespace = "urn:com:bbva:zic:accountsv02:facade:v02:dto")
@XmlType(name = "Money", namespace = "urn:com:bbva:zic:accountsv02:facade:v02:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Money implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@ApiModelProperty("Importe monetario")
	private String amount;
	
	@ApiModelProperty("Entidad divisa relacionada con el importe ISO 4217")
	private Currency currency;

	
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}	

}
