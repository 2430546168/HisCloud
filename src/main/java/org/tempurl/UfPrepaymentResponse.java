
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
 *         &lt;element name="uf_prepaymentResult" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ufPrepaymentResult"
})
@XmlRootElement(name = "uf_prepaymentResponse")
public class UfPrepaymentResponse {

    @XmlElement(name = "uf_prepaymentResult", required = true, type = Short.class, nillable = true)
    protected Short ufPrepaymentResult;

    /**
     * ��ȡufPrepaymentResult���Ե�ֵ��
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getUfPrepaymentResult() {
        return ufPrepaymentResult;
    }

    /**
     * ����ufPrepaymentResult���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setUfPrepaymentResult(Short value) {
        this.ufPrepaymentResult = value;
    }

}
