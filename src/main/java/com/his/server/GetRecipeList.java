
package com.his.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getRecipeList complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 *
 * <pre>
 * &lt;complexType name="getRecipeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecipeList", propOrder = {
        "arg0",
        "arg1",
        "arg2",
        "arg3",
        "arg4"
})
public class GetRecipeList {

    protected String arg0;
    protected String arg1;
    protected String arg2;
    protected String arg3;
    protected int arg4;

    /**
     * ��ȡarg0���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getArg0() {
        return arg0;
    }

    /**
     * ����arg0���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArg0(String value) {
        this.arg0 = value;
    }

    /**
     * ��ȡarg1���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * ����arg1���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

    /**
     * ��ȡarg2���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getArg2() {
        return arg2;
    }

    /**
     * ����arg2���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArg2(String value) {
        this.arg2 = value;
    }

    /**
     * ��ȡarg3���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getArg3() {
        return arg3;
    }

    /**
     * ����arg3���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArg3(String value) {
        this.arg3 = value;
    }

    /**
     * ��ȡarg4���Ե�ֵ��
     */
    public int getArg4() {
        return arg4;
    }

    /**
     * ����arg4���Ե�ֵ��
     */
    public void setArg4(int value) {
        this.arg4 = value;
    }

}
