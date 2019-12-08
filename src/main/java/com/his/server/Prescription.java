
package com.his.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>prescription complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="prescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clinicno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doctor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doctorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemclass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newvisitno" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="orderby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderclass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visitdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visitdate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "prescription", propOrder = {
    "cardno",
    "clinicno",
    "doctor",
    "doctorno",
    "itemclass",
    "newvisitno",
    "orderby",
    "orderclass",
    "outss",
    "serialno",
    "visitdate",
    "visitdate2",
    "visitno"
})
public class Prescription {

    protected String cardno;
    protected String clinicno;
    protected String doctor;
    protected String doctorno;
    protected String itemclass;
    protected Integer newvisitno;
    protected String orderby;
    protected String orderclass;
    protected String outss;
    protected String serialno;
    protected String visitdate;
    protected String visitdate2;
    protected Integer visitno;

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
     * 获取itemclass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemclass() {
        return itemclass;
    }

    /**
     * 设置itemclass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemclass(String value) {
        this.itemclass = value;
    }

    /**
     * 获取newvisitno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewvisitno() {
        return newvisitno;
    }

    /**
     * 设置newvisitno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewvisitno(Integer value) {
        this.newvisitno = value;
    }

    /**
     * 获取orderby属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderby() {
        return orderby;
    }

    /**
     * 设置orderby属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderby(String value) {
        this.orderby = value;
    }

    /**
     * 获取orderclass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderclass() {
        return orderclass;
    }

    /**
     * 设置orderclass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderclass(String value) {
        this.orderclass = value;
    }

    /**
     * 获取outss属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutss() {
        return outss;
    }

    /**
     * 设置outss属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutss(String value) {
        this.outss = value;
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
     * 获取visitdate2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitdate2() {
        return visitdate2;
    }

    /**
     * 设置visitdate2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitdate2(String value) {
        this.visitdate2 = value;
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
