
package com.bbva.zic.renapopersons.business.ws.byCurp.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosConsultaCurp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosConsultaCurp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cveCurp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cveEntidadEmisora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosConsultaCurp", propOrder = {
    "cveCurp",
    "cveEntidadEmisora",
    "direccionIp",
    "password",
    "tipoTransaccion",
    "usuario"
})
public class DatosConsultaCurp {

    @XmlElementRef(name = "cveCurp", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cveCurp;
    @XmlElementRef(name = "cveEntidadEmisora", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cveEntidadEmisora;
    @XmlElementRef(name = "direccionIp", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> direccionIp;
    @XmlElementRef(name = "password", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> password;
    protected Integer tipoTransaccion;
    @XmlElementRef(name = "usuario", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> usuario;

    /**
     * Obtiene el valor de la propiedad cveCurp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCveCurp() {
        return cveCurp;
    }

    /**
     * Define el valor de la propiedad cveCurp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCveCurp(JAXBElement<String> value) {
        this.cveCurp = value;
    }

    /**
     * Obtiene el valor de la propiedad cveEntidadEmisora.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCveEntidadEmisora() {
        return cveEntidadEmisora;
    }

    /**
     * Define el valor de la propiedad cveEntidadEmisora.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCveEntidadEmisora(JAXBElement<String> value) {
        this.cveEntidadEmisora = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionIp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccionIp() {
        return direccionIp;
    }

    /**
     * Define el valor de la propiedad direccionIp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccionIp(JAXBElement<String> value) {
        this.direccionIp = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoTransaccion() {
        return tipoTransaccion;
    }

    /**
     * Define el valor de la propiedad tipoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoTransaccion(Integer value) {
        this.tipoTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuario(JAXBElement<String> value) {
        this.usuario = value;
    }

}
