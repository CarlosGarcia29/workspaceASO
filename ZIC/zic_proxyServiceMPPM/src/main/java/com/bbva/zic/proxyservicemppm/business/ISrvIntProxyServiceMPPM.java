package com.bbva.zic.proxyservicemppm.business;

import com.bbva.zic.proxyservicemppm.business.dto.DTOIntPeticionTransaccionMPPMV01;
import com.bbva.zic.proxyservicemppm.business.dto.DTOIntRespuestaTransaccionMPPMV01;



public interface ISrvIntProxyServiceMPPM {
	
 	public DTOIntRespuestaTransaccionMPPMV01 proxyServiceMPPM(DTOIntPeticionTransaccionMPPMV01 dtoIntPeticionTransaccionMPPMV01);

	
}