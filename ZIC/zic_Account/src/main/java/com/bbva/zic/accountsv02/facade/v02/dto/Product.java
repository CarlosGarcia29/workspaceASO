package com.bbva.zic.accountsv02.facade.v02.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "Product", namespace = "urn:com:bbva:zic:accountsv02:facade:v02:dto")
@XmlType(name = "Product", namespace = "urn:com:bbva:zic:accountsv02:facade:v02:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	
	@ApiModelProperty("Codigo identificador del producto")
	private String id;


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}  

}
