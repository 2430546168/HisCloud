
package com.his.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>assay complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 *
 * <pre>
 * &lt;complexType name="assay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clinicno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doctorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patientid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="performedby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqdept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqphysician" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specimen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sysdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visitdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visitno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assay", propOrder = {
        "chargetype",
        "clinicno",
        "doctorno",
        "itemcode",
        "itemname",
        "patientid",
        "performedby",
        "reqdept",
        "reqphysician",
        "serialno",
        "specimen",
        "sysdate",
        "testno",
        "visitdate",
        "visitno"
})
public class Assay {

    protected String chargetype;
    protected String clinicno;
    protected String doctorno;
    protected String itemcode;
    protected String itemname;
    protected String patientid;
    protected String performedby;
    protected String reqdept;
    protected String reqphysician;
    protected String serialno;
    protected String specimen;
    protected String sysdate;
    protected String testno;
    protected String visitdate;
    protected String visitno;

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
     * ��ȡitemcode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getItemcode() {
        return itemcode;
    }

    /**
     * ����itemcode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setItemcode(String value) {
        this.itemcode = value;
    }

    /**
     * ��ȡitemname���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getItemname() {
        return itemname;
    }

    /**
     * ����itemname���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setItemname(String value) {
        this.itemname = value;
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
     * ��ȡperformedby���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPerformedby() {
        return performedby;
    }

    /**
     * ����performedby���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPerformedby(String value) {
        this.performedby = value;
    }

    /**
     * ��ȡreqdept���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getReqdept() {
        return reqdept;
    }

    /**
     * ����reqdept���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReqdept(String value) {
        this.reqdept = value;
    }

    /**
     * ��ȡreqphysician���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getReqphysician() {
        return reqphysician;
    }

    /**
     * ����reqphysician���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReqphysician(String value) {
        this.reqphysician = value;
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
     * ��ȡspecimen���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSpecimen() {
        return specimen;
    }

    /**
     * ����specimen���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSpecimen(String value) {
        this.specimen = value;
    }

    /**
     * ��ȡsysdate���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSysdate() {
        return sysdate;
    }

    /**
     * ����sysdate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSysdate(String value) {
        this.sysdate = value;
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

}
