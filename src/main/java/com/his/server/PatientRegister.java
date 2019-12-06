
package com.his.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>patientRegister complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 *
 * <pre>
 * &lt;complexType name="patientRegister">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="amorpm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clinicno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clinictype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hosdepcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcptno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registfee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="serialno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradeno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visitdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visitdept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visitno" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patientRegister", propOrder = {
        "age",
        "amorpm",
        "cardno",
        "chargetype",
        "clinicno",
        "clinictype",
        "doccode",
        "hosdepcode",
        "name",
        "rcptno",
        "regcode",
        "regdate",
        "registfee",
        "serialno",
        "sex",
        "tradeno",
        "visitdate",
        "visitdept",
        "visitno"
})
public class PatientRegister {

    protected Integer age;
    protected String amorpm;
    protected String cardno;
    protected String chargetype;
    protected String clinicno;
    protected String clinictype;
    protected String doccode;
    protected String hosdepcode;
    protected String name;
    protected String rcptno;
    protected String regcode;
    protected String regdate;
    protected double registfee;
    protected String serialno;
    protected String sex;
    protected String tradeno;
    protected String visitdate;
    protected String visitdept;
    protected Integer visitno;

    /**
     * ��ȡage���Ե�ֵ��
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getAge() {
        return age;
    }

    /**
     * ����age���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * ��ȡamorpm���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAmorpm() {
        return amorpm;
    }

    /**
     * ����amorpm���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAmorpm(String value) {
        this.amorpm = value;
    }

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
     * ��ȡchargetype���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getChargetype() {
        return chargetype;
    }

    /**
     * ����chargetype���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setChargetype(String value) {
        this.chargetype = value;
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
     * ��ȡclinictype���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getClinictype() {
        return clinictype;
    }

    /**
     * ����clinictype���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClinictype(String value) {
        this.clinictype = value;
    }

    /**
     * ��ȡdoccode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDoccode() {
        return doccode;
    }

    /**
     * ����doccode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDoccode(String value) {
        this.doccode = value;
    }

    /**
     * ��ȡhosdepcode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHosdepcode() {
        return hosdepcode;
    }

    /**
     * ����hosdepcode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHosdepcode(String value) {
        this.hosdepcode = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡrcptno���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRcptno() {
        return rcptno;
    }

    /**
     * ����rcptno���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRcptno(String value) {
        this.rcptno = value;
    }

    /**
     * ��ȡregcode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRegcode() {
        return regcode;
    }

    /**
     * ����regcode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRegcode(String value) {
        this.regcode = value;
    }

    /**
     * ��ȡregdate���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRegdate() {
        return regdate;
    }

    /**
     * ����regdate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRegdate(String value) {
        this.regdate = value;
    }

    /**
     * ��ȡregistfee���Ե�ֵ��
     */
    public double getRegistfee() {
        return registfee;
    }

    /**
     * ����registfee���Ե�ֵ��
     */
    public void setRegistfee(double value) {
        this.registfee = value;
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
     * ��ȡsex���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSex() {
        return sex;
    }

    /**
     * ����sex���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * ��ȡtradeno���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTradeno() {
        return tradeno;
    }

    /**
     * ����tradeno���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTradeno(String value) {
        this.tradeno = value;
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
     * ��ȡvisitdept���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getVisitdept() {
        return visitdept;
    }

    /**
     * ����visitdept���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVisitdept(String value) {
        this.visitdept = value;
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
