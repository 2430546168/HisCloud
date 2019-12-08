
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
 *         &lt;element name="as_pid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ade_money" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ade_pay_money" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="as_settle_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "asPid",
        "adeMoney",
        "adePayMoney",
        "asSettleNo"
})
@XmlRootElement(name = "uf_outp_pay")
public class UfOutpPay {

    @XmlElement(name = "as_pid", required = true, nillable = true)
    protected String asPid;
    @XmlElement(name = "ade_money", required = true, nillable = true)
    protected BigDecimal adeMoney;
    @XmlElement(name = "ade_pay_money", required = true, nillable = true)
    protected BigDecimal adePayMoney;
    @XmlElement(name = "as_settle_no", required = true, nillable = true)
    protected String asSettleNo;

    /**
     * ��ȡasPid���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAsPid() {
        return asPid;
    }

    /**
     * ����asPid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAsPid(String value) {
        this.asPid = value;
    }

    /**
     * ��ȡadeMoney���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAdeMoney() {
        return adeMoney;
    }

    /**
     * ����adeMoney���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAdeMoney(BigDecimal value) {
        this.adeMoney = value;
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

    /**
     * ��ȡasSettleNo���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAsSettleNo() {
        return asSettleNo;
    }

    /**
     * ����asSettleNo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAsSettleNo(String value) {
        this.asSettleNo = value;
    }

}
