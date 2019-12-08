
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
 *         &lt;element name="getregdoctlistResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getregdoctlistResult"
})
@XmlRootElement(name = "getregdoctlistResponse")
public class GetregdoctlistResponse {

    @XmlElement(required = true, nillable = true)
    protected String getregdoctlistResult;

    /**
     * ��ȡgetregdoctlistResult���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getGetregdoctlistResult() {
        return getregdoctlistResult;
    }

    /**
     * ����getregdoctlistResult���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGetregdoctlistResult(String value) {
        this.getregdoctlistResult = value;
    }

}
