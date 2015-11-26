package com.bbva.zic.renapopersons.business.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.ws.WebServiceException;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbva.jee.arq.spring.core.host.transporte.ws.ExcepcionWS;
import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.bbva.jee.arq.spring.core.servicing.utils.BusinessServicesToolKit;
import com.bbva.zic.renapopersons.business.ISrvIntRenapoPersons;
import com.bbva.zic.renapopersons.business.dto.DTOIntPerson;
import com.bbva.zic.renapopersons.business.mapper.MapperWS;
import com.bbva.zic.renapopersons.business.utils.Constant;
import com.bbva.zic.renapopersons.business.ws.byCurp.ConsultaPorCurpService;
import com.bbva.zic.renapopersons.business.ws.byCurp.ConsultaPorCurpServicePortType;
import com.bbva.zic.renapopersons.business.ws.byCurp.xsd.DatosConsultaCurp;
import com.bbva.zic.renapopersons.business.ws.byData.ConsultaCurpDetalleService;
import com.bbva.zic.renapopersons.business.ws.byData.ConsultaCurpDetalleServicePortType;
import com.bbva.zic.renapopersons.business.ws.byData.xsd.DatosConsultaDetalles;
import com.bbva.zic.renapopersons.facade.v01.dto.Person;


@Service
public class SrvIntRenapoPersons implements ISrvIntRenapoPersons {
	
	private static Log log = LogFactory.getLog(SrvIntRenapoPersons.class);

	@Autowired
	private MapperWS mapperWS;

	@Autowired
	private ConsultaPorCurpService serviceByCurp;

	@Autowired
	private ConsultaCurpDetalleService serviceByData;

	@Autowired
	BusinessServicesToolKit bussinesToolKit;

