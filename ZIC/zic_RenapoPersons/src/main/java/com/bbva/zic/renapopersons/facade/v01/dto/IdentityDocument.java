
package com.bbva.zic.renapopersons.facade.v01.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "IdentityDocument", namespace = "urn:com:bbva:zic:renapopersons:facade:v01:dto")
@XmlType(name = "IdentityDocument", namespace = "urn:com:bbva:zic:renapopersons:facade:v01:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class IdentityDocument
    implements Serializable
{

    public final static long serialVersionUID = 1L;
    @ApiModelProperty("Codigo asignado al documento")
    private String number;
    @ApiModelProperty("estatus del documento")
    private OptionList status;
    @ApiModelProperty("Codigo que identifica al elemento del listado")
    private OptionList type;

    public IdentityDocument() {
        //default constructor
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public OptionList getStatus() {
        return status;
    }

    public void setStatus(OptionList status) {
        this.status = status;
    }

    public OptionList getType() {
        return type;
    }

    public void setType(OptionList type) {
        this.type = type;
    }

}
