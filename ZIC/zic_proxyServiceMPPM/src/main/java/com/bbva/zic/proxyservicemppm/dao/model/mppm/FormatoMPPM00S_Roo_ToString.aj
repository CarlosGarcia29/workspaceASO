// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.bbva.zic.proxyservicemppm.dao.model.mppm;

import java.lang.String;

privileged aspect FormatoMPPM00S_Roo_ToString {
    
    public String FormatoMPPM00S.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numclie: ").append(getNumclie()).append(", ");
        sb.append("Numcta: ").append(getNumcta()).append(", ");
        sb.append("Numtara: ").append(getNumtara());
        return sb.toString();
    }
    
}
