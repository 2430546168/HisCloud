
package com.his.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>updateMedicalrecord complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 *
 * <pre>
 * &lt;complexType name="updateMedicalrecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://server.his.com/}medicalrecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateMedicalrecord", propOrder = {
        "arg0"
})
public class UpdateMedicalrecord {

    protected Medicalrecord arg0;

    /**
     * ��ȡarg0���Ե�ֵ��
     *
     * @return possible object is
     * {@link Medicalrecord }
     */
    public Medicalrecord getArg0() {
        return arg0;
    }

    /**
     * ����arg0���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Medicalrecord }
     */
    public void setArg0(Medicalrecord value) {
        this.arg0 = value;
    }

}
