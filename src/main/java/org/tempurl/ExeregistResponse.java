
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
 *         &lt;element name="exeregistResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "exeregistResult"
})
@XmlRootElement(name = "exeregistResponse")
public class ExeregistResponse {

    @XmlElement(required = true, nillable = true)
    protected String exeregistResult;

    /**
     * ��ȡexeregistResult���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getExeregistResult() {
        return exeregistResult;
    }

    /**
     * ����exeregistResult���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExeregistResult(String value) {
        this.exeregistResult = value;
    }

}
