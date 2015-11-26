
package com.bbva.zic.renapopersons.facade.v01.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "PersonExtendedData", namespace = "urn:com:bbva:zic:renapopersons:facade:v01:dto")
@XmlType(name = "PersonExtendedData", namespace = "urn:com:bbva:zic:renapopersons:facade:v01:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonExtendedData
    implements Serializable
{

    public final static long serialVersionUID = 1L;
    @ApiModelProperty("clave de la entidad federativa de nacimiento")
    private String birthPlace;
    @ApiModelProperty("sexo de la persona")
    private String sex;

    public PersonExtendedData() {
        //default constructor
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
