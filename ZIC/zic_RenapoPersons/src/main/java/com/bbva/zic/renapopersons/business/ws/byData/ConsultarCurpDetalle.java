
package com.bbva.zic.renapopersons.business.ws.byData;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.bbva.zic.renapopersons.business.ws.byData.xsd.DatosConsultaDetalles;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datos" type="{http://services.wserv.ecurp.dgti.segob.gob.mx/xsd}DatosConsultaDetalles" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "datos"
})
@XmlRootElement(name = "consultarCurpDetalle")
public class ConsultarCurpDetalle {

    @XmlElementRef(name = "datos", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", type = JAXBElement.class)
    protected JAXBElement<DatosConsultaDetalles> datos;

    /**
     * Obtiene el valor de la propiedad datos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosConsultaDetalles }{@code >}
     *     
     */
    public JAXBElement<DatosConsultaDetalles> getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosConsultaDetalles }{@code >}
     *     
     */
    public void setDatos(JAXBElement<DatosConsultaDetalles> value) {
        this.datos = value;
    }

}
