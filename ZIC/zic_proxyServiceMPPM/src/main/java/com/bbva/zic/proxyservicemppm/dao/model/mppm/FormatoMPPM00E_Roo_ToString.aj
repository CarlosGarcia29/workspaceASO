// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.bbva.zic.proxyservicemppm.dao.model.mppm;

import java.lang.String;

privileged aspect FormatoMPPM00E_Roo_ToString {
    
    public String FormatoMPPM00E.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numclie: ").append(getNumclie()).append(", ");
        sb.append("Numcta: ").append(getNumcta()).append(", ");
        sb.append("Numtara: ").append(getNumtara()).append(", ");
        sb.append("Opcion: ").append(getOpcion()).append(", ");
        sb.append("Tarant: ").append(getTarant());
        return sb.toString();
    }
    
}
