package com.bbva.zic.accountsv02.dao.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bbva.jee.arq.spring.core.host.protocolo.ps9.ErrorMappingHelper;
import com.bbva.jee.arq.spring.core.host.protocolo.ps9.aplicacion.CopySalida;
import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.bbva.zic.accountsv02.business.dto.DTOIntAccount;
import com.bbva.zic.accountsv02.business.dto.DTOIntBank;
import com.bbva.zic.accountsv02.business.dto.DTOIntBranch;
import com.bbva.zic.accountsv02.business.dto.DTOIntProduct;
import com.bbva.zic.accountsv02.dao.model.b000.FormatoBGM000;
import com.bbva.zic.accountsv02.dao.model.b000.FormatoBGM0001;
import com.bbva.zic.accountsv02.dao.model.b000.PeticionTransaccionB000;
import com.bbva.zic.accountsv02.dao.model.b000.RespuestaTransaccionB000;
import com.bbva.zic.accountsv02.facade.v02.utils.Validator;

@Component
public class MapperB000 {

	private static final Log LOG = LogFactory.getLog(MapperB000.class);

	@Autowired
	private Validator validator;

	@Autowired
	private ErrorMappingHelper errorMappingHelper;

	/**
	 * realiza la conversion de un dto interno a los datos de entrada de una
	 * transaccion.
	 * 
	 * @param dtoIntAccount
	 * @return
	 */
	public PeticionTransaccionB000 mapToDaoRequest(final DTOIntAccount dtoIntAccount) {
		PeticionTransaccionB000 peticion = new PeticionTransaccionB000();
		FormatoBGM000 formatoBg0 = new FormatoBGM000();

		formatoBg0.setProduct(Integer.valueOf(dtoIntAccount.getProduct().getId()));

		if (dtoIntAccount.getBranch() != null && validator.isBlankString(dtoIntAccount.getBranch().getId())
				&& dtoIntAccount.getBranch().getBank() != null
				&& validator.isBlankString(dtoIntAccount.getBranch().getBank().getId())) {
			
			StringBuilder entcto = new StringBuilder(dtoIntAccount.getBranch().getBank().getId());
			
			entcto.append(dtoIntAccount.getBranch().getId());
			
			formatoBg0.setEntcto(entcto.toString());
		}

		peticion.getCuerpo().getPartes().add(formatoBg0);

		return peticion;
	}

	/**
	 * a partir de la respuesta obtenida, se obtienen los datos para colocarlos
	 * en un dto interno.
	 * 
	 * @param respuestaTransaccion
	 * @return
	 */
	public DTOIntAccount mapFormatoBGM0001(final RespuestaTransaccionB000 respuestaTransaccion) {
		LOG.info("[RespuestaDAO: " + respuestaTransaccion + "]");

		BusinessServiceException businessServiceException = errorMappingHelper
				.toBusinessServiceException(respuestaTransaccion);
		if (businessServiceException != null) {
			throw businessServiceException;
		}

		DTOIntAccount dtoIntAccount = new DTOIntAccount();
		DTOIntProduct dtoIntProduct = new DTOIntProduct();
		DTOIntBranch dtoIntBranch = new DTOIntBranch();
		DTOIntBank dtoIntBank = new DTOIntBank();

		CopySalida copySalida = respuestaTransaccion.getCuerpo().getParte(CopySalida.class);
		
		LOG.info("[copySalida]: " + copySalida);

		if (copySalida != null) {
			FormatoBGM0001 formatoSalida = copySalida.getCopy(FormatoBGM0001.class);
			if (formatoSalida != null) {
				dtoIntBank.setId(formatoSalida.getEntidad());
				dtoIntBranch.setId(formatoSalida.getCentro());
				dtoIntAccount.setAccountNumber(formatoSalida.getCuenta());
				dtoIntAccount.setCheckDigit(formatoSalida.getDigitos());
			}
		}

		dtoIntBranch.setBank(dtoIntBank);
		dtoIntAccount.setBranch(dtoIntBranch);
		dtoIntAccount.setProduct(dtoIntProduct);

		LOG.info("[RespuestaBusiness]: " + dtoIntAccount);

		return dtoIntAccount;
	}
}