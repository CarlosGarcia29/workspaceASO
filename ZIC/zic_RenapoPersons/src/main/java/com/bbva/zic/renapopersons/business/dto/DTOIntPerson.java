
package com.bbva.zic.renapopersons.business.dto;

import java.util.List;



public class DTOIntPerson {

    public final static long serialVersionUID = 1L;
    private String lastName;
    private String motherLastName;
    private String name;
    private String birthDate;
    private DTOIntCountry country;
    private DTOIntPersonExtendedData extendedData;
    private List<DTOIntIdentityDocument> identityDocument;

    public DTOIntPerson() {
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

    public DTOIntCountry getCountry() {
        return country;
    }

    public void setCountry(DTOIntCountry country) {
        this.country = country;
    }

    public DTOIntPersonExtendedData getExtendedData() {
        return extendedData;
    }

    public void setExtendedData(DTOIntPersonExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    public List<DTOIntIdentityDocument> getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(List<DTOIntIdentityDocument> identityDocument) {
        this.identityDocument = identityDocument;
    }

}
