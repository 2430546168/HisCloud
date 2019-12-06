
package com.his.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>prescription complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcardno���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * ����cardno���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCardno(String value) {
        this.cardno = value;
    }

    /**
     * ��ȡclinicno���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getClinicno() {
        return clinicno;
    }

    /**
     * ����clinicno���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClinicno(String value) {
        this.clinicno = value;
    }

    /**
     * ��ȡdoctor���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDoctor() {
        return doctor;
    }

    /**
     * ����doctor���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDoctor(String value) {
        this.doctor = value;
    }

    /**
     * ��ȡdoctorno���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDoctorno() {
        return doctorno;
    }

    /**
     * ����doctorno���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDoctorno(String value) {
        this.doctorno = value;
    }

    /**
     * ��ȡitemclass���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getItemclass() {
        return itemclass;
    }

    /**
     * ����itemclass���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setItemclass(String value) {
        this.itemclass = value;
    }

    /**
     * ��ȡnewvisitno���Ե�ֵ��
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getNewvisitno() {
        return newvisitno;
    }

    /**
     * ����newvisitno���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setNewvisitno(Integer value) {
        this.newvisitno = value;
    }

    /**
     * ��ȡorderby���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrderby() {
        return orderby;
    }

    /**
     * ����orderby���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrderby(String value) {
        this.orderby = value;
    }

    /**
     * ��ȡorderclass���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrderclass() {
        return orderclass;
    }

    /**
     * ����orderclass���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrderclass(String value) {
        this.orderclass = value;
    }

    /**
     * ��ȡoutss���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOutss() {
        return outss;
    }

    /**
     * ����outss���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOutss(String value) {
        this.outss = value;
    }

    /**
     * ��ȡserialno���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSerialno() {
        return serialno;
    }

    /**
     * ����serialno���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSerialno(String value) {
        this.serialno = value;
    }

    /**
     * ��ȡvisitdate���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getVisitdate() {
        return visitdate;
    }

    /**
     * ����visitdate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVisitdate(String value) {
        this.visitdate = value;
    }

    /**
     * ��ȡvisitdate2���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getVisitdate2() {
        return visitdate2;
    }

    /**
     * ����visitdate2���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVisitdate2(String value) {
        this.visitdate2 = value;
    }

    /**
     * ��ȡvisitno���Ե�ֵ��
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getVisitno() {
        return visitno;
    }

    /**
     * ����visitno���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setVisitno(Integer value) {
        this.visitno = value;
    }

}
