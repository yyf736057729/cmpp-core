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
    "inviteID",
    "inviteType",
    "sender",
    "groupID",
    "presenceSubList",
    "urlList",
    "inviteNote",
    "validity"
})
@XmlRootElement(name = "InviteUser-Request")
public class InviteUserRequest {

    @XmlElement(name = "InviteID", required = true)
    protected String inviteID;
    @XmlElement(name = "InviteType", required = true)
    protected String inviteType;
    @XmlElement(name = "Sender", required = true)
    protected Sender sender;
    @XmlElement(name = "GroupID")
    protected GroupID groupID;
    @XmlElement(name = "PresenceSubList")
    protected PresenceSubList presenceSubList;
    @XmlElement(name = "URLList")
    protected URLList urlList;
    @XmlElement(name = "InviteNote")
    protected String inviteNote;
    @XmlElement(name = "Validity")
    protected String validity;

    /**
     * Gets the value of the inviteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviteID() {
        return inviteID;
    }

    /**
     * Sets the value of the inviteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviteID(String value) {
        this.inviteID = value;
    }

    /**
     * Gets the value of the inviteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviteType() {
        return inviteType;
    }

    /**
     * Sets the value of the inviteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviteType(String value) {
        this.inviteType = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link GroupID }
     *     
     */
    public GroupID getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupID }
     *     
     */
    public void setGroupID(GroupID value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the presenceSubList property.
     * 
     * @return
     *     possible object is
     *     {@link PresenceSubList }
     *     
     */
    public PresenceSubList getPresenceSubList() {
        return presenceSubList;
    }

    /**
     * Sets the value of the presenceSubList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresenceSubList }
     *     
     */
    public void setPresenceSubList(PresenceSubList value) {
        this.presenceSubList = value;
    }

    /**
     * Gets the value of the urlList property.
     * 
     * @return
     *     possible object is
     *     {@link URLList }
     *     
     */
    public URLList getURLList() {
        return urlList;
    }

    /**
     * Sets the value of the urlList property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLList }
     *     
     */
    public void setURLList(URLList value) {
        this.urlList = value;
    }

    /**
     * Gets the value of the inviteNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviteNote() {
        return inviteNote;
    }

    /**
     * Sets the value of the inviteNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviteNote(String value) {
        this.inviteNote = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidity(String value) {
        this.validity = value;
    }

}
