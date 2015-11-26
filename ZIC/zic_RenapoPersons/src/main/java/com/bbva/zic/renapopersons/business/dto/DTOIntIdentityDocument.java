
package com.bbva.zic.renapopersons.business.dto;




public class DTOIntIdentityDocument {

    public final static long serialVersionUID = 1L;
    private String number;
    private DTOIntOptionList status;
    private DTOIntOptionList type;

    public DTOIntIdentityDocument() {
        //default constructor
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public DTOIntOptionList getStatus() {
        return status;
    }

    public void setStatus(DTOIntOptionList status) {
        this.status = status;
    }

    public DTOIntOptionList getType() {
        return type;
    }

    public void setType(DTOIntOptionList type) {
        this.type = type;
    }

}
