
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
 *         &lt;element name="uf_get_prepayment_rcptResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ufGetPrepaymentRcptResult"
})
@XmlRootElement(name = "uf_get_prepayment_rcptResponse")
public class UfGetPrepaymentRcptResponse {

    @XmlElement(name = "uf_get_prepayment_rcptResult", required = true, nillable = true)
    protected String ufGetPrepaymentRcptResult;

    /**
     * ��ȡufGetPrepaymentRcptResult���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getUfGetPrepaymentRcptResult() {
        return ufGetPrepaymentRcptResult;
    }

    /**
     * ����ufGetPrepaymentRcptResult���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUfGetPrepaymentRcptResult(String value) {
        this.ufGetPrepaymentRcptResult = value;
    }

}
