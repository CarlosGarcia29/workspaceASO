
package com.bbva.zic.renapopersons.business.ws.byData.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosConsultaDetalles complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosConsultaDetalles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cveAlfaEntFedNac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cveEntidadEmisora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cveUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosConsultaDetalles", propOrder = {
    "cveAlfaEntFedNac",
    "cveEntidadEmisora",
    "cveUsuario",
    "direccionIp",
    "fechaNacimiento",
    "nombre",
    "password",
    "primerApellido",
    "segundoApellido",
    "sexo",
    "tipoTransaccion"
})
public class DatosConsultaDetalles {

    @XmlElementRef(name = "cveAlfaEntFedNac", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cveAlfaEntFedNac;
    @XmlElementRef(name = "cveEntidadEmisora", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cveEntidadEmisora;
    @XmlElementRef(name = "cveUsuario", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cveUsuario;
    @XmlElementRef(name = "direccionIp", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> direccionIp;
    @XmlElementRef(name = "fechaNacimiento", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> fechaNacimiento;
    @XmlElementRef(name = "nombre", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "password", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "primerApellido", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> primerApellido;
    @XmlElementRef(name = "segundoApellido", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> segundoApellido;
    @XmlElementRef(name = "sexo", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> sexo;
    protected Integer tipoTransaccion;

    /**
     * Obtiene el valor de la propiedad cveAlfaEntFedNac.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCveAlfaEntFedNac() {
        return cveAlfaEntFedNac;
    }

    /**
     * Define el valor de la propiedad cveAlfaEntFedNac.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCveAlfaEntFedNac(JAXBElement<String> value) {
        this.cveAlfaEntFedNac = value;
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
     * Obtiene el valor de la propiedad cveUsuario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCveUsuario() {
        return cveUsuario;
    }

    /**
     * Define el valor de la propiedad cveUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCveUsuario(JAXBElement<String> value) {
        this.cveUsuario = value;
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
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaNacimiento(JAXBElement<String> value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombre(JAXBElement<String> value) {
        this.nombre = value;
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
     * Obtiene el valor de la propiedad primerApellido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimerApellido(JAXBElement<String> value) {
        this.primerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Define el valor de la propiedad segundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegundoApellido(JAXBElement<String> value) {
        this.segundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSexo(JAXBElement<String> value) {
        this.sexo = value;
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

}
