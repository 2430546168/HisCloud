
package com.his.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>medicalrecord complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡadvice���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAdvice() {
        return advice;
    }

    /**
     * ����advice���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAdvice(String value) {
        this.advice = value;
    }

    /**
     * ��ȡanamnesis���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAnamnesis() {
        return anamnesis;
    }

    /**
     * ����anamnesis���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAnamnesis(String value) {
        this.anamnesis = value;
    }

    /**
     * ��ȡbodyexam���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBodyexam() {
        return bodyexam;
    }

    /**
     * ����bodyexam���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBodyexam(String value) {
        this.bodyexam = value;
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
     * ��ȡdiagdesc���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDiagdesc() {
        return diagdesc;
    }

    /**
     * ����diagdesc���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDiagdesc(String value) {
        this.diagdesc = value;
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
     * ��ȡfamilyall���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getFamilyall() {
        return familyall;
    }

    /**
     * ����familyall���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFamilyall(String value) {
        this.familyall = value;
    }

    /**
     * ��ȡillnessdesc���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getIllnessdesc() {
        return illnessdesc;
    }

    /**
     * ����illnessdesc���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIllnessdesc(String value) {
        this.illnessdesc = value;
    }

    /**
     * ��ȡindividual���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getIndividual() {
        return individual;
    }

    /**
     * ����individual���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIndividual(String value) {
        this.individual = value;
    }

    /**
     * ��ȡmarrital���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMarrital() {
        return marrital;
    }

    /**
     * ����marrital���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMarrital(String value) {
        this.marrital = value;
    }

    /**
     * ��ȡmaternity���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaternity() {
        return maternity;
    }

    /**
     * ����maternity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaternity(String value) {
        this.maternity = value;
    }

    /**
     * ��ȡmedhistory���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMedhistory() {
        return medhistory;
    }

    /**
     * ����medhistory���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMedhistory(String value) {
        this.medhistory = value;
    }

    /**
     * ��ȡmedicalrecord���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMedicalrecord() {
        return medicalrecord;
    }

    /**
     * ����medicalrecord���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMedicalrecord(String value) {
        this.medicalrecord = value;
    }

    /**
     * ��ȡmemo���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMemo() {
        return memo;
    }

    /**
     * ����memo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * ��ȡmenses���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMenses() {
        return menses;
    }

    /**
     * ����menses���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMenses(String value) {
        this.menses = value;
    }

    /**
     * ��ȡoperationrecord���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOperationrecord() {
        return operationrecord;
    }

    /**
     * ����operationrecord���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOperationrecord(String value) {
        this.operationrecord = value;
    }

    /**
     * ��ȡordinal���Ե�ֵ��
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    /**
     * ����ordinal���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setOrdinal(Integer value) {
        this.ordinal = value;
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
