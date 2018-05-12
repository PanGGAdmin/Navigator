package com.example.pojo.procurement;

import java.util.Date;
import java.util.List;

/**
 * 采购订单主表信息字段
 */
public class Orders {
    private String billno;//单据号码

    private Date billdate;// 单据日期

    private Integer customerid;// 供应商

    private Integer addressid;// 供应商地址

    private Integer billstyleid;// 采购订单类型

    private String curcurrencyname;//币别

    private String priceoftax;// 单价是否含税

    private String billstatus;// 单况

    private String giveaddress;// 送货地址

    private Double exchrate;//汇率

    private Integer salesid;// 采购人员

    private Integer departid;// 所属部门

    private String marker;// 制单人员

    private String permitter;// 审核人员

    private Integer projectid;//  所属项目

    private Integer headerid;// 表头条文(关联报表条文)

    private Integer footerid;// 表尾条文(关联报表条文)

    private String userdef1;// 自定栏一

    private String userdef2;//自定栏二

    private String remark;//  备注

    private Integer dueto;// 帐款归属

    private String gatherstyle;// 帐款条件

    private Integer gatherday;//帐款天数

    private Date prepayday;// 帐款日期

    private Date accmonth;//帐款月份

    private Integer deletestatus;//是否可用  0不可用 1可用(删除是改为不可用)
    private List<Order_detail> order_detail;//关联订单详细信息

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Integer getBillstyleid() {
        return billstyleid;
    }

    public void setBillstyleid(Integer billstyleid) {
        this.billstyleid = billstyleid;
    }

    public String getCurcurrencyname() {
        return curcurrencyname;
    }

    public void setCurcurrencyname(String curcurrencyname) {
        this.curcurrencyname = curcurrencyname;
    }

    public String getPriceoftax() {
        return priceoftax;
    }

    public void setPriceoftax(String priceoftax) {
        this.priceoftax = priceoftax;
    }

    public String getBillstatus() {
        return billstatus;
    }

    public void setBillstatus(String billstatus) {
        this.billstatus = billstatus;
    }

    public String getGiveaddress() {
        return giveaddress;
    }

    public void setGiveaddress(String giveaddress) {
        this.giveaddress = giveaddress;
    }

    public Double getExchrate() {
        return exchrate;
    }

    public void setExchrate(Double exchrate) {
        this.exchrate = exchrate;
    }

    public Integer getSalesid() {
        return salesid;
    }

    public void setSalesid(Integer salesid) {
        this.salesid = salesid;
    }

    public Integer getDepartid() {
        return departid;
    }

    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public String getPermitter() {
        return permitter;
    }

    public void setPermitter(String permitter) {
        this.permitter = permitter;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getHeaderid() {
        return headerid;
    }

    public void setHeaderid(Integer headerid) {
        this.headerid = headerid;
    }

    public Integer getFooterid() {
        return footerid;
    }

    public void setFooterid(Integer footerid) {
        this.footerid = footerid;
    }

    public String getUserdef1() {
        return userdef1;
    }

    public void setUserdef1(String userdef1) {
        this.userdef1 = userdef1;
    }

    public String getUserdef2() {
        return userdef2;
    }

    public void setUserdef2(String userdef2) {
        this.userdef2 = userdef2;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getDueto() {
        return dueto;
    }

    public void setDueto(Integer dueto) {
        this.dueto = dueto;
    }

    public String getGatherstyle() {
        return gatherstyle;
    }

    public void setGatherstyle(String gatherstyle) {
        this.gatherstyle = gatherstyle;
    }

    public Integer getGatherday() {
        return gatherday;
    }

    public void setGatherday(Integer gatherday) {
        this.gatherday = gatherday;
    }

    public Date getPrepayday() {
        return prepayday;
    }

    public void setPrepayday(Date prepayday) {
        this.prepayday = prepayday;
    }

    public Date getAccmonth() {
        return accmonth;
    }

    public void setAccmonth(Date accmonth) {
        this.accmonth = accmonth;
    }

    public Integer getDeletestatus() {
        return deletestatus;
    }

    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }

    public List<Order_detail> getOrder_detail() {
        return order_detail;
    }

    public void setOrder_detail(List<Order_detail> order_detail) {
        this.order_detail = order_detail;
    }



}