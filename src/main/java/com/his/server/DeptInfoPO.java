
package com.his.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>deptInfoPO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="deptInfoPO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patientReport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deptInfoPO", propOrder = {
    "deptCode",
    "deptName",
    "patientReport"
})
public class DeptInfoPO {

    protected String deptCode;
    protected String deptName;
    protected String patientReport;

    /**
     * 获取deptCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置deptCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptCode(String value) {
        this.deptCode = value;
    }

    /**
     * 获取deptName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置deptName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptName(String value) {
        this.deptName = value;
    }

    /**
     * 获取patientReport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientReport() {
        return patientReport;
    }

    /**
     * 设置patientReport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientReport(String value) {
        this.patientReport = value;
    }

}
