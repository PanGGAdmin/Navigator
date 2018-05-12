package com.example.pojo.procurement;

import java.util.Date;

/**
 * 采购请购从表信息字段
 */
public class Requisitions_detail {

    private Integer serno;//栏号

    private String billno;// 单据号码

    private String prodid;// 物料编号

    private String prodname;// 物料名称

    private String predsize;// 规格型号

    private String unitname;// 单位名称

    private Integer squantity;//数量

    private String currid;//标准币别

    private Double sprice;// 标准进价

    private Double amount;// 标准进价金额

    private String lastestcurrid;// 最后一次币别

    private Double lastestprice;// 最后一次单价

    private Double lastestsprice;// 最后一次进价金额

    private Date preindate;//  需求日期

    private Date suggestpurdate;// 建议采购日期

    private Integer qtyremain;//未采购量

    private String itemremark;//  备注

    private String trantype;//来源单别

    private String tranno;// 来源单号

    private Integer deletestatus;// 是否可用  0不可用 1可用(删除是改为不可用)

   private Requisitions requisitions;//关联采购请购单主表信息

    public Integer getSerno() {
        return serno;
    }

    public void setSerno(Integer serno) {
        this.serno = serno;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getProdid() {
        return prodid;
    }

    public void setProdid(String prodid) {
        this.prodid = prodid;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public String getPredsize() {
        return predsize;
    }

    public void setPredsize(String predsize) {
        this.predsize = predsize;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public Integer getSquantity() {
        return squantity;
    }

    public void setSquantity(Integer squantity) {
        this.squantity = squantity;
    }

    public String getCurrid() {
        return currid;
    }

    public void setCurrid(String currid) {
        this.currid = currid;
    }

    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getLastestcurrid() {
        return lastestcurrid;
    }

    public void setLastestcurrid(String lastestcurrid) {
        this.lastestcurrid = lastestcurrid;
    }

    public Double getLastestprice() {
        return lastestprice;
    }

    public void setLastestprice(Double lastestprice) {
        this.lastestprice = lastestprice;
    }

    public Double getLastestsprice() {
        return lastestsprice;
    }

    public void setLastestsprice(Double lastestsprice) {
        this.lastestsprice = lastestsprice;
    }

    public Date getPreindate() {
        return preindate;
    }

    public void setPreindate(Date preindate) {
        this.preindate = preindate;
    }

    public Date getSuggestpurdate() {
        return suggestpurdate;
    }

    public void setSuggestpurdate(Date suggestpurdate) {
        this.suggestpurdate = suggestpurdate;
    }

    public Integer getQtyremain() {
        return qtyremain;
    }

    public void setQtyremain(Integer qtyremain) {
        this.qtyremain = qtyremain;
    }

    public String getItemremark() {
        return itemremark;
    }

    public void setItemremark(String itemremark) {
        this.itemremark = itemremark;
    }

    public String getTrantype() {
        return trantype;
    }

    public void setTrantype(String trantype) {
        this.trantype = trantype;
    }

    public String getTranno() {
        return tranno;
    }

    public void setTranno(String tranno) {
        this.tranno = tranno;
    }

    public Integer getDeletestatus() {
        return deletestatus;
    }

    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }
}