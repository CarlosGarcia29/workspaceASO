package com.bbva.zic.accountsv02.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.bbva.jee.arq.spring.core.servicing.utils.BusinessServicesToolKit;
import com.bbva.zic.accountsv02.business.dto.DTOIntAccount;
import com.bbva.zic.accountsv02.business.utils.Constant;
import com.bbva.zic.accountsv02.dao.mapper.MapperB000;
import com.bbva.zic.accountsv02.dao.mapper.MapperB402;
import com.bbva.zic.accountsv02.dao.mapper.MapperB431;
import com.bbva.zic.accountsv02.dao.model.b000.PeticionTransaccionB000;
import com.bbva.zic.accountsv02.dao.model.b000.RespuestaTransaccionB000;
import com.bbva.zic.accountsv02.dao.model.b000.TransaccionB000;
import com.bbva.zic.accountsv02.dao.model.b402.PeticionTransaccionB402;
import com.bbva.zic.accountsv02.dao.model.b402.RespuestaTransaccionB402;
import com.bbva.zic.accountsv02.dao.model.b402.TransaccionB402;
import com.bbva.zic.accountsv02.dao.model.b431.PeticionTransaccionB431;
import com.bbva.zic.accountsv02.dao.model.b431.RespuestaTransaccionB431;
import com.bbva.zic.accountsv02.dao.model.b431.TransaccionB431;
import com.bbva.zic.accountsv02.business.ISrvIntAccountsV02;


@Service
public class SrvIntAccountsV02 implements ISrvIntAccountsV02 {
	
	private static final Log LOG = LogFactory.getLog(SrvIntAccountsV02.class);

	@Autowired
	public BusinessServicesToolKit bussinesToolKit;
	
	@Autowired
	private TransaccionB402 transacctionB402;
	
	@Autowired
	private TransaccionB431 transacctionB431;
	
	@Autowired
	private TransaccionB000 transaccionB000;
	
	@Autowired
	private MapperB402 mapperB402;
	
	@Autowired
	private MapperB431 mapperB431;
	
	@Autowired
	private MapperB000 mapperB000;
	
	
	@Override
	public DTOIntAccount getAccount(String accountId, String fields) {
		
		LOG.info("[SrvIntAccounts]: Se llama al metodo de capa interna getAccount");
		
		
		PeticionTransaccionB402 peticionP402 = mapperB402.mapToDaoRequest(accountId, fields);
		RespuestaTransaccionB402 respuestaB402 = transacctionB402.invocar(peticionP402);
		DTOIntAccount account = mapperB402.mapToBussinessResponse(respuestaB402, accountId);
		
		if(fields != null){
			
			if(fields.contains(Constant.FIELDS_HAS_CHEQUE_BOOKS)){		
				PeticionTransaccionB431 peticionB431 = mapperB431.mapToDaoRequest(accountId);
				RespuestaTransaccionB431 respuestaB431 = transacctionB431.invocar(peticionB431);
				mapperB431.mapToBussinessResponse(respuestaB431, account);
				
			}
			
		}
		
		return account;
	}


	@Override
	public DTOIntAccount prospectAccountNumber(DTOIntAccount dtoIntAccount) {
		LOG.info("[SrvAccountV02]:se invoca la transaccion b000");
		
		PeticionTransaccionB000 peticionTransaccion = mapperB000.mapToDaoRequest(dtoIntAccount);
		RespuestaTransaccionB000 respuestaTransaccion = transaccionB000.invocar(peticionTransaccion);
		dtoIntAccount = mapperB000.mapFormatoBGM0001(respuestaTransaccion);
		return dtoIntAccount;
	}

	

}
