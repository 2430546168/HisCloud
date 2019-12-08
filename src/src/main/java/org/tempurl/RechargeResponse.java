
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
 *         &lt;element name="rechargeResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "rechargeResult"
})
@XmlRootElement(name = "rechargeResponse")
public class RechargeResponse {

    @XmlElement(required = true, nillable = true)
    protected String rechargeResult;

    /**
     * ��ȡrechargeResult���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRechargeResult() {
        return rechargeResult;
    }

    /**
     * ����rechargeResult���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRechargeResult(String value) {
        this.rechargeResult = value;
    }

}
