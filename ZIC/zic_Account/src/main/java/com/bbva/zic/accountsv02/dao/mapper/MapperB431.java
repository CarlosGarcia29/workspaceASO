package com.bbva.zic.accountsv02.dao.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bbva.jee.arq.spring.core.host.protocolo.ps9.ErrorMappingHelper;
import com.bbva.jee.arq.spring.core.host.protocolo.ps9.aplicacion.CopySalida;
import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.bbva.zic.accountsv02.business.dto.DTOIntAccount;
import com.bbva.zic.accountsv02.business.utils.Constant;
import com.bbva.zic.accountsv02.dao.model.b431.FormatoBGM431;
import com.bbva.zic.accountsv02.dao.model.b431.FormatoBGMLI02;
import com.bbva.zic.accountsv02.dao.model.b431.PeticionTransaccionB431;
import com.bbva.zic.accountsv02.dao.model.b431.RespuestaTransaccionB431;

@Component
public class MapperB431 {
	
	private static final Log LOG = LogFactory.getLog(MapperB431.class);
	
	@Autowired
	private ErrorMappingHelper errorMappingHelper;
	
	public PeticionTransaccionB431 mapToDaoRequest(String accountId){
		
		PeticionTransaccionB431 peticionB431 = new PeticionTransaccionB431();
		FormatoBGM431 formatoB431 = new FormatoBGM431();
		
		formatoB431.setCcc(accountId);
		
		peticionB431.getCuerpo().getPartes().add(formatoB431);
		
		return peticionB431;
	}
	
	public DTOIntAccount mapToBussinessResponse(RespuestaTransaccionB431 respuestaB431, DTOIntAccount account ){
		
		LOG.info("[RespuestaDAO]: " + respuestaB431);
		
		BusinessServiceException businessServiceException = errorMappingHelper.toBusinessServiceException(respuestaB431);

		if (businessServiceException != null) {
			throw businessServiceException;
		
		}
		
		CopySalida copySalida = respuestaB431.getCuerpo().getParte(CopySalida.class);	
		
		if (copySalida != null) {
			FormatoBGMLI02 formatoI02 = copySalida.getCopy(FormatoBGMLI02.class);
			
			if (formatoI02 != null) {
				if(formatoI02.getIndnota().equals(Constant.BOOLEAN_TRUE)){
					account.setHasCheckBooks(Boolean.TRUE);
				}else{
					account.setHasCheckBooks(Boolean.FALSE);
				}
				
			}else{
				account.setHasCheckBooks(Boolean.FALSE);
			}
		}else{
			account.setHasCheckBooks(Boolean.FALSE);
		}			
		
		LOG.info("[RespuestaBusiness]: " + account);
		
		return account;
	}
}
