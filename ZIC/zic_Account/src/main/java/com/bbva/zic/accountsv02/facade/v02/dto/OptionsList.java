package com.bbva.zic.accountsv02.facade.v02.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "OptionsList", namespace = "urn:com:bbva:zic:accountsv02:facade:v02:dto")
@XmlType(name = "OptionsList", namespace = "urn:com:bbva:zic:accountsv02:facade:v02:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class OptionsList implements Serializable {
private static final long serialVersionUID = 1L;

	
	@ApiModelProperty("Codigo que identifica al elemento del listado")
	private String id;
	
	@ApiModelProperty("Nombre del elemento del listado")
	private String name;
	
	@ApiModelProperty("Referencia al listado completo")
	private String href;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}	

}