	/*
	 * (non-Javadoc)
	 * @see com.bbva.zic.renapopersons.business.ISrvIntRenapoPersons#listRenapoPersons(com.bbva.zic.renapopersons.facade.v01.dto.Person)
	 */
	public List<DTOIntPerson> listRenapoPersons(Person person) {
		log.info("[SrvRenapoPersonsV01]: consumiento el WS de consulta persona por datos ");
		try {
			ConsultaCurpDetalleServicePortType port = serviceByData.getConsultaCurpDetalleServiceHttpsSoap11Endpoint();
			DatosConsultaDetalles daoByData = mapperWS.mapPersonCurpToDatosConsultaDetalles(person);

			String respuesta = port.consultarCurpDetalle(daoByData);
			
			return mapperWS.mapResponceToDatosConsultaDetalles(getFormatterString(respuesta));
		} catch (JAXBException e) {		
			log.error(Constant.TECHNICAL_ERROR_WS_RENAPO , e);
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (WebServiceException e) {
			log.error(Constant.TECHNICAL_ERROR_WS_RENAPO , e);
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (ExcepcionWS e) {
			throw e;
		} catch (BusinessServiceException e) {
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		}
	}


	/*
	 * (non-Javadoc)
	 * @see com.bbva.zic.renapopersons.business.ISrvIntRenapoPersons#getRenapoPerson(com.bbva.zic.renapopersons.facade.v01.dto.Person)
	 */
	public DTOIntPerson getRenapoPerson(Person person) {
		try {
			log.info("[SrvRenapoPersonsV01]: consumiendo el WS de consultar persona por CURP");
			ConsultaPorCurpServicePortType port = serviceByCurp.getConsultaPorCurpServiceHttpsSoap11Endpoint();
			
			DatosConsultaCurp daoByCurp = mapperWS.mapPersonCurpToDatosConsultaCurp(person);
			
			String respuesta = port.consultarPorCurp(daoByCurp);
			
			return mapperWS.mapResponceToDatosConsultaCurp(getFormatterString(respuesta));
		} catch (JAXBException e) {	
			e.printStackTrace();
			log.error(Constant.TECHNICAL_ERROR_WS_RENAPO , e);
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (WebServiceException e) {
			log.error(Constant.TECHNICAL_ERROR_WS_RENAPO , e);
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (ExcepcionWS e) {
			e.printStackTrace();
			throw e;
		} catch (BusinessServiceException e) {
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		}
	}
	
		
	/**
	 * aunque se supone que las cadenas las mandan como utf-8, en realidad retornan acentos, 
	 * por eso la codificacion de la cadena se cambia a ISO-8859-1
	 * @param cadena
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	private Reader getFormatterString(String cadena) throws UnsupportedEncodingException{
		return new InputStreamReader(new ByteArrayInputStream(cadena.getBytes()), "ISO-8859-1");
	}


	@Override
	public List<DTOIntPerson> listRenapoPersonsDummy1(Person person) {
		log.info("[SrvRenapoPersonsV01]: consumiento el WS de consulta persona por datos ");
		System.out.println("Entro al listRenapoPersonsDummy1");
		try {
			String respuesta =  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
					+ "<CURPCollection statusOper=\"EXITOSO\" "
					+ "message=\"LA OPERACION SE EJECUTO.\" "
					+ "TipoError=\"\" "
					+ "CodigoError=\"\" "
					+ "SessionID=\"xKwo0Gme3xrM-cxMHNr66T6g_TM1YpHxe1d_4nDJ-VsUVt-2fiKa!490160862!1439498791326\">"
					+ "CurpResponse=\""
					+ "<CURPStruct>"
					+ "<CURP>PXNE660720HMCXTN06</CURP>"
					+ "<apellido1>PEÑA</apellido1>"
					+ "<apellido2>NIETO</apellido2>"
					+ "<nombres>ENRIQUE</nombres>"
					+ "<sexo>H</sexo>"
					+ "<fechNac>20/07/1966</fechNac>"
					+ "<nacionalidad>MEX</nacionalidad>"
					+ "<docProbatorio>1</docProbatorio>"
					+ "<anioReg>1966</anioReg>"
					+ "<foja></foja>"
					+ "<tomo></tomo>"
					+ "<libro>0002</libro>"
					+ "<numActa>00985</numActa>"
					+ "<CRIP></CRIP>"
					+ "<numEntidadReg>15</numEntidadReg>"
					+ "<cveMunicipioReg>014</cveMunicipioReg>"
					+ "<NumRegExtranjeros></NumRegExtranjeros>"
					+ "<FolioCarta></FolioCarta>"
					+ "<cveEntidadNac>MC</cveEntidadNac>"
					+ "<cveEntidadEmisora>65701</cveEntidadEmisora>"
					+ "<statusCurp>AN</statusCurp>"
					+ "</CURPStruct>"
					+ "\""
					+ "</CURPCollection>";
			return mapperWS.mapResponceToDatosConsultaDetalles(getFormatterString(respuesta));
		} catch (JAXBException e) {		
			log.error(Constant.TECHNICAL_ERROR_WS_RENAPO , e);
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (WebServiceException e) {
			log.error(Constant.TECHNICAL_ERROR_WS_RENAPO , e);
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (ExcepcionWS e) {
			throw e;
		} catch (BusinessServiceException e) {
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		}
	}


	@Override
	public List<DTOIntPerson> listRenapoPersonsDummy2(Person person) {
		log.info("[SrvRenapoPersonsV01]: consumiento el WS de consulta persona por datos ");
		System.out.println("Entro al listRenapoPersonsDummy2");
		
		try {
			String respuesta =  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
					+ "<CURPCollection statusOper=\"EXITOSO\" "
					+ "message=\"LA OPERACION SE EJECUTO.\" "
					+ "TipoError=\"\" "
					+ "CodigoError=\"\" "
					+ "SessionID=\"xKwo0Gme3xrM-cxMHNr66T6g_TM1YpHxe1d_4nDJ-VsUVt-2fiKa!490160862!1439498791326\">"
					+ "CurpResponse=\""
					+ "<CURPStruct>"
					+ "<CURP>PXNE660720HMCXTN06</CURP>"
					+ "<apellido1>PEÑA</apellido1>"
					+ "<apellido2>NIETO</apellido2>"
					+ "<nombres>ENRIQUE</nombres>"
					+ "<sexo>H</sexo>"
					+ "<fechNac>20/07/1966</fechNac>"
					+ "<nacionalidad>MEX</nacionalidad>"
					+ "<docProbatorio>1</docProbatorio>"
					+ "<anioReg>1966</anioReg>"
					+ "<foja></foja>"
					+ "<tomo></tomo>"
					+ "<libro>0002</libro>"
					+ "<numActa>00985</numActa>"
					+ "<CRIP></CRIP>"
					+ "<numEntidadReg>15</numEntidadReg>"
					+ "<cveMunicipioReg>014</cveMunicipioReg>"
					+ "<NumRegExtranjeros></NumRegExtranjeros>"
					+ "<FolioCarta></FolioCarta>"
					+ "<cveEntidadNac>MC</cveEntidadNac>"
					+ "<cveEntidadEmisora>65701</cveEntidadEmisora>"
					+ "<statusCurp>AN</statusCurp>"
					+ "</CURPStruct>"
					+ "\""
					+ "</CURPCollection>";
			return mapperWS.mapResponceToDatosConsultaDetalles(getFormatterString(respuesta));
		} catch (JAXBException e) {		
			log.error(Constant.TECHNICAL_ERROR_WS_RENAPO , e);
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (WebServiceException e) {
			log.error(Constant.TECHNICAL_ERROR_WS_RENAPO , e);
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (ExcepcionWS e) {
			throw e;
		} catch (BusinessServiceException e) {
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		}
	}


	@Override
	public DTOIntPerson getRenapoPersonDummy1(Person person) {
		try {
			log.info("[SrvRenapoPersonsV01]: consumiendo el WS de consultar persona por CURP");
			System.out.println("Entro al getRenapoPersonDummy1");
			
			String respuesta =  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
					+ "<CURPStruct statusOper=\"EXITOSO\" "
					+ "message=\"LA OPERACION SE EJECUTO.\" "
					+ "TipoError=\"\" "
					+ "CodigoError=\"\" "
					+ "SessionID=\"xKwo0Gme3xrM-cxMHNr66T6g_TM1YpHxe1d_4nDJ-VsUVt-2fiKa!490160862!1439498791326\"> "
					+ "<CURP>PXNE660720HMCXTN06</CURP> "
					+ "<apellido1>PEÑA</apellido1> "
					+ "<apellido2>NIETO</apellido2> "
					+ "<nombres>ENRIQUE</nombres> "
					+ "<sexo>H</sexo> "
					+ "<fechNac>20/07/1966</fechNac> "
					+ "<nacionalidad>MEX</nacionalidad> "
					+ "<docProbatorio>1</docProbatorio> "
					+ "<anioReg>1966</anioReg> "
					+ "<foja></foja> "
					+ "<tomo></tomo> "
					+ "<libro>0002</libro> "
					+ "<numActa>00985</numActa> "
					+ "<CRIP></CRIP> "
					+ "<numEntidadReg>15</numEntidadReg> "
					+ "<cveMunicipioReg>014</cveMunicipioReg> "
					+ "<NumRegExtranjeros></NumRegExtranjeros> "
					+ "<FolioCarta></FolioCarta> "
					+ "<cveEntidadNac>MC</cveEntidadNac> "
					+ "<cveEntidadEmisora>65701</cveEntidadEmisora> "
					+ "<statusCurp>AN</statusCurp> "
					+ "</CURPStruct>";
			return mapperWS.mapResponceToDatosConsultaCurp(getFormatterString(respuesta));
		} catch (JAXBException e) {	
			e.printStackTrace();
			log.error(Constant.TECHNICAL_ERROR_WS_RENAPO , e);
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (WebServiceException e) {
			log.error(Constant.TECHNICAL_ERROR_WS_RENAPO , e);
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (ExcepcionWS e) {
			e.printStackTrace();
			throw e;
		} catch (BusinessServiceException e) {
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		}
	}


	@Override
	public DTOIntPerson getRenapoPersonDummy2(Person person) {
		try {
			log.info("[SrvRenapoPersonsV01]: consumiendo el WS de consultar persona por CURP");
			System.out.println("Entro al getRenapoPersonDummy2");
			
			String respuesta =  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
					+ "<CURPStruct statusOper=\"NO EXITOSO\" "
					+ "message=\"La CURP no se encuentra en la base de datos\" "
					+ "TipoError=\"01\" "
					+ "CodigoError=\"06\" "
					+ "SessionID=\"MbE2jlXS4fvLfpqFLDDNhX_eY1LaXU2EOWsktVCTXUn1F-xWxaLA!1048217041!1448319276498\"/>";
			return mapperWS.mapResponceToDatosConsultaCurp(getFormatterString(respuesta));
		} catch (JAXBException e) {	
			e.printStackTrace();
			log.error(Constant.TECHNICAL_ERROR_WS_RENAPO , e);
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (WebServiceException e) {
			log.error(Constant.TECHNICAL_ERROR_WS_RENAPO , e);
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (ExcepcionWS e) {
			e.printStackTrace();
			throw e;
		} catch (BusinessServiceException e) {
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new ExcepcionWS(Constant.TECHNICAL_ERROR_WS_RENAPO);
		}
	}
}
