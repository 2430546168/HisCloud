
package org.tempurl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paybilltrade1Result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "paybilltrade1Result"
})
@XmlRootElement(name = "paybilltrade1Response")
public class Paybilltrade1Response {

    @XmlElement(required = true, nillable = true)
    protected String paybilltrade1Result;

    /**
     * ��ȡpaybilltrade1Result���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPaybilltrade1Result() {
        return paybilltrade1Result;
    }

    /**
     * ����paybilltrade1Result���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPaybilltrade1Result(String value) {
        this.paybilltrade1Result = value;
    }

}
