
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
 *         &lt;element name="as_patientid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="as_money" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "asPatientid",
        "asMoney"
})
@XmlRootElement(name = "uf_prepayment")
public class UfPrepayment {

    @XmlElement(name = "as_patientid", required = true, nillable = true)
    protected String asPatientid;
    @XmlElement(name = "as_money", required = true, nillable = true)
    protected String asMoney;

    /**
     * ��ȡasPatientid���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAsPatientid() {
        return asPatientid;
    }

    /**
     * ����asPatientid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAsPatientid(String value) {
        this.asPatientid = value;
    }

    /**
     * ��ȡasMoney���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAsMoney() {
        return asMoney;
    }

    /**
     * ����asMoney���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAsMoney(String value) {
        this.asMoney = value;
    }

}
