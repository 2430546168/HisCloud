
package com.his.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>evaluate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
 * 
 * 
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
     * 获取age属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置age属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * 获取amorpm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmorpm() {
        return amorpm;
    }

    /**
     * 设置amorpm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmorpm(String value) {
        this.amorpm = value;
    }

    /**
     * 获取birthdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * 设置birthdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdate(String value) {
        this.birthdate = value;
    }

    /**
     * 获取cardname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardname() {
        return cardname;
    }

    /**
     * 设置cardname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardname(String value) {
        this.cardname = value;
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
     * 获取content属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置content属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * 获取deletion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeletion() {
        return deletion;
    }

    /**
     * 设置deletion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeletion(Integer value) {
        this.deletion = value;
    }

    /**
     * 获取doccode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoccode() {
        return doccode;
    }

    /**
     * 设置doccode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoccode(String value) {
        this.doccode = value;
    }

    /**
     * 获取docname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocname() {
        return docname;
    }

    /**
     * 设置docname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocname(String value) {
        this.docname = value;
    }

    /**
     * 获取hosdeptname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHosdeptname() {
        return hosdeptname;
    }

    /**
     * 设置hosdeptname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHosdeptname(String value) {
        this.hosdeptname = value;
    }

    /**
     * 获取hosdocname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHosdocname() {
        return hosdocname;
    }

    /**
     * 设置hosdocname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHosdocname(String value) {
        this.hosdocname = value;
    }

    /**
     * 获取idno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdno() {
        return idno;
    }

    /**
     * 设置idno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdno(String value) {
        this.idno = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取num属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置num属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNum(Integer value) {
        this.num = value;
    }

    /**
     * 获取openid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置openid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenid(String value) {
        this.openid = value;
    }

    /**
     * 获取patientid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientid() {
        return patientid;
    }

    /**
     * 设置patientid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientid(String value) {
        this.patientid = value;
    }

    /**
     * 获取pjdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPjdate() {
        return pjdate;
    }

    /**
     * 设置pjdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPjdate(String value) {
        this.pjdate = value;
    }

    /**
     * 获取regcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegcode() {
        return regcode;
    }

    /**
     * 设置regcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegcode(String value) {
        this.regcode = value;
    }

    /**
     * 获取regdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegdate() {
        return regdate;
    }

    /**
     * 设置regdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegdate(String value) {
        this.regdate = value;
    }

    /**
     * 获取registerfee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterfee() {
        return registerfee;
    }

    /**
     * 设置registerfee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterfee(String value) {
        this.registerfee = value;
    }

    /**
     * 获取sex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * 获取tdpj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTdpj() {
        return tdpj;
    }

    /**
     * 设置tdpj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTdpj(Integer value) {
        this.tdpj = value;
    }

    /**
     * 获取testno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestno() {
        return testno;
    }

    /**
     * 设置testno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestno(String value) {
        this.testno = value;
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

    /**
     * 获取zdpj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZdpj() {
        return zdpj;
    }

    /**
     * 设置zdpj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZdpj(Integer value) {
        this.zdpj = value;
    }

}
