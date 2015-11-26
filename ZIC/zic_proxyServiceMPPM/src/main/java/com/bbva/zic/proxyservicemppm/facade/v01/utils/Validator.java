package com.bbva.zic.proxyservicemppm.facade.v01.utils;

import org.springframework.stereotype.Component;

import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.bbva.zic.proxyservicemppm.business.utils.Constant;
import com.bbva.zic.proxyservicemppm.facade.v01.dto.PeticionTransaccionMPPMV01;

@Component
public class Validator {

	public void isNull(Object object) {

		if (object == null) {
			this.throwWrongParameters();

		}
	}

	public void throwWrongParameters() {

		throw new BusinessServiceException(Constant.ERROR_WRONG_PARAMETERS);

	}

	public void checkPostProxyServiceMPPM(PeticionTransaccionMPPMV01 peticionTransaccionMPPMV01) {

		this.isNull(peticionTransaccionMPPMV01);
	}

}
