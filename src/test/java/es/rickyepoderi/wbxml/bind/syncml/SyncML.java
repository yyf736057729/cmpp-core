//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.30 at 11:39:15 AM CEST 
//


package es.rickyepoderi.wbxml.bind.syncml;

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
    "syncHdr",
    "syncBody"
})
@XmlRootElement(name = "SyncML", namespace="SYNCML:SYNCML1.1")
public class SyncML {

    @XmlElement(name = "SyncHdr", namespace="SYNCML:SYNCML1.1", required = true)
    protected SyncHdr syncHdr;
    @XmlElement(name = "SyncBody", namespace="SYNCML:SYNCML1.1", required = true)
    protected SyncBody syncBody;

    /**
     * Gets the value of the syncHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SyncHdr }
     *     
     */
    public SyncHdr getSyncHdr() {
        return syncHdr;
    }

    /**
     * Sets the value of the syncHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncHdr }
     *     
     */
    public void setSyncHdr(SyncHdr value) {
        this.syncHdr = value;
    }

    /**
     * Gets the value of the syncBody property.
     * 
     * @return
     *     possible object is
     *     {@link SyncBody }
     *     
     */
    public SyncBody getSyncBody() {
        return syncBody;
    }

    /**
     * Sets the value of the syncBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncBody }
     *     
     */
    public void setSyncBody(SyncBody value) {
        this.syncBody = value;
    }

}
