
package com.his.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>patients complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 *
 * <pre>
 * &lt;complexType name="patients">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="openid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stauts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patients", propOrder = {
        "adress",
        "birthdate",
        "cardno",
        "idno",
        "name",
        "num",
        "openid",
        "phone",
        "sex",
        "stauts"
})
public class Patients {

    protected String adress;
    protected String birthdate;
    protected String cardno;
    protected String idno;
    protected String name;
    protected int num;
    protected String openid;
    protected String phone;
    protected String sex;
    protected Integer stauts;

    /**
     * ��ȡadress���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAdress() {
        return adress;
    }

    /**
     * ����adress���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAdress(String value) {
        this.adress = value;
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
     */
    public int getNum() {
        return num;
    }

    /**
     * ����num���Ե�ֵ��
     */
    public void setNum(int value) {
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
     * ��ȡphone���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPhone() {
        return phone;
    }

    /**
     * ����phone���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPhone(String value) {
        this.phone = value;
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
     * ��ȡstauts���Ե�ֵ��
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getStauts() {
        return stauts;
    }

    /**
     * ����stauts���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setStauts(Integer value) {
        this.stauts = value;
    }

}
