package com.yhhis.common.util;

import java.util.Iterator;

/**
 * @Author: yld
 * @Date: 2018-12-03 10:36
 * @Version 1.0
 */
public class XmlUtils {
    public static String lt = "<";
    public static String ltEnd = "</";
    public static String rt = ">";
    public static String rhtEnd = "/>";
    public static String quotes = "\"";
    public static String equal = "=";
    public static String blank = " ";

    /**
     * @param element
     * @return
     * @category 拼接xml个元素信息
     */
    public static StringBuffer elementToXml(Element element) {
        StringBuffer result = new StringBuffer();
        //元素开始
        result.append(lt).append(element.getName());
        //判断是否有属性
        if (element.getProperty() != null && element.getProperty().size() > 0) {
            Iterator<String> iterator = element.getProperty().keySet().iterator();
            while (iterator.hasNext()) {
                String key = String.valueOf(iterator.next());
                String value = element.getProperty().get(key);
                result.append(blank).append(key).append(equal).append(quotes).append(value).append(quotes).append(blank);
            }
        }
        //结束的标记
        result.append(rt);
        /**
         * 判断是否是叶子节点，如果是叶子节点，需要添加节点内容，不是叶子节点，那么循环添加子节点
         */
        if (element.isIsleaf()) {
            result.append(element.getNodeText());
        } else {
            for (Element temp : element.getChild()) {
                result.append(elementToXml(temp));
            }
        }
        //元素结束
        result.append(ltEnd).append(element.getName()).append(rt);
        return result;
    }

    /**
     * 拼接xml申明信息
     *
     * @param element
     * @return
     */
    public static String element2XML(Element element) {
        StringBuffer body = elementToXml(element);
        StringBuffer head = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        head.append(body);
        return head.toString();
    }
}
