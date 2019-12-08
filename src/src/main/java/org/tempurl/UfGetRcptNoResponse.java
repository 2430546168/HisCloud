
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
 *         &lt;element name="as_return" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "asReturn"
})
@XmlRootElement(name = "uf_get_rcpt_noResponse")
public class UfGetRcptNoResponse {

    @XmlElement(name = "as_return", required = true, nillable = true)
    protected String asReturn;

    /**
     * ��ȡasReturn���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAsReturn() {
        return asReturn;
    }

    /**
     * ����asReturn���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAsReturn(String value) {
        this.asReturn = value;
    }

}
