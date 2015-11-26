package com.bbva.zic.accountsv02.facade.v02.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.bbva.zic.accountsv02.business.utils.Constant;
import com.bbva.zic.accountsv02.facade.v02.dto.Account;


@Component
public class Validator {
	
	public static final String ER_NUMBER = "[0-9]{2}";
	
	private Pattern patternErNumber = Pattern.compile(ER_NUMBER);

	public void checkGetAccountParams(String accountId) {
		
		this.isBlank(accountId);
	}
	
	public void isBlank (String string) {
		
		if (string == null || string.isEmpty()) {
			this.throwWrongParameters();
			
		}
	}
	
	public void isNull (Object object) {
		
		if (object == null) {
			this.throwWrongParameters();
			
		}
	}
	
	public void throwWrongParameters () {
		
		throw new BusinessServiceException(Constant.ERROR_WRONG_PARAMETERS);
	}
	
	public boolean isBlankString(String string) {
		
		return string == null || string.isEmpty();
	
	}
	
	public boolean isNumber(String cadena){
		
		Matcher matcher = patternErNumber.matcher(cadena);
		
		return matcher.matches();
	}
	
	public void checkPostProspectAccountParams(final Account account) {
		
		this.isNull(account);
		
		this.isNull(account.getProduct());

		
		if ( this.isBlankString(account.getProduct().getId())) {
			throw new BusinessServiceException(Constant.ERROR_WRONG_PARAMETERS,"Parámetros obligatorios no informados");
		}
		
		if (!isNumber(account.getProduct().getId())) {
			throw new BusinessServiceException(Constant.ERROR_WRONG_PARAMETERS);
		}
	}
}
