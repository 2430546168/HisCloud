
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
 *         &lt;element name="getvisitreclistResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getvisitreclistResult"
})
@XmlRootElement(name = "getvisitreclistResponse")
public class GetvisitreclistResponse {

    @XmlElement(required = true, nillable = true)
    protected String getvisitreclistResult;

    /**
     * ��ȡgetvisitreclistResult���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getGetvisitreclistResult() {
        return getvisitreclistResult;
    }

    /**
     * ����getvisitreclistResult���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGetvisitreclistResult(String value) {
        this.getvisitreclistResult = value;
    }

}
