package com.bbva.zic.proxyservicemppm.dao.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bbva.jee.arq.spring.core.host.protocolo.ps9.ErrorMappingHelper;
import com.bbva.jee.arq.spring.core.host.protocolo.ps9.aplicacion.CopySalida;
import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.bbva.zic.proxyservicemppm.business.dto.DTOIntPeticionTransaccionMPPMV01;
import com.bbva.zic.proxyservicemppm.business.dto.DTOIntRespuestaTransaccionMPPMV01;
import com.bbva.zic.proxyservicemppm.dao.model.mppm.FormatoMPPM00E;
import com.bbva.zic.proxyservicemppm.dao.model.mppm.FormatoMPPM00S;
import com.bbva.zic.proxyservicemppm.dao.model.mppm.PeticionTransaccionMppm;
import com.bbva.zic.proxyservicemppm.dao.model.mppm.RespuestaTransaccionMppm;

@Component
public class MapperMppm {
	
	private static final Log LOG = LogFactory.getLog(MapperMppm.class);
	
	@Autowired
	private ErrorMappingHelper errorMappingHelper;

	public PeticionTransaccionMppm mapToDaoRequest(DTOIntPeticionTransaccionMPPMV01 dtoIntPeticionTransaccionMPPMV01) {
		PeticionTransaccionMppm peticionTransaccionMppm = new PeticionTransaccionMppm();

		FormatoMPPM00E formato = new FormatoMPPM00E();
		formato.setNumclie(this.getValue(dtoIntPeticionTransaccionMPPMV01.getClientNumber()));
		formato.setNumcta(this.getValue(dtoIntPeticionTransaccionMPPMV01.getAccountNumber()));
		formato.setNumtara(this.getValue(dtoIntPeticionTransaccionMPPMV01.getCardNumberAssign()));
		formato.setOpcion(this.getValue(dtoIntPeticionTransaccionMPPMV01.getOption()));
		formato.setTarant(this.getValue(dtoIntPeticionTransaccionMPPMV01.getLastCardNumber()));
		
		peticionTransaccionMppm.getCuerpo().getPartes().add(formato);

		return peticionTransaccionMppm;
	}
	
	public DTOIntRespuestaTransaccionMPPMV01 mapRequestToDao(RespuestaTransaccionMppm respuestaTransaccion){
		LOG.info("[RespuestaDAO: " + respuestaTransaccion + "]");
		
		BusinessServiceException businessServiceException = errorMappingHelper
				.toBusinessServiceException(respuestaTransaccion);
		if (businessServiceException != null) {
			throw businessServiceException;
		}
		
		DTOIntRespuestaTransaccionMPPMV01 dtoRespuesta = new DTOIntRespuestaTransaccionMPPMV01();
		
		CopySalida copySalida = respuestaTransaccion.getCuerpo().getParte(CopySalida.class);
		
		if (copySalida != null) {
			FormatoMPPM00S formatoSalida = copySalida.getCopy(FormatoMPPM00S.class);
			
			if (formatoSalida != null) {
				
				dtoRespuesta.setAccountNumber(formatoSalida.getNumcta());
				dtoRespuesta.setCardNumber(formatoSalida.getNumtara());
				dtoRespuesta.setClientNumber(formatoSalida.getNumclie());
				
			}
		}
		
		LOG.info("[RespuestaBusiness]: " + dtoRespuesta);
		
		return dtoRespuesta;
	}
	
	public DTOIntRespuestaTransaccionMPPMV01 mapRequestToDaoDummy(RespuestaTransaccionMppm respuestaTransaccion){
		LOG.info("[RespuestaDAO: Dummy ]");
		
		
		DTOIntRespuestaTransaccionMPPMV01 dtoRespuesta = new DTOIntRespuestaTransaccionMPPMV01();
				
		dtoRespuesta.setAccountNumber("123456789");
		dtoRespuesta.setCardNumber("987654321");
		dtoRespuesta.setClientNumber("91827364");
				
		LOG.info("[RespuestaBusiness]: " + dtoRespuesta);
		
		return dtoRespuesta;
	}

	public String getValue(String string) {

		if (string == null || string.isEmpty()) {
			
			return null;

		}
		
		return string;
	}
}
