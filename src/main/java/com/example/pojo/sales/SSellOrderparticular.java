package com.example.pojo.sales;

import java.util.Date;

/**
 * 销售订单明细pojo
 */
public class SSellOrderparticular {
    private Integer opaLineId;      //栏号

    private String opaId;           //物料编号

    private String opaName;         //物料名称

    private String opaOrId;         //单据号码

    private String opaModel;        //规格型号

    private String opaUnit;         //单位名称

    private Double opaCount;        //数量

    private Double opaBeforeprice;  //折扣前单价

    private Double opaBreak;            //折数

    private Double opaPrice;            //单价

    private Double opaMoney;            //金额

    private Double opaCess;             //税率

    private Double opaDuty;             //税额

    private Double opaHansmoney;        //含税金额

    private Date opaChukdate;           //预出库日期

    private Double opaWeichcount;       //未出数量

    private Integer opaPresent;         //赠品

    private String opaDantype;          //来源单别

    private String opaDanId;            //来源单号

    private String opaRemark;           //备注

    private SSellOrder sSellOrder;      //销售订单对象

    public Integer getOpaLineId() {
        return opaLineId;
    }

    public void setOpaLineId(Integer opaLineId) {
        this.opaLineId = opaLineId;
    }

    public String getOpaId() {
        return opaId;
    }

    public void setOpaId(String opaId) {
        this.opaId = opaId == null ? null : opaId.trim();
    }

    public String getOpaName() {
        return opaName;
    }

    public void setOpaName(String opaName) {
        this.opaName = opaName == null ? null : opaName.trim();
    }

    public String getOpaOrId() {
        return opaOrId;
    }

    public void setOpaOrId(String opaOrId) {
        this.opaOrId = opaOrId == null ? null : opaOrId.trim();
    }

    public String getOpaModel() {
        return opaModel;
    }

    public void setOpaModel(String opaModel) {
        this.opaModel = opaModel == null ? null : opaModel.trim();
    }

    public String getOpaUnit() {
        return opaUnit;
    }

    public void setOpaUnit(String opaUnit) {
        this.opaUnit = opaUnit == null ? null : opaUnit.trim();
    }

    public Double getOpaCount() {
        return opaCount;
    }

    public void setOpaCount(Double opaCount) {
        this.opaCount = opaCount;
    }

    public Double getOpaBeforeprice() {
        return opaBeforeprice;
    }

    public void setOpaBeforeprice(Double opaBeforeprice) {
        this.opaBeforeprice = opaBeforeprice;
    }

    public Double getOpaBreak() {
        return opaBreak;
    }

    public void setOpaBreak(Double opaBreak) {
        this.opaBreak = opaBreak;
    }

    public Double getOpaPrice() {
        return opaPrice;
    }

    public void setOpaPrice(Double opaPrice) {
        this.opaPrice = opaPrice;
    }

    public Double getOpaMoney() {
        return opaMoney;
    }

    public void setOpaMoney(Double opaMoney) {
        this.opaMoney = opaMoney;
    }

    public Double getOpaCess() {
        return opaCess;
    }

    public void setOpaCess(Double opaCess) {
        this.opaCess = opaCess;
    }

    public Double getOpaDuty() {
        return opaDuty;
    }

    public void setOpaDuty(Double opaDuty) {
        this.opaDuty = opaDuty;
    }

    public Double getOpaHansmoney() {
        return opaHansmoney;
    }

    public void setOpaHansmoney(Double opaHansmoney) {
        this.opaHansmoney = opaHansmoney;
    }

    public Date getOpaChukdate() {
        return opaChukdate;
    }

    public void setOpaChukdate(Date opaChukdate) {
        this.opaChukdate = opaChukdate;
    }

    public Double getOpaWeichcount() {
        return opaWeichcount;
    }

    public void setOpaWeichcount(Double opaWeichcount) {
        this.opaWeichcount = opaWeichcount;
    }

    public Integer getOpaPresent() {
        return opaPresent;
    }

    public void setOpaPresent(Integer opaPresent) {
        this.opaPresent = opaPresent;
    }

    public String getOpaDantype() {
        return opaDantype;
    }

    public void setOpaDantype(String opaDantype) {
        this.opaDantype = opaDantype == null ? null : opaDantype.trim();
    }

    public String getOpaDanId() {
        return opaDanId;
    }

    public void setOpaDanId(String opaDanId) {
        this.opaDanId = opaDanId == null ? null : opaDanId.trim();
    }

    public String getOpaRemark() {
        return opaRemark;
    }

    public void setOpaRemark(String opaRemark) {
        this.opaRemark = opaRemark == null ? null : opaRemark.trim();
    }

    public SSellOrder getsSellOrder() {
        return sSellOrder;
    }

    public void setsSellOrder(SSellOrder sSellOrder) {
        this.sSellOrder = sSellOrder;
    }
}