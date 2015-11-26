package com.bbva.zic.accountsv02.facade.v02.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "Branch", namespace = "urn:com:bbva:zic:accountsv02:facade:v02:dto")
@XmlType(name = "Branch", namespace = "urn:com:bbva:zic:accountsv02:facade:v02:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Branch implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty("Código identificativo de la oficina")
	private String id;
	@ApiModelProperty("Banco")
	private Bank bank;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
}
