
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
 *         &lt;element name="checkidcardResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "checkidcardResult"
})
@XmlRootElement(name = "checkidcardResponse")
public class CheckidcardResponse {

    @XmlElement(required = true, nillable = true)
    protected String checkidcardResult;

    /**
     * ��ȡcheckidcardResult���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCheckidcardResult() {
        return checkidcardResult;
    }

    /**
     * ����checkidcardResult���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCheckidcardResult(String value) {
        this.checkidcardResult = value;
    }

}
