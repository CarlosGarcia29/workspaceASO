
package com.bbva.zic.renapopersons.business.dto;




public class DTOIntPersonExtendedData {

    public final static long serialVersionUID = 1L;
    private String birthPlace;
    private String sex;

    public DTOIntPersonExtendedData() {
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
