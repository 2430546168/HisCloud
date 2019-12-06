
package com.his.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>patientCheck complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡclindiag���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getClindiag() {
        return clindiag;
    }

    /**
     * ����clindiag���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClindiag(String value) {
        this.clindiag = value;
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
     * ��ȡdescriptioncode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescriptioncode() {
        return descriptioncode;
    }

    /**
     * ����descriptioncode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescriptioncode(String value) {
        this.descriptioncode = value;
    }

    /**
     * ��ȡdoctoruser���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDoctoruser() {
        return doctoruser;
    }

    /**
     * ����doctoruser���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDoctoruser(String value) {
        this.doctoruser = value;
    }

    /**
     * ��ȡexamclass���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getExamclass() {
        return examclass;
    }

    /**
     * ����examclass���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExamclass(String value) {
        this.examclass = value;
    }

    /**
     * ��ȡexamsubclass���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getExamsubclass() {
        return examsubclass;
    }

    /**
     * ����examsubclass���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExamsubclass(String value) {
        this.examsubclass = value;
    }

    /**
     * ��ȡpatientsource���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPatientsource() {
        return patientsource;
    }

    /**
     * ����patientsource���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPatientsource(String value) {
        this.patientsource = value;
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
     * ��ȡprojectname���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getProjectname() {
        return projectname;
    }

    /**
     * ����projectname���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProjectname(String value) {
        this.projectname = value;
    }

    /**
     * ��ȡreqdatetime���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getReqdatetime() {
        return reqdatetime;
    }

    /**
     * ����reqdatetime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReqdatetime(String value) {
        this.reqdatetime = value;
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
