
package com.bbva.zic.renapopersons.facade.v01.dto;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "Person", namespace = "urn:com:bbva:zic:renapopersons:facade:v01:dto")
@XmlType(name = "Person", namespace = "urn:com:bbva:zic:renapopersons:facade:v01:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person
    implements Serializable
{

    public final static long serialVersionUID = 1L;
    @ApiModelProperty("apellido paterno")
    private String lastName;
    @ApiModelProperty("apellido materno")
    private String motherLastName;
    @ApiModelProperty("nombre o nombres")
    private String name;
    @ApiModelProperty("fecha de nacimiento")
    private String birthDate;
    @ApiModelProperty("clave de la nacionalidad")
    private Country country;
    @ApiModelProperty("datos extendidos")
    private PersonExtendedData extendedData;
    @ApiModelProperty("datos extendidos")
    private List<IdentityDocument> identityDocument;

    public Person() {
        //default constructor
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public PersonExtendedData getExtendedData() {
        return extendedData;
    }

    public void setExtendedData(PersonExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    public List<IdentityDocument> getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(List<IdentityDocument> identityDocument) {
        this.identityDocument = identityDocument;
    }

}
