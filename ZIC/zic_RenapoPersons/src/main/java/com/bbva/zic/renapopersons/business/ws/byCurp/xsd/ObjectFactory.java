
package com.bbva.zic.renapopersons.business.ws.byCurp.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import org.springframework.stereotype.Component;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.gob.segob.dgti.ecurp.wserv.services.xsd package. 
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
@Component(value="objectFactoryByCURP")
@XmlRegistry
public class ObjectFactory {

    private final static QName _DatosConsultaCurpCveEntidadEmisora_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "cveEntidadEmisora");
    private final static QName _DatosConsultaCurpCveCurp_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "cveCurp");
    private final static QName _DatosConsultaCurpUsuario_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "usuario");
    private final static QName _DatosConsultaCurpPassword_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "password");
    private final static QName _DatosConsultaCurpDireccionIp_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "direccionIp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.gob.segob.dgti.ecurp.wserv.services.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatosConsultaCurp }
     * 
     */
    public DatosConsultaCurp createDatosConsultaCurp() {
        return new DatosConsultaCurp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "cveEntidadEmisora", scope = DatosConsultaCurp.class)
    public JAXBElement<String> createDatosConsultaCurpCveEntidadEmisora(String value) {
        return new JAXBElement<String>(_DatosConsultaCurpCveEntidadEmisora_QNAME, String.class, DatosConsultaCurp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "cveCurp", scope = DatosConsultaCurp.class)
    public JAXBElement<String> createDatosConsultaCurpCveCurp(String value) {
        return new JAXBElement<String>(_DatosConsultaCurpCveCurp_QNAME, String.class, DatosConsultaCurp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "usuario", scope = DatosConsultaCurp.class)
    public JAXBElement<String> createDatosConsultaCurpUsuario(String value) {
        return new JAXBElement<String>(_DatosConsultaCurpUsuario_QNAME, String.class, DatosConsultaCurp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "password", scope = DatosConsultaCurp.class)
    public JAXBElement<String> createDatosConsultaCurpPassword(String value) {
        return new JAXBElement<String>(_DatosConsultaCurpPassword_QNAME, String.class, DatosConsultaCurp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "direccionIp", scope = DatosConsultaCurp.class)
    public JAXBElement<String> createDatosConsultaCurpDireccionIp(String value) {
        return new JAXBElement<String>(_DatosConsultaCurpDireccionIp_QNAME, String.class, DatosConsultaCurp.class, value);
    }

}
