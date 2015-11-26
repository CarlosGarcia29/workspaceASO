package com.bbva.zic.proxyservicemppm.business.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbva.jee.arq.spring.core.servicing.utils.BusinessServicesToolKit;
import com.bbva.zic.proxyservicemppm.business.ISrvIntProxyServiceMPPM;
import com.bbva.zic.proxyservicemppm.business.dto.DTOIntPeticionTransaccionMPPMV01;
import com.bbva.zic.proxyservicemppm.business.dto.DTOIntRespuestaTransaccionMPPMV01;
import com.bbva.zic.proxyservicemppm.dao.mapper.MapperMppm;
import com.bbva.zic.proxyservicemppm.dao.model.mppm.TransaccionMppm;


@Service
public class SrvIntProxyServiceMPPM implements ISrvIntProxyServiceMPPM {
	
	private static Log LOG = LogFactory.getLog(SrvIntProxyServiceMPPM.class);

	@Autowired
	BusinessServicesToolKit bussinesToolKit;
	
	@Autowired
	TransaccionMppm transaccionMppm;
	
	@Autowired
	MapperMppm mapperMppm;
	
	

	@Override
	public DTOIntRespuestaTransaccionMPPMV01 proxyServiceMPPM(DTOIntPeticionTransaccionMPPMV01 dtoIntPeticionTransaccionMPPMV01) {
		LOG.info("[proxyServiceMPPM]:se invoca la transaccion MPPM");
		
//		PeticionTransaccionMppm peticionTransaccion = mapperMppm.mapToDaoRequest(dtoIntPeticionTransaccionMPPMV01);
//		
//		RespuestaTransaccionMppm respuestaTransaccion = transaccionMppm.invocar(peticionTransaccion);
//		
//		DTOIntRespuestaTransaccionMPPMV01 dtoIntRespuestaTransaccionMPPMV01 = mapperMppm.mapRequestToDao(respuestaTransaccion);
		
		DTOIntRespuestaTransaccionMPPMV01 dtoIntRespuestaTransaccionMPPMV01 = mapperMppm.mapRequestToDaoDummy(null);
		
		return dtoIntRespuestaTransaccionMPPMV01;
	}
	
}
