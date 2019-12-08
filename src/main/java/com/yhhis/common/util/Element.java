package com.yhhis.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: yld
 * @Date: 2018-12-03 10:00
 * @Version 1.0
 * @Description TODO XML元素类
 */
public class Element {
    /**
     * 元素名
     */
    private String name;
    /**
     * 文本值
     */
    private String nodeText = "";
    /**
     * 属性
     */
    private Map<String, String> property = new HashMap<String, String>();
    /**
     * 是否是子节点
     */
    private boolean isleaf = true;
    /**
     * 子节点
     */
    private List<Element> child = new ArrayList<Element>();

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNodeText() {
        return nodeText;
    }

    public void setNodeText(String nodeText) {
        this.nodeText = nodeText;
    }

    public Map<String, String> getProperty() {
        return property;
    }

    public void setProperty(Map<String, String> property) {
        this.property = property;
    }

    public boolean isIsleaf() {
        return isleaf;
    }

    public void setIsleaf(boolean isleaf) {
        this.isleaf = isleaf;
    }

    public List<Element> getChild() {
        return child;
    }

    public void setChild(List<Element> child) {
        this.child = child;
        if (this.isleaf && this.child.size() > 0) {
            this.isleaf = false;
        }
    }

    /**
     * 添加属性
     *
     * @param key
     * @param value
     */
    public void addProperty(String key, String value) {
        this.property.put(key, value);
    }

    /**
     * 添加子节点
     *
     * @param element
     */
    public void addChild(Element element) {
        this.child.add(element);
        if (this.isleaf && this.child.size() > 0) {
            this.isleaf = false;
        }
    }

}
