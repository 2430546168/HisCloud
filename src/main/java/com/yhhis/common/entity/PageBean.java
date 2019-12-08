package com.yhhis.common.entity;

public class PageBean {

    private Integer begin;
    private Integer end;
    private Integer pageSize = 10;// 页大小
    private Integer nowPage = 1;// 当前页
    private Integer count;// 总条数
    private Integer pageCount;// 页总数

    public Integer getBegin() {
        this.begin = (this.getNowPage() - 1) * this.getPageSize();
        return begin;
    }

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    public Integer getEnd() {
        this.end = this.getBegin() + this.getPageSize();
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getNowPage() {
        return nowPage;
    }

    public void setNowPage(Integer nowPage) {
        this.nowPage = nowPage;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPageCount() {
        this.pageCount = this.getCount() % this.getPageSize() == 0 ? this.getCount() / this.getPageSize()
                : this.getCount() / this.getPageSize() + 1;
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

}
