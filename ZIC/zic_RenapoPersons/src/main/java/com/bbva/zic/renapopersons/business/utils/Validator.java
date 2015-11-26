package com.bbva.zic.renapopersons.business.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.bbva.zic.renapopersons.facade.v01.dto.Person;

@Component(value = "dataValidator")
public class Validator {

	private static Log log = LogFactory.getLog(Validator.class);

	public static final String ER_RENAPO = "[A-Z]{4}\\d{6}[HM][A-Z]{2}[B-DF-HJ-NP-TV-Z]{3}[A-Z0-9][0-9]";
	public static final String ER_DATE = "[0-9]{4}[-]{1}[0-9]{2}[-]{1}[0-9]{2}";
//	public static final String ER_TEXT = "^[A-Za-zÑñÁÉÍÓÚáéíóúüÜ ]*$";
	public static final String ER_TEXT = "^[A-Za-zÑñüÜ ]*$";
	
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	
	private Pattern patternErRenapo = Pattern.compile(ER_RENAPO);
	private Pattern patternErDate = Pattern.compile(ER_DATE);
	private Pattern patternErText = Pattern.compile(ER_TEXT);

	/**
	 * verifica que una curp sea valida.
	 * @param curp
	 */
	public void checkGetParamsValidatePerson(final String curp) {
		if (isBlank(curp)) {
			throw new BusinessServiceException(Constant.WRONG_PARAMETERS_CURP);
		}

		Matcher matcher = patternErRenapo.matcher(curp.toUpperCase());
		if (!matcher.matches()) {
			throw new BusinessServiceException(Constant.WRONG_PARAMETERS_CURP);
		}
	}

	/**
	 * realiza la validacion de los datos de entrada en el dto.
	 * 
	 * @param personCurp
	 * @throws BusinessServiceException
	 */
	public void checkGetParamsListPerson(final Person renapoPerson) throws BusinessServiceException {
		isValidLastName(renapoPerson.getLastName());
		isValidName(renapoPerson.getName());
		isValidBirthDate(renapoPerson.getBirthDate());

		isValidMotherLastName(renapoPerson.getMotherLastName());
		isValidBirthPlace(renapoPerson.getExtendedData().getBirthPlace());
		isValidSex(renapoPerson.getExtendedData().getSex());
	}

	/**
	 * verifica que una cadena sea vacia o nula.
	 * @param cadena
	 * @return
	 */
	public boolean isBlank(String cadena) {
		return cadena == null || cadena.isEmpty();
	}

	/**
	 * verifica que la cadena de nombre sea valida.
	 * @param name
	 */
	private void isValidName(final String name) {
		if (isBlank(name)) {
			throw new BusinessServiceException(Constant.PARAMETERS_MISSING_NAMES);
		} 
		Matcher matcher = patternErText.matcher(name);
		if (!matcher.matches()) {
			throw new BusinessServiceException(Constant.PARAMETERS_FORMAT_NAMES);
		}
	}

	/**
	 * verifica que el apellido sea valido.
	 * @param lastName
	 */
	private void isValidLastName(final String lastName) {
		if (isBlank(lastName)) {
			throw new BusinessServiceException(Constant.PARAMETERS_MISSING_LAST_NAME);
		} 
		
		Matcher matcher = patternErText.matcher(lastName);
		if (!matcher.matches()) {
			throw new BusinessServiceException(Constant.PARAMETERS_FORMAT_LAST_NAME);
		}
	}

	/**
	 * verifica que el apellido materno sea valido.
	 * @param motherLastName
	 */
	private void isValidMotherLastName(final String motherLastName) {
		if (!isBlank(motherLastName)) {
			Matcher matcher = patternErText.matcher(motherLastName);
			if (!matcher.matches()) {
				throw new BusinessServiceException(Constant.PARAMETERS_FORMAT_MOTHER_LAST_NAME);
			}
		}
	}

	private void isValidSex(final String sex) {
		// if (!isBlank(sex)) {
		// throw new BusinessServiceException(Constant.PARAMETERS_FORMAT_SEX);
		// }
	}

	private void isValidBirthPlace(final String birthPlace) {
		// if (!isBlank(birthPlace)) {
		// throw new
		// BusinessServiceException(Constant.PARAMETERS_FORMAT_BIRTH_PLACE);
		// }
	}

	/**
	 * verifica que la fecha de nacimiento sea una fecha valida.
	 * @param birthDate
	 */
	private void isValidBirthDate(final String birthDate) {
		
		if (isBlank(birthDate)) {
			throw new BusinessServiceException(Constant.PARAMETERS_MISSING_BIRTH_DATE);
		}

		Matcher matcher = patternErDate.matcher(birthDate);
		if (!matcher.matches()) {
			throw new BusinessServiceException(Constant.WRONG_PARAMETERS_DATE_FORMAT);
		}

		try {
			SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
			Date date = sdf.parse(birthDate);
			if (!birthDate.equals(sdf.format(date))) {
				throw new BusinessServiceException(Constant.WRONG_PARAMETERS_DATE);
			}			
		} catch (ParseException e) {
			log.error("No se pudo parsear el dato : " + birthDate, e);
			throw new BusinessServiceException(Constant.WRONG_PARAMETERS_DATE);
		}
	}
}
