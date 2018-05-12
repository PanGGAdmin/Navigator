package com.example.pojo.procurement;

import java.util.List;

/**分页
 * Created by Administrator on 2018/5/10.
 */
public class PageBean {




    private Integer currenPage;  //当前页
    private Integer pageSize;    //页面大小
    private Integer totaCount;   //数据总量
    private Integer totaPage;    //页面总量
    private Integer prevPage;    //上一页
    private Integer nextPage;    //下一页

    public Integer getCurrenPage() {
        return currenPage;
    }

    public void setCurrenPage(Integer currenPage) {
        this.currenPage = currenPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotaCount() {
        return totaCount;
    }

    public void setTotaCount(Integer totaCount) {
        this.totaCount = totaCount;
    }

    public Integer getTotaPage() {
        return totaPage;
    }

    public void setTotaPage(Integer totaPage) {
        this.totaPage = totaPage;
    }

    public Integer getPrevPage() {
        return prevPage;
    }

    public void setPrevPage(Integer prevPage) {
        this.prevPage = prevPage;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public List<Inquiry> getList() {
        return list;
    }

    public void setList(List<Inquiry> list) {
        this.list = list;
    }

    private List<Inquiry> list;         //数据总集
}
