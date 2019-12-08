package com.yhhis.common.entity;

import java.io.Serializable;

/**
 * com.his 表DEPT_DICT 行科室名称 详情
 *
 * @author zzh
 */
public class DeptDict implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 5912640064790617684L;
    private Integer serialno;// 流水号
    private String deptcode;// 科室编码
    private String deptname;// 科室名称
    private String deptalias;// 科室简称 或别名
    private Integer clincattr;// 临床科室属性
    private Integer outporinp;// 门诊主演科室标志
    private Integer internalorsergery;// 内外科标志
    private String inputcode;// 拼音码
    private String position;
    private String sign;
    private String inputcodewb;
    private Integer virtualcabinet;
    private Integer dispensingcumulate;
    private Integer ordercode;
    private String deptcoderlzy;
    private String deptnamerlzy;
    private String isoutnurse;
    private String examby;
    private Integer stopflag;// 科室停用标记
    private String newborn;// 1 可以看见妇产科相关菜单
    private String branchcode;// 科室所属分院编码
    private String bigdeptcode;// 科室所属大科室代码，用于跨分院统计大科数据时使用

    public Integer getSerialno() {
        return serialno;
    }

    public void setSerialno(Integer serialno) {
        this.serialno = serialno;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDeptalias() {
        return deptalias;
    }

    public void setDeptalias(String deptalias) {
        this.deptalias = deptalias;
    }

    public Integer getClincattr() {
        return clincattr;
    }

    public void setClincattr(Integer clincattr) {
        this.clincattr = clincattr;
    }

    public Integer getOutporinp() {
        return outporinp;
    }

    public void setOutporinp(Integer outporinp) {
        this.outporinp = outporinp;
    }

    public Integer getInternalorsergery() {
        return internalorsergery;
    }

    public void setInternalorsergery(Integer internalorsergery) {
        this.internalorsergery = internalorsergery;
    }

    public String getInputcode() {
        return inputcode;
    }

    public void setInputcode(String inputcode) {
        this.inputcode = inputcode;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getInputcodewb() {
        return inputcodewb;
    }

    public void setInputcodewb(String inputcodewb) {
        this.inputcodewb = inputcodewb;
    }

    public Integer getVirtualcabinet() {
        return virtualcabinet;
    }

    public void setVirtualcabinet(Integer virtualcabinet) {
        this.virtualcabinet = virtualcabinet;
    }

    public Integer getDispensingcumulate() {
        return dispensingcumulate;
    }

    public void setDispensingcumulate(Integer dispensingcumulate) {
        this.dispensingcumulate = dispensingcumulate;
    }

    public Integer getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(Integer ordercode) {
        this.ordercode = ordercode;
    }

    public String getDeptcoderlzy() {
        return deptcoderlzy;
    }

    public void setDeptcoderlzy(String deptcoderlzy) {
        this.deptcoderlzy = deptcoderlzy;
    }

    public String getDeptnamerlzy() {
        return deptnamerlzy;
    }

    public void setDeptnamerlzy(String deptnamerlzy) {
        this.deptnamerlzy = deptnamerlzy;
    }

    public String getIsoutnurse() {
        return isoutnurse;
    }

    public void setIsoutnurse(String isoutnurse) {
        this.isoutnurse = isoutnurse;
    }

    public String getExamby() {
        return examby;
    }

    public void setExamby(String examby) {
        this.examby = examby;
    }

    public Integer getStopflag() {
        return stopflag;
    }

    public void setStopflag(Integer stopflag) {
        this.stopflag = stopflag;
    }

    public String getNewborn() {
        return newborn;
    }

    public void setNewborn(String newborn) {
        this.newborn = newborn;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getBigdeptcode() {
        return bigdeptcode;
    }

    public void setBigdeptcode(String bigdeptcode) {
        this.bigdeptcode = bigdeptcode;
    }

}
