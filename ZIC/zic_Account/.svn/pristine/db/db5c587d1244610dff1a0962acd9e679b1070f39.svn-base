package com.bbva.zic.accountsv02.facade.v02.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "Currency", namespace = "urn:com:bbva:zic:accountsv02:facade:v02:dto")
@XmlType(name = "Currency", namespace = "urn:com:bbva:zic:accountsv02:facade:v02:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Currency implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	
	@ApiModelProperty("Código ISO alfabético de la divisa. En concreto es el ISO 4217.")
	private String id;
	
	@ApiModelProperty("Código ISO numérico de la divisa. En concreto es el ISO 4217.")
	private String code;
	
	@ApiModelProperty("Nombre de la divisa como podría ser euro, dólar australiano, etcétera.")
	private String name;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
