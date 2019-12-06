
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
 *         &lt;element name="lockregistResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "lockregistResult"
})
@XmlRootElement(name = "lockregistResponse")
public class LockregistResponse {

    @XmlElement(required = true, nillable = true)
    protected String lockregistResult;

    /**
     * ��ȡlockregistResult���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getLockregistResult() {
        return lockregistResult;
    }

    /**
     * ����lockregistResult���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLockregistResult(String value) {
        this.lockregistResult = value;
    }

}
