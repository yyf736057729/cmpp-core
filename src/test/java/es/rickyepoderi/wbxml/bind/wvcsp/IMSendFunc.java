//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.25 at 05:48:09 PM CEST 
//


package es.rickyepoderi.wbxml.bind.wvcsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mdeliv",
    "fwmsg"
})
@XmlRootElement(name = "IMSendFunc")
public class IMSendFunc {

    @XmlElement(name = "MDELIV")
    protected MDELIV mdeliv;
    @XmlElement(name = "FWMSG")
    protected FWMSG fwmsg;

    /**
     * Gets the value of the mdeliv property.
     * 
     * @return
     *     possible object is
     *     {@link MDELIV }
     *     
     */
    public MDELIV getMDELIV() {
        return mdeliv;
    }

    /**
     * Sets the value of the mdeliv property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDELIV }
     *     
     */
    public void setMDELIV(MDELIV value) {
        this.mdeliv = value;
    }

    /**
     * Gets the value of the fwmsg property.
     * 
     * @return
     *     possible object is
     *     {@link FWMSG }
     *     
     */
    public FWMSG getFWMSG() {
        return fwmsg;
    }

    /**
     * Sets the value of the fwmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FWMSG }
     *     
     */
    public void setFWMSG(FWMSG value) {
        this.fwmsg = value;
    }

}
