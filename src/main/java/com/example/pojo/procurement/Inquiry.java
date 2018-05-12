package com.example.pojo.procurement;

import java.util.Date;
import java.util.List;

/**
 * 采购询价表
 * Created by Administrator on 2018/5/10.
 */
public class Inquiry {
    /*
    Billno varchar(20) not null PRIMARY key,'单据号码，主键'
	BillDate Date not null,			'单据日期'
	CustomerID varchar(20) not null,	'供应商'
	CustAddress varchar(20),		'供应商地址，可以为空'
	ValidDate Date,				'有效日期'
	CurrID varchar(20) not null,		'币别'
	PriceOfTax int not null,		'单价是否含税，0未税，1含税'
	ExchRate varchar(20) not null,		'汇率'
	OutAddress varchar(20),			'送货地址'
	Maker varchar(20) not null,		'制单人员，可写死为admin'
	SalesName varchar(20) not null,		'采购人员'
	Permitter varchar(20) not null,		'复核人员，跟制单人员有关'
	DepartID varchar(20) not null,		'所属部门'
	HeaderID varchar(50),			'表头条文'
	UserDef1 varchar(50),			'自定栏一'
	FooterID varchar(50),			'表尾条文'
	UserDef2 varchar(50),			'自定栏二'
	Remark varchar(50)			'备注'
     */
    private String Billno;
    private Date BillDate;
    private String CustomerID;
    private String CustAddress;
    private Date ValidDate;
    private String CurrID;
    private int PriceOfTax;
    private String ExchRate;
    private String OutAddress;
    private String Maker;
    private String SalesName;
    private String Permitter;
    private String DepartID;
    private String HeaderID;
    private String UserDef1;
    private String FooterID;
    private String UserDef2;
    private String Remark;
    private List<Inquiry_content> inquiry_content;    //详情表

    public List<Inquiry_content> getInquiry_content() {
        return inquiry_content;
    }

    public void setInquiry_content(List<Inquiry_content> inquiry_content) {
        this.inquiry_content = inquiry_content;
    }

    public String getBillno() {
        return Billno;
    }

    public void setBillno(String billno) {
        Billno = billno;
    }

    public Date getBillDate() {
        return BillDate;
    }

    public void setBillDate(Date billDate) {
        BillDate = billDate;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getCustAddress() {
        return CustAddress;
    }

    public void setCustAddress(String custAddress) {
        CustAddress = custAddress;
    }

    public Date getValidDate() {
        return ValidDate;
    }

    public void setValidDate(Date validDate) {
        ValidDate = validDate;
    }

    public String getCurrID() {
        return CurrID;
    }

    public void setCurrID(String currID) {
        CurrID = currID;
    }

    public int getPriceOfTax() {
        return PriceOfTax;
    }

    public void setPriceOfTax(int priceOfTax) {
        PriceOfTax = priceOfTax;
    }

    public String getExchRate() {
        return ExchRate;
    }

    public void setExchRate(String exchRate) {
        ExchRate = exchRate;
    }

    public String getOutAddress() {
        return OutAddress;
    }

    public void setOutAddress(String outAddress) {
        OutAddress = outAddress;
    }

    public String getMaker() {
        return Maker;
    }

    public void setMaker(String maker) {
        Maker = maker;
    }

    public String getSalesName() {
        return SalesName;
    }

    public void setSalesName(String salesName) {
        SalesName = salesName;
    }

    public String getPermitter() {
        return Permitter;
    }

    public void setPermitter(String permitter) {
        Permitter = permitter;
    }

    public String getDepartID() {
        return DepartID;
    }

    public void setDepartID(String departID) {
        DepartID = departID;
    }

    public String getHeaderID() {
        return HeaderID;
    }

    public void setHeaderID(String headerID) {
        HeaderID = headerID;
    }

    public String getUserDef1() {
        return UserDef1;
    }

    public void setUserDef1(String userDef1) {
        UserDef1 = userDef1;
    }

    public String getFooterID() {
        return FooterID;
    }

    public void setFooterID(String footerID) {
        FooterID = footerID;
    }

    public String getUserDef2() {
        return UserDef2;
    }

    public void setUserDef2(String userDef2) {
        UserDef2 = userDef2;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }
}
