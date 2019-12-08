
package com.his.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>medicalrecord complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="medicalrecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anamnesis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bodyexam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diagdesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doctor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doctorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="familyall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="illnessdesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="individual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marrital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maternity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medhistory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medicalrecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="menses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationrecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="visitdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visitno" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicalrecord", propOrder = {
    "advice",
    "anamnesis",
    "bodyexam",
    "cardno",
    "diagdesc",
    "doctor",
    "doctorno",
    "familyall",
    "illnessdesc",
    "individual",
    "marrital",
    "maternity",
    "medhistory",
    "medicalrecord",
    "memo",
    "menses",
    "operationrecord",
    "ordinal",
    "visitdate",
    "visitno"
})
public class Medicalrecord {

    protected String advice;
    protected String anamnesis;
    protected String bodyexam;
    protected String cardno;
    protected String diagdesc;
    protected String doctor;
    protected String doctorno;
    protected String familyall;
    protected String illnessdesc;
    protected String individual;
    protected String marrital;
    protected String maternity;
    protected String medhistory;
    protected String medicalrecord;
    protected String memo;
    protected String menses;
    protected String operationrecord;
    protected Integer ordinal;
    protected String visitdate;
    protected Integer visitno;

    /**
     * 获取advice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvice() {
        return advice;
    }

    /**
     * 设置advice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvice(String value) {
        this.advice = value;
    }

    /**
     * 获取anamnesis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnamnesis() {
        return anamnesis;
    }

    /**
     * 设置anamnesis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnamnesis(String value) {
        this.anamnesis = value;
    }

    /**
     * 获取bodyexam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyexam() {
        return bodyexam;
    }

    /**
     * 设置bodyexam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyexam(String value) {
        this.bodyexam = value;
    }

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
     * 获取diagdesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagdesc() {
        return diagdesc;
    }

    /**
     * 设置diagdesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagdesc(String value) {
        this.diagdesc = value;
    }

    /**
     * 获取doctor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctor() {
        return doctor;
    }

    /**
     * 设置doctor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctor(String value) {
        this.doctor = value;
    }

    /**
     * 获取doctorno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorno() {
        return doctorno;
    }

    /**
     * 设置doctorno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorno(String value) {
        this.doctorno = value;
    }

    /**
     * 获取familyall属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyall() {
        return familyall;
    }

    /**
     * 设置familyall属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyall(String value) {
        this.familyall = value;
    }

    /**
     * 获取illnessdesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIllnessdesc() {
        return illnessdesc;
    }

    /**
     * 设置illnessdesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIllnessdesc(String value) {
        this.illnessdesc = value;
    }

    /**
     * 获取individual属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividual() {
        return individual;
    }

    /**
     * 设置individual属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividual(String value) {
        this.individual = value;
    }

    /**
     * 获取marrital属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarrital() {
        return marrital;
    }

    /**
     * 设置marrital属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarrital(String value) {
        this.marrital = value;
    }

    /**
     * 获取maternity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaternity() {
        return maternity;
    }

    /**
     * 设置maternity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaternity(String value) {
        this.maternity = value;
    }

    /**
     * 获取medhistory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedhistory() {
        return medhistory;
    }

    /**
     * 设置medhistory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedhistory(String value) {
        this.medhistory = value;
    }

    /**
     * 获取medicalrecord属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalrecord() {
        return medicalrecord;
    }

    /**
     * 设置medicalrecord属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalrecord(String value) {
        this.medicalrecord = value;
    }

    /**
     * 获取memo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置memo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * 获取menses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenses() {
        return menses;
    }

    /**
     * 设置menses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenses(String value) {
        this.menses = value;
    }

    /**
     * 获取operationrecord属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationrecord() {
        return operationrecord;
    }

    /**
     * 设置operationrecord属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationrecord(String value) {
        this.operationrecord = value;
    }

    /**
     * 获取ordinal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    /**
     * 设置ordinal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdinal(Integer value) {
        this.ordinal = value;
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
     *     {@link Integer }
     *     
     */
    public Integer getVisitno() {
        return visitno;
    }

    /**
     * 设置visitno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisitno(Integer value) {
        this.visitno = value;
    }

}
