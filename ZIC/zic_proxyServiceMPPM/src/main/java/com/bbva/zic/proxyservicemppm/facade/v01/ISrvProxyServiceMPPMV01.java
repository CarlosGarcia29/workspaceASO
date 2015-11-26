package com.bbva.zic.proxyservicemppm.facade.v01;

import com.bbva.zic.proxyservicemppm.facade.v01.dto.PeticionTransaccionMPPMV01;
import com.bbva.zic.proxyservicemppm.facade.v01.dto.RespuestaTransaccionMPPMV01;


public interface ISrvProxyServiceMPPMV01 {
 	
	public RespuestaTransaccionMPPMV01 proxyServiceMPPM(PeticionTransaccionMPPMV01 peticionTransaccionMPPMV01);

	
}