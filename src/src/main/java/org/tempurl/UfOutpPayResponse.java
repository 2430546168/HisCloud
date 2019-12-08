
package org.tempurl;

import java.math.BigDecimal;
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
 *         &lt;element name="uf_outp_payResult" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ade_pay_money" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ufOutpPayResult",
        "adePayMoney"
})
@XmlRootElement(name = "uf_outp_payResponse")
public class UfOutpPayResponse {

    @XmlElement(name = "uf_outp_payResult", required = true, type = Short.class, nillable = true)
    protected Short ufOutpPayResult;
    @XmlElement(name = "ade_pay_money", required = true, nillable = true)
    protected BigDecimal adePayMoney;

    /**
     * ��ȡufOutpPayResult���Ե�ֵ��
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getUfOutpPayResult() {
        return ufOutpPayResult;
    }

    /**
     * ����ufOutpPayResult���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setUfOutpPayResult(Short value) {
        this.ufOutpPayResult = value;
    }

    /**
     * ��ȡadePayMoney���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAdePayMoney() {
        return adePayMoney;
    }

    /**
     * ����adePayMoney���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAdePayMoney(BigDecimal value) {
        this.adePayMoney = value;
    }

}
