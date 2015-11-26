package com.bbva.zic.accountsv02.facade.v02.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "ContractFormat", namespace = "urn:com:bbva:zic:accountsv02:facade:v02:dto")
@XmlType(name = "ContractFormat", namespace = "urn:com:bbva:zic:accountsv02:facade:v02:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class ContractFormat {


public final static long serialVersionUID = 1L;
	
	
	@ApiModelProperty("Número de contrato de tipo CCC")
	private String ccc;
	
	@ApiModelProperty("CLABE")
	private String CLABE;

	
	public String getCcc() {
		return ccc;
	}
	public void setCcc(String ccc) {
		this.ccc = ccc;
	}

	public String getCABLE() {
		return CLABE;
	}
	public void setCABLE(String cLABE) {
		CLABE = cLABE;
	}	

}
