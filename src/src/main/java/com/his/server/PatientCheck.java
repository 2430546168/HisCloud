
package com.his.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>patientCheck complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="patientCheck">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clindiag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clinicno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptioncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doctoruser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="examclass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="examsubclass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patientsource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="performedby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqdatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqdept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqphysician" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visitdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visitno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patientCheck", propOrder = {
    "cardno",
    "clindiag",
    "clinicno",
    "descriptioncode",
    "doctoruser",
    "examclass",
    "examsubclass",
    "patientsource",
    "performedby",
    "projectname",
    "reqdatetime",
    "reqdept",
    "reqphysician",
    "serialno",
    "visitdate",
    "visitno"
})
public class PatientCheck {

    protected String cardno;
    protected String clindiag;
    protected String clinicno;
    protected String descriptioncode;
    protected String doctoruser;
    protected String examclass;
    protected String examsubclass;
    protected String patientsource;
    protected String performedby;
    protected String projectname;
    protected String reqdatetime;
    protected String reqdept;
    protected String reqphysician;
    protected String serialno;
    protected String visitdate;
    protected String visitno;

    /**
     * 获取cardno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * 设置cardno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardno(String value) {
        this.cardno = value;
    }

    /**
     * 获取clindiag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClindiag() {
        return clindiag;
    }

    /**
     * 设置clindiag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClindiag(String value) {
        this.clindiag = value;
    }

    /**
     * 获取clinicno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicno() {
        return clinicno;
    }

    /**
     * 设置clinicno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicno(String value) {
        this.clinicno = value;
    }

    /**
     * 获取descriptioncode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptioncode() {
        return descriptioncode;
    }

    /**
     * 设置descriptioncode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptioncode(String value) {
        this.descriptioncode = value;
    }

    /**
     * 获取doctoruser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctoruser() {
        return doctoruser;
    }

    /**
     * 设置doctoruser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctoruser(String value) {
        this.doctoruser = value;
    }

    /**
     * 获取examclass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamclass() {
        return examclass;
    }

    /**
     * 设置examclass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamclass(String value) {
        this.examclass = value;
    }

    /**
     * 获取examsubclass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamsubclass() {
        return examsubclass;
    }

    /**
     * 设置examsubclass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamsubclass(String value) {
        this.examsubclass = value;
    }

    /**
     * 获取patientsource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientsource() {
        return patientsource;
    }

    /**
     * 设置patientsource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientsource(String value) {
        this.patientsource = value;
    }

    /**
     * 获取performedby属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformedby() {
        return performedby;
    }

    /**
     * 设置performedby属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformedby(String value) {
        this.performedby = value;
    }

    /**
     * 获取projectname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectname() {
        return projectname;
    }

    /**
     * 设置projectname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectname(String value) {
        this.projectname = value;
    }

    /**
     * 获取reqdatetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdatetime() {
        return reqdatetime;
    }

    /**
     * 设置reqdatetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqdatetime(String value) {
        this.reqdatetime = value;
    }

    /**
     * 获取reqdept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdept() {
        return reqdept;
    }

    /**
     * 设置reqdept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqdept(String value) {
        this.reqdept = value;
    }

    /**
     * 获取reqphysician属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqphysician() {
        return reqphysician;
    }

    /**
     * 设置reqphysician属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqphysician(String value) {
        this.reqphysician = value;
    }

    /**
     * 获取serialno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialno() {
        return serialno;
    }

    /**
     * 设置serialno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialno(String value) {
        this.serialno = value;
    }

    /**
     * 获取visitdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitdate() {
        return visitdate;
    }

    /**
     * 设置visitdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitdate(String value) {
        this.visitdate = value;
    }

    /**
     * 获取visitno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitno() {
        return visitno;
    }

    /**
     * 设置visitno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitno(String value) {
        this.visitno = value;
    }

}
