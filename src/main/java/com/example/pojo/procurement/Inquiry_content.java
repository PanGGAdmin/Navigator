package com.example.pojo.procurement;

/**
 * 询价内容表
 * Created by Administrator on 2018/5/10.
 */
public class Inquiry_content {
    /*
    SerID int not null PRIMARY key,		'栏号，不可修改'
	ProdID varchar(20) not null,		'物料编号'
	ProdName varchar(20) not null,		'物料名称，不可修改'
	ProdSize varchar(20),			'规格型号，不可修改'
	Sunit varchar(20) not null,		'单位名称，不可修改'
	sQuantity int not null,			'数量，不可为空'
	OldPrice FLOAT not null,		'折扣前单价'
	Discount FLOAT not null,		'折数(%)'
	sParic FLOAT not null,			'单价'
	Amount FLOAT not null,			'金额'
	PrdBusiTaxRate FLOAT not null,		'税率(%)'
	TaxAmt FLOAT not null,			'税额，不可修改'
	VFTotal FLOAT not null,			'含税金额，不可修改'
	IsGift int not null,			'赠品，0是赠品，1不是'
	TranType varchar(20),			'来源别，不可修改'
	FromNO varchar(20)			'来源单号，不可修改'
     */
    private int SerID;
    private String ProdID;
    private String ProdName;
    private String ProdSize;
    private String Sunit;
    private int sQuantity;
    private double OldPrice;
    private double Discount;
    private double sParic;
    private double Amount;
    private double PrdBusiTaxRate;
    private double TaxAmt;
    private double VFTotal;
    private int IsGift;
    private String TranType;
    private String FromNO;

    public int getSerID() {
        return SerID;
    }

    public void setSerID(int serID) {
        SerID = serID;
    }

    public String getProdID() {
        return ProdID;
    }

    public void setProdID(String prodID) {
        ProdID = prodID;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdName(String prodName) {
        ProdName = prodName;
    }

    public String getProdSize() {
        return ProdSize;
    }

    public void setProdSize(String prodSize) {
        ProdSize = prodSize;
    }

    public String getSunit() {
        return Sunit;
    }

    public void setSunit(String sunit) {
        Sunit = sunit;
    }

    public int getsQuantity() {
        return sQuantity;
    }

    public void setsQuantity(int sQuantity) {
        this.sQuantity = sQuantity;
    }

    public double getOldPrice() {
        return OldPrice;
    }

    public void setOldPrice(double oldPrice) {
        OldPrice = oldPrice;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double discount) {
        Discount = discount;
    }

    public double getsParic() {
        return sParic;
    }

    public void setsParic(double sParic) {
        this.sParic = sParic;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public double getPrdBusiTaxRate() {
        return PrdBusiTaxRate;
    }

    public void setPrdBusiTaxRate(double prdBusiTaxRate) {
        PrdBusiTaxRate = prdBusiTaxRate;
    }

    public double getTaxAmt() {
        return TaxAmt;
    }

    public void setTaxAmt(double taxAmt) {
        TaxAmt = taxAmt;
    }

    public double getVFTotal() {
        return VFTotal;
    }

    public void setVFTotal(double VFTotal) {
        this.VFTotal = VFTotal;
    }

    public int getIsGift() {
        return IsGift;
    }

    public void setIsGift(int isGift) {
        IsGift = isGift;
    }

    public String getTranType() {
        return TranType;
    }

    public void setTranType(String tranType) {
        TranType = tranType;
    }

    public String getFromNO() {
        return FromNO;
    }

    public void setFromNO(String fromNO) {
        FromNO = fromNO;
    }
}
