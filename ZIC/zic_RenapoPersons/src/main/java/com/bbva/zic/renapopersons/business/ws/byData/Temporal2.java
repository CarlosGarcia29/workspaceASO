package com.bbva.zic.renapopersons.business.ws.byData;

import java.io.ByteArrayInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.bbva.zic.renapopersons.business.ws.byData.xsd.DatosConsultaDetalles;
import com.bbva.zic.renapopersons.business.ws.byData.xsd.ObjectFactory;
import com.bbva.zic.renapopersons.business.ws.response.CurpResponse;
import com.bbva.zic.renapopersons.business.ws.response.CurpResponseByData;

public class Temporal2 {

	public static void main(String args[]) {
		validarPorDatos();
	}

	public static void validarPorDatos() {
		try {
			ConsultaCurpDetalleService service = new ConsultaCurpDetalleService();
			ConsultaCurpDetalleServicePortType port = service.getConsultaCurpDetalleServiceHttpSoap12Endpoint();
			DatosConsultaDetalles curp = new DatosConsultaDetalles();
			
			ObjectFactory factory = new ObjectFactory();
			
			curp.setDireccionIp(factory.createDatosConsultaDetallesDireccionIp("148.244.42.171"));
			curp.setPassword(factory.createDatosConsultaDetallesPassword("test2009"));
			curp.setCveUsuario(factory.createDatosConsultaDetallesCveUsuario("testconsulta"));
			curp.setTipoTransaccion(6);
			
			curp.setCveAlfaEntFedNac(factory.createDatosConsultaDetallesCveAlfaEntFedNac("MC"));
			curp.setFechaNacimiento(factory.createDatosConsultaDetallesFechaNacimiento("20/07/1966"));
			curp.setNombre(factory.createDatosConsultaDetallesNombre("ENRIQUE"));
			curp.setPrimerApellido(factory.createDatosConsultaDetallesPrimerApellido("PEÑA"));
			curp.setSegundoApellido(factory.createDatosConsultaDetallesSegundoApellido("NIETO"));
			curp.setSexo(factory.createDatosConsultaDetallesSexo("H"));
		
			String respuesta = port.consultarCurpDetalle(curp);
			System.out.println(respuesta);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static CurpResponse convertirRespuestaObj(String respuesta) {
        try {
//        	respuesta = "  <CURPCollection statusOper=\"EXITOSO\" message=\"LA OPERACION SE EJECUTO.\" TipoError=\"\" CodigoError=\"\" SessionID=\"LRFggbRjjdhPKvoM1RjtCGU5e-VB0n40h1Dimgf29sCz_hk9W_o3!-1226631305!1440433157219\"><CURPStruct><CURP>PXNE660720HMCXTN06</CURP><apellido1>PEÑA</apellido1><apellido2>NIETO</apellido2><nombres>ENRIQUE</nombres><sexo>H</sexo><fechNac>20/07/1966</fechNac><nacionalidad>MEX</nacionalidad><docProbatorio>1</docProbatorio><anioReg>1966</anioReg><foja></foja><tomo></tomo><libro>0002</libro><numActa>00985</numActa><CRIP></CRIP><numEntidadReg>15</numEntidadReg><cveMunicipioReg>014</cveMunicipioReg><NumRegExtranjeros></NumRegExtranjeros><FolioCarta></FolioCarta><cveEntidadNac>MC</cveEntidadNac><cveEntidadEmisora>65701</cveEntidadEmisora><statusCurp>AN</statusCurp></CURPStruct></CURPCollection>";
        	
            JAXBContext jaxbContext = JAXBContext.newInstance(CurpResponseByData.class);
            Unmarshaller jaxbunmarshaller = jaxbContext.createUnmarshaller();
            CurpResponseByData cr = (CurpResponseByData) jaxbunmarshaller.unmarshal(new ByteArrayInputStream(respuesta.getBytes()));
            if (cr != null) {
            	if (cr.getCurpResponse() != null) {
            		if (cr.getCurpResponse().size() == 1) {
            			System.out.println("se encontraron un registro por la curp");            			
            			return cr.getCurpResponse().get(0);
            		} else if (cr.getCurpResponse().size() > 1) {
            			System.out.println("se encontraron mas de un registro por la curp");
            		}
            	}
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
