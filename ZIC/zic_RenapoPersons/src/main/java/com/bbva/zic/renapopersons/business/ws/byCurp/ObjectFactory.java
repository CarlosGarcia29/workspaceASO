
package com.bbva.zic.renapopersons.business.ws.byCurp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.bbva.zic.renapopersons.business.ws.byCurp.xsd.DatosConsultaCurp;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.gob.segob.dgti.ecurp.wserv.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetConfirmMssg_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "Mssg");
    private final static QName _GetConfirmSessionID_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "sessionID");
    private final static QName _ConsultarPorCurpDatos_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "datos");
    private final static QName _ConsultarPorCurpResponseReturn_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.gob.segob.dgti.ecurp.wserv.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarPorCurpResponse }
     * 
     */
    public ConsultarPorCurpResponse createConsultarPorCurpResponse() {
        return new ConsultarPorCurpResponse();
    }

    /**
     * Create an instance of {@link GetConfirm }
     * 
     */
    public GetConfirm createGetConfirm() {
        return new GetConfirm();
    }

    /**
     * Create an instance of {@link ConsultarPorCurp }
     * 
     */
    public ConsultarPorCurp createConsultarPorCurp() {
        return new ConsultarPorCurp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", name = "Mssg", scope = GetConfirm.class)
    public JAXBElement<String> createGetConfirmMssg(String value) {
        return new JAXBElement<String>(_GetConfirmMssg_QNAME, String.class, GetConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", name = "sessionID", scope = GetConfirm.class)
    public JAXBElement<String> createGetConfirmSessionID(String value) {
        return new JAXBElement<String>(_GetConfirmSessionID_QNAME, String.class, GetConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConsultaCurp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", name = "datos", scope = ConsultarPorCurp.class)
    public JAXBElement<DatosConsultaCurp> createConsultarPorCurpDatos(DatosConsultaCurp value) {
        return new JAXBElement<DatosConsultaCurp>(_ConsultarPorCurpDatos_QNAME, DatosConsultaCurp.class, ConsultarPorCurp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", name = "return", scope = ConsultarPorCurpResponse.class)
    public JAXBElement<String> createConsultarPorCurpResponseReturn(String value) {
        return new JAXBElement<String>(_ConsultarPorCurpResponseReturn_QNAME, String.class, ConsultarPorCurpResponse.class, value);
    }

}
