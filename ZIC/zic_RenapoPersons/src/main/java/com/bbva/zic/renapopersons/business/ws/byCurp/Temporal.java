package com.bbva.zic.renapopersons.business.ws.byCurp;

import java.io.ByteArrayInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.bbva.zic.renapopersons.business.ws.byCurp.xsd.DatosConsultaCurp;
import com.bbva.zic.renapopersons.business.ws.response.CurpResponse;

public class Temporal {

	public static void main(String args[]) {
		validarPorCURP();
	}

	public static void validarPorCURP() {
		try {
//			System.setProperty("javax.net.ssl.trustStore", "C:\\Users\\XMZ6738\\Documents\\CERTIFICADOS_JVM\\keyStoreJVM.jks");
//			System.setProperty("javax.net.ssl.trustStorePassword", "myPassword");
			
			
			ConsultaPorCurpService service = new ConsultaPorCurpService();
			ConsultaPorCurpServicePortType port = service.getConsultaPorCurpServiceHttpsSoap11Endpoint();

			DatosConsultaCurp curp = new DatosConsultaCurp();

			com.bbva.zic.renapopersons.business.ws.byCurp.xsd.ObjectFactory factory = new com.bbva.zic.renapopersons.business.ws.byCurp.xsd.ObjectFactory();

			curp.setCveCurp(factory.createDatosConsultaCurpCveCurp("GABC870629HTSRRR00"));
			curp.setDireccionIp(factory.createDatosConsultaCurpDireccionIp("148.244.42.171"));
			curp.setPassword(factory.createDatosConsultaCurpPassword("test2009"));
			curp.setUsuario(factory.createDatosConsultaCurpUsuario("testconsulta"));
			curp.setTipoTransaccion(5);

			String respuesta = port.consultarPorCurp(curp);
			
			System.out.println(respuesta);
			convertirRespuestaObj(respuesta);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static CurpResponse convertirRespuestaObj(final String respuesta) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(CurpResponse.class);
            Unmarshaller jaxbunmarshaller = jaxbContext.createUnmarshaller();
            CurpResponse cr = (CurpResponse) jaxbunmarshaller.unmarshal(new ByteArrayInputStream(respuesta.getBytes()));
            if (cr != null) {
                System.out.println("Curp que regreso de renapo: " + cr.getCURP());
                System.out.println("Curp historicas : " + cr.getCurpHistoricas());
            }
            return cr;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
