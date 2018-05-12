package com.example.pojo.sales;

/**
 * 销售报价明细pojo
 */
public class SSellQuoteparticular {
    private Integer qpId;           //栏号

    private String qpQuid;          //单据号码

    private String qpMaterielid;    //物料编号

    private String qpMaterielname;  //物料名称

    private String qpModel;             //规格型号

    private String qpUnitname;          //单位名称

    private Double qpNumber;            //数量

    private Double qpDiscountprice;     //折扣前单价

    private Double qpDiscount;          //折数

    private Double qpPrice;             //单价

    private Double qpSum;               //金额

    private Double qpRate;              //税率

    private Double qpTatemoney;         //税额

    private Double qpTotalmoney;        //含税金额

    private String qpLargess;          //赠品  （1代表是、0代表否）

    private String qpRemark;            //备注

    private SSellQuote sSellQuote;      //销售报价对象

    public Integer getQpId() {
        return qpId;
    }

    public SSellQuote getsSellQuote() {
        return sSellQuote;
    }

    public void setsSellQuote(SSellQuote sSellQuote) {
        this.sSellQuote = sSellQuote;
    }

    public void setQpId(Integer qpId) {
        this.qpId = qpId;
    }

    public String getQpQuid() {
        return qpQuid;
    }

    public void setQpQuid(String qpQuid) {
        this.qpQuid = qpQuid == null ? null : qpQuid.trim();
    }

    public String getQpMaterielid() {
        return qpMaterielid;
    }

    public void setQpMaterielid(String qpMaterielid) {
        this.qpMaterielid = qpMaterielid == null ? null : qpMaterielid.trim();
    }

    public String getQpMaterielname() {
        return qpMaterielname;
    }

    public void setQpMaterielname(String qpMaterielname) {
        this.qpMaterielname = qpMaterielname == null ? null : qpMaterielname.trim();
    }

    public String getQpModel() {
        return qpModel;
    }

    public void setQpModel(String qpModel) {
        this.qpModel = qpModel == null ? null : qpModel.trim();
    }

    public String getQpUnitname() {
        return qpUnitname;
    }

    public void setQpUnitname(String qpUnitname) {
        this.qpUnitname = qpUnitname == null ? null : qpUnitname.trim();
    }

    public Double getQpNumber() {
        return qpNumber;
    }

    public void setQpNumber(Double qpNumber) {
        this.qpNumber = qpNumber;
    }

    public Double getQpDiscountprice() {
        return qpDiscountprice;
    }

    public void setQpDiscountprice(Double qpDiscountprice) {
        this.qpDiscountprice = qpDiscountprice;
    }

    public Double getQpDiscount() {
        return qpDiscount;
    }

    public void setQpDiscount(Double qpDiscount) {
        this.qpDiscount = qpDiscount;
    }

    public Double getQpPrice() {
        return qpPrice;
    }

    public void setQpPrice(Double qpPrice) {
        this.qpPrice = qpPrice;
    }

    public Double getQpSum() {
        return qpSum;
    }

    public void setQpSum(Double qpSum) {
        this.qpSum = qpSum;
    }

    public Double getQpRate() {
        return qpRate;
    }

    public void setQpRate(Double qpRate) {
        this.qpRate = qpRate;
    }

    public Double getQpTatemoney() {
        return qpTatemoney;
    }

    public void setQpTatemoney(Double qpTatemoney) {
        this.qpTatemoney = qpTatemoney;
    }

    public Double getQpTotalmoney() {
        return qpTotalmoney;
    }

    public void setQpTotalmoney(Double qpTotalmoney) {
        this.qpTotalmoney = qpTotalmoney;
    }

    public String getQpLargess() {
        return qpLargess;
    }

    public void setQpLargess(String qpLargess) {
        this.qpLargess = qpLargess;
    }

    public String getQpRemark() {
        return qpRemark;
    }

    public void setQpRemark(String qpRemark) {
        this.qpRemark = qpRemark == null ? null : qpRemark.trim();
    }
}