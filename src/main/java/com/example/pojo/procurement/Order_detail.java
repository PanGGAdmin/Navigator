package com.example.pojo.procurement;

import java.util.Date;

/**
 * 采购订单从表信息字段
 */
public class Order_detail {

    private Integer serno;//行号

    private String billno;// 单据号码

    private String prodid;// 物料编号

    private String prodname;//  物料名称

    private String prodsize;// 规格型号

    private String unitname;// 单位

    private Integer squantity;//数量

    private Double oldprice;// 折前单价

    private Integer discount;// 折数

    private Double unitprice;// 单价

    private Double amount;// 金额

    private Double taxrate;// 税率

    private Double taxamt;// 含税金额

    private Date preindate;// 预入库日

    private String isgift;//     是否赠品

    private String fromno;//来源单别

    private String trantype;// 来源单号

    private String itemremark;//分录备注

    private Double vftotal;  //税额

    private Integer qtyremain;//未入库数

   private  Orders orders;

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

    public String getProdsize() {
        return prodsize;
    }

    public void setProdsize(String prodsize) {
        this.prodsize = prodsize;
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

    public Double getOldprice() {
        return oldprice;
    }

    public void setOldprice(Double oldprice) {
        this.oldprice = oldprice;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(Double taxrate) {
        this.taxrate = taxrate;
    }

    public Double getTaxamt() {
        return taxamt;
    }

    public void setTaxamt(Double taxamt) {
        this.taxamt = taxamt;
    }

    public Date getPreindate() {
        return preindate;
    }

    public void setPreindate(Date preindate) {
        this.preindate = preindate;
    }

    public String getIsgift() {
        return isgift;
    }

    public void setIsgift(String isgift) {
        this.isgift = isgift;
    }

    public String getFromno() {
        return fromno;
    }

    public void setFromno(String fromno) {
        this.fromno = fromno;
    }

    public String getTrantype() {
        return trantype;
    }

    public void setTrantype(String trantype) {
        this.trantype = trantype;
    }

    public String getItemremark() {
        return itemremark;
    }

    public void setItemremark(String itemremark) {
        this.itemremark = itemremark;
    }

    public Double getVftotal() {
        return vftotal;
    }

    public void setVftotal(Double vftotal) {
        this.vftotal = vftotal;
    }

    public Integer getQtyremain() {
        return qtyremain;
    }

    public void setQtyremain(Integer qtyremain) {
        this.qtyremain = qtyremain;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}