
package com.bbva.zic.accountsv02.dao.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bbva.jee.arq.spring.core.host.protocolo.ps9.ErrorMappingHelper;
import com.bbva.jee.arq.spring.core.host.protocolo.ps9.aplicacion.CopySalida;
import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.bbva.zic.accountsv02.business.dto.DTOIntAccount;
import com.bbva.zic.accountsv02.business.dto.DTOIntAccountBlocking;
import com.bbva.zic.accountsv02.business.dto.DTOIntBranch;
import com.bbva.zic.accountsv02.business.dto.DTOIntContractBlock;
import com.bbva.zic.accountsv02.business.dto.DTOIntContractFormat;
import com.bbva.zic.accountsv02.business.dto.DTOIntCurrency;
import com.bbva.zic.accountsv02.business.dto.DTOIntMoney;
import com.bbva.zic.accountsv02.business.dto.DTOIntOptionsList;
import com.bbva.zic.accountsv02.business.dto.DTOIntProduct;
import com.bbva.zic.accountsv02.business.utils.Constant;
import com.bbva.zic.accountsv02.dao.model.b402.FormatoBGM402;
import com.bbva.zic.accountsv02.dao.model.b402.FormatoBGM4026;
import com.bbva.zic.accountsv02.dao.model.b402.FormatoBGM402A;
import com.bbva.zic.accountsv02.dao.model.b402.FormatoBGM402B;
import com.bbva.zic.accountsv02.dao.model.b402.PeticionTransaccionB402;
import com.bbva.zic.accountsv02.dao.model.b402.RespuestaTransaccionB402;


@Component
public class MapperB402 {
	
	private static final Log LOG = LogFactory.getLog(MapperB402.class);
	
	@Autowired
	private ErrorMappingHelper errorMappingHelper;
	
	public PeticionTransaccionB402 mapToDaoRequest(String acountId, String fields) {
		
		PeticionTransaccionB402 peticionB402 = new PeticionTransaccionB402();
		FormatoBGM402 formato01 = new FormatoBGM402();
		
		formato01.setCcc(acountId);
		
				
		peticionB402.getCuerpo().getPartes().add(formato01);
		
		return peticionB402;
	}
	
	public DTOIntAccount mapToBussinessResponse(RespuestaTransaccionB402 respuestaTransaccionB402, String accountId) {
		
		LOG.info("[RespuestaDAO]: " + respuestaTransaccionB402);
		
		BusinessServiceException businessServiceException = errorMappingHelper.toBusinessServiceException(respuestaTransaccionB402);

		if (businessServiceException != null) {
			throw businessServiceException;
		
		}	
		
		DTOIntAccount account = new DTOIntAccount();					
		List<CopySalida> copySalidaList = respuestaTransaccionB402.getCuerpo().getPartes(CopySalida.class);
		LOG.info("[copySalidaList]: " + copySalidaList);
		FormatoBGM402A formato402A = null;
		FormatoBGM402B formato402B = null;
		FormatoBGM4026 formato4026 = null;
		
		LOG.info("[copySalidaList]: antes del if" );
		if (copySalidaList != null) {
			LOG.info("[copySalidaList]: despues del if" );
			LOG.info("[copySalidaList]: ANtes del for" );
			for (CopySalida copySalida : copySalidaList) {
				LOG.info("[copySalidaList]: despues del FOR" );
				if(copySalida.getCopy(FormatoBGM402A.class) != null){
					formato402A = copySalida.getCopy(FormatoBGM402A.class);
				}
				if(copySalida.getCopy(FormatoBGM402B.class) != null){
					formato402B = copySalida.getCopy(FormatoBGM402B.class);
				}
				if(copySalida.getCopy(FormatoBGM4026.class) != null){
					formato4026 = copySalida.getCopy(FormatoBGM4026.class);
					LOG.info("[formato4026]: " + formato4026);
				}
				
			}
		}
		
		LOG.info("[formato402A]: " + formato402A);
		LOG.info("[formato402A]: " + formato402B);
		LOG.info("[RespuestaBusiness]: antes de formato402A" + account);
		account = this.mapFormatoBGM402A(account, formato402A, accountId);
		LOG.info("[RespuestaBusiness]: antes de formato402B" + account);
		account = this.mapFormatoBGM402B(account, formato402B);
		
		if(formato4026 != null){
		
			DTOIntOptionsList type = new DTOIntOptionsList();
			DTOIntAccountBlocking blocking = new DTOIntAccountBlocking();
			List<DTOIntAccountBlocking> listBlocking = new ArrayList<DTOIntAccountBlocking>();
			
			if (formato4026.getCond23() != null) {
				if (formato4026.getCond23().equals("S")) {
					type.setId(Constant.OPTIONSLIST_TYPE_ID);
					type.setName(Constant.OPTIONSLIST_TYPE_NAME);  //preguntar este que hacer.
//					blocking.setType(type);
//					listBlocking.add(blocking);
//					account.setBlocking(listBlocking);
					//UA
			//		account.setBlockings(blocking);
					//EOF UA
					
				}else if (formato4026.getCond23().equals("A")) {
					type.setId(Constant.OPTIONSLIST_TYPE_ID_26);
					
				}
//				//UA
//				blocking.setType(type);
//				listBlocking.add(blocking);
//				account.setBlocking(listBlocking);
//				
//				account.setBlockings(blocking);
//				DTOIntMoney pendingBalance = new DTOIntMoney();
//				DTOIntCurrency currency = new DTOIntCurrency();
////				currency.setId(formato402A.getDivisa());
//				pendingBalance.setCurrency(currency);
//				pendingBalance.setAmount(formato4026.getCuotimp());
//				account.setPendingBalance(pendingBalance);

				//EOF UA
			} 
			else
			{  //20Nov
					type.setId(Constant.OPTIONSLIST_TYPE_ID);
					type.setName(Constant.OPTIONSLIST_TYPE_NAME);  //preguntar este que hacer.

			}
			blocking.setType(type);
			listBlocking.add(blocking);
			account.setBlocking(listBlocking);
			
			account.setBlockings(blocking);
			DTOIntMoney pendingBalance = new DTOIntMoney();
			DTOIntCurrency currency = new DTOIntCurrency();
//			currency.setId(formato402A.getDivisa());
			pendingBalance.setCurrency(currency);
			pendingBalance.setAmount(formato4026.getCuotimp());
			account.setPendingBalance(pendingBalance);
		}
		
		LOG.info("[RespuestaBusiness]: " + account);
	    	    			
		return account;
	}
	
	public DTOIntAccount mapFormatoBGM402A(DTOIntAccount account, FormatoBGM402A formato402A, String accountId) {
		
		LOG.info("[mapFormatoBGM402A]: " + account);
		LOG.info("[mapFormatoBGM402A]: " + formato402A);
		LOG.info("[mapFormatoBGM402A]: " + accountId);
		
		LOG.info("[formato402A]: Antes del IF");
		if (formato402A != null) {
			
			LOG.info("[formato402A]: despues del IF");
			
			
			DTOIntContractFormat format = new DTOIntContractFormat();
			DTOIntProduct product = new DTOIntProduct();
			DTOIntProduct subProduct = new DTOIntProduct();
			DTOIntCurrency currency = new DTOIntCurrency();
			DTOIntMoney currentBalance = new DTOIntMoney();
			DTOIntCurrency currentBalanceCurrency = new DTOIntCurrency();
			DTOIntMoney availableBalance = new DTOIntMoney();
			DTOIntCurrency availableBalanceCurrency = new DTOIntCurrency();
			DTOIntMoney valuedBalance = new DTOIntMoney();
			DTOIntCurrency valuedBalanceCurrency = new DTOIntCurrency();
			DTOIntAccount asociateCCC = new DTOIntAccount();
			//UA
			DTOIntMoney pendingBalance = new DTOIntMoney();
			DTOIntMoney bookingBalance = new DTOIntMoney();
			DTOIntCurrency pendingBalanceCurrency2 = new DTOIntCurrency();
			DTOIntCurrency pendingBalanceCurrency = new DTOIntCurrency();
			//EOF UA
			
			format.setCcc(formato402A.getCcc());
			format.setCABLE(formato402A.getClaveb());
			
			product.setId(formato402A.getCcc());		
			subProduct.setId(formato402A.getSubpro());
			
			currency.setId(formato402A.getDivisa());
			currency.setName(formato402A.getDivisa());
																						
			currentBalanceCurrency.setId(formato402A.getDivisa());
			currentBalance.setAmount(formato402A.getSaldis());
		    currentBalance.setCurrency(currentBalanceCurrency);	    	   
		    
		    availableBalanceCurrency.setId(formato402A.getDivisa());
		    availableBalance.setAmount(formato402A.getDispon());
		    availableBalance.setCurrency(availableBalanceCurrency);	   	    
		    
		    valuedBalanceCurrency.setId(formato402A.getDivisa());
		    valuedBalance.setAmount(formato402A.getSalval());
		    valuedBalance.setCurrency(valuedBalanceCurrency);
		    
		    asociateCCC.setAsoCCC(formato402A.getCccaso());
		    	    
		    account.setId(accountId);		
		    account.setFormats(format);
		    account.setProduct(product);
		    account.setSubproduct(subProduct);
		    account.setCurrency(currency);
		    account.setCurrentBalance(currentBalance);
		    account.setValuedBalance(valuedBalance);
		    account.setAvailableBalance(availableBalance);
		    account.setAsociateCCC(asociateCCC);
		    //UA
		    account.setValuedBalanceDate(formato402A.getUltliq());
		    if(account.getPendingBalance()!=null){
		    	pendingBalance= account.getPendingBalance();
		    }
		    pendingBalanceCurrency.setId(formato402A.getDivisa());
			pendingBalance.setCurrency(pendingBalanceCurrency);
			if(pendingBalance!=null){
				account.setPendingBalance(pendingBalance);
			}
			pendingBalanceCurrency2.setId(formato402A.getDivisa());
			bookingBalance.setCurrency(pendingBalanceCurrency2);
			account.setBookingBalance(bookingBalance);
		    //EOF UA
		    
		}	
		
		return account;
	}
	
	public DTOIntAccount mapFormatoBGM402B(DTOIntAccount account, FormatoBGM402B formato402B) {
		
		LOG.info("[mapFormatoBGM402B]: " + account);
		LOG.info("[mapFormatoBGM402B]: " + formato402B);
		
		LOG.info("[formato402B]: Antes del IF");
		if (formato402B != null) {
			
			LOG.info("[formato402B]: Despues del IF");
	    	DTOIntOptionsList status = new DTOIntOptionsList();
			DTOIntContractBlock block = new DTOIntContractBlock();
			DTOIntBranch branch = new DTOIntBranch();
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
			
	    	
	    	status.setId(formato402B.getEstado());		
	    	
			block.setId(formato402B.getCancel());
			
			branch.setId(formato402B.getOfiges());	
			
			account.setManagementUnit(formato402B.getUnigest());
			account.setStatus(status);
			account.setBlock(block);
			account.setBranch(branch);
			//UA
			account.setOwnershipType(formato402B.getLitdis());
		    //EOF UA	    
		    try {
		    	String fechas = formato402B.getFechas();
		    	LOG.info("[mapFormatoBGM402B]: fechas: " + fechas);
		    	if(fechas.length() > 10){
		    		
		    		if(formato402B.getFechas().substring(0, 10).trim().length()!= 0)
		    		account.setOpeningDate(formatoDelTexto.parse(formato402B.getFechas().substring(0, 10)));
		    		LOG.info("[mapFormatoBGM402B]: setOpeningDate: " + formato402B.getFechas().substring(0, 10));
			        
		    		if(formato402B.getFechas().substring(13, 23).trim().length()!= 0)
			    	account.setExpirationDate(formatoDelTexto.parse(formato402B.getFechas().substring(13, 23)));
			    	LOG.info("[mapFormatoBGM402B]: setOpeningDate: " + formato402B.getFechas().substring(13, 23));
			    	
			    	if(fechas.length() > 27 & fechas.length() <= 37){
			    		if(formato402B.getFechas().substring(27, 37).trim().length()!= 0)
			    		account.setCancelationDate(formatoDelTexto.parse(formato402B.getFechas().substring(27, 37)));
			    		LOG.info("[mapFormatoBGM402B]: fecsetOpeningDatehas: " + formato402B.getFechas().substring(27, 37));
			    	}
		    	}else{
		    		if(fechas.length() <= 10){
		    			if(formato402B.getFechas().substring(0, 10).trim().length()!= 0)
		    			account.setOpeningDate(formatoDelTexto.parse(formato402B.getFechas().substring(0, 10)));
			    		LOG.info("[mapFormatoBGM402B]: setOpeningDate: " + formato402B.getFechas().substring(0, 10));
			    	}
		    		
		    	}
			} catch (ParseException e) {
				throw new BusinessServiceException(Constant.ERROR_TECHNICAL_ERROR, e);
				
			}	    
	    }	
		
		LOG.info("[mapFormatoBGM402B]: " + account);
		
		return account;
	}
}
