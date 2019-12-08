
package com.his.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>adminLevel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="adminLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="levelLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adminLevel", propOrder = {
    "levelLabel",
    "levelValue"
})
public class AdminLevel {

    protected String levelLabel;
    protected String levelValue;

    /**
     * 获取levelLabel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelLabel() {
        return levelLabel;
    }

    /**
     * 设置levelLabel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelLabel(String value) {
        this.levelLabel = value;
    }

    /**
     * 获取levelValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelValue() {
        return levelValue;
    }

    /**
     * 设置levelValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelValue(String value) {
        this.levelValue = value;
    }

}
