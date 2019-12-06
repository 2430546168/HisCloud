
package com.his.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>evaluate complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 *
 * <pre>
 * &lt;complexType name="evaluate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="amorpm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clinicno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deletion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="doccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hosdeptname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hosdocname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="openid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patientid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pjdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registerfee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tdpj" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="testno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visitno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zdpj" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluate", propOrder = {
        "age",
        "amorpm",
        "birthdate",
        "cardname",
        "clinicno",
        "content",
        "deletion",
        "doccode",
        "docname",
        "hosdeptname",
        "hosdocname",
        "idno",
        "name",
        "num",
        "openid",
        "patientid",
        "pjdate",
        "regcode",
        "regdate",
        "registerfee",
        "sex",
        "tdpj",
        "testno",
        "visitno",
        "zdpj"
})
public class Evaluate {

    protected Integer age;
    protected String amorpm;
    protected String birthdate;
    protected String cardname;
    protected String clinicno;
    protected String content;
    protected Integer deletion;
    protected String doccode;
    protected String docname;
    protected String hosdeptname;
    protected String hosdocname;
    protected String idno;
    protected String name;
    protected Integer num;
    protected String openid;
    protected String patientid;
    protected String pjdate;
    protected String regcode;
    protected String regdate;
    protected String registerfee;
    protected String sex;
    protected Integer tdpj;
    protected String testno;
    protected String visitno;
    protected Integer zdpj;

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
     * ��ȡbirthdate���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * ����birthdate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBirthdate(String value) {
        this.birthdate = value;
    }

    /**
     * ��ȡcardname���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCardname() {
        return cardname;
    }

    /**
     * ����cardname���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCardname(String value) {
        this.cardname = value;
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
     * ��ȡcontent���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getContent() {
        return content;
    }

    /**
     * ����content���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * ��ȡdeletion���Ե�ֵ��
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDeletion() {
        return deletion;
    }

    /**
     * ����deletion���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setDeletion(Integer value) {
        this.deletion = value;
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
     * ��ȡdocname���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocname() {
        return docname;
    }

    /**
     * ����docname���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocname(String value) {
        this.docname = value;
    }

    /**
     * ��ȡhosdeptname���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHosdeptname() {
        return hosdeptname;
    }

    /**
     * ����hosdeptname���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHosdeptname(String value) {
        this.hosdeptname = value;
    }

    /**
     * ��ȡhosdocname���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHosdocname() {
        return hosdocname;
    }

    /**
     * ����hosdocname���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHosdocname(String value) {
        this.hosdocname = value;
    }

    /**
     * ��ȡidno���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getIdno() {
        return idno;
    }

    /**
     * ����idno���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIdno(String value) {
        this.idno = value;
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
     * ��ȡnum���Ե�ֵ��
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getNum() {
        return num;
    }

    /**
     * ����num���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setNum(Integer value) {
        this.num = value;
    }

    /**
     * ��ȡopenid���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * ����openid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOpenid(String value) {
        this.openid = value;
    }

    /**
     * ��ȡpatientid���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPatientid() {
        return patientid;
    }

    /**
     * ����patientid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPatientid(String value) {
        this.patientid = value;
    }

    /**
     * ��ȡpjdate���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPjdate() {
        return pjdate;
    }

    /**
     * ����pjdate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPjdate(String value) {
        this.pjdate = value;
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
     * ��ȡregisterfee���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRegisterfee() {
        return registerfee;
    }

    /**
     * ����registerfee���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRegisterfee(String value) {
        this.registerfee = value;
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
     * ��ȡtdpj���Ե�ֵ��
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTdpj() {
        return tdpj;
    }

    /**
     * ����tdpj���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setTdpj(Integer value) {
        this.tdpj = value;
    }

    /**
     * ��ȡtestno���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTestno() {
        return testno;
    }

    /**
     * ����testno���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTestno(String value) {
        this.testno = value;
    }

    /**
     * ��ȡvisitno���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getVisitno() {
        return visitno;
    }

    /**
     * ����visitno���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVisitno(String value) {
        this.visitno = value;
    }

    /**
     * ��ȡzdpj���Ե�ֵ��
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getZdpj() {
        return zdpj;
    }

    /**
     * ����zdpj���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setZdpj(Integer value) {
        this.zdpj = value;
    }

}
