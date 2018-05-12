package com.example.pojo.procurement;

import java.util.Date;
import java.util.List;

/**
 * 客户主文件表
 * Created by Administrator on 2018/5/10.
 */
public class Client_masterfile {
    /*
    ID varchar(20) not null PRIMARY key,	'客户编号'
	FundsAttribution varchar(20) not null,	'账款归属，不可修改'
	FullName VARCHAR(20) not null,		'客户全称 '
	ClassID VARCHAR(20) not null,		'类别,有外键关联'
	ShortName VARCHAR(20) not null,		'客户简称'
	AreaID VARCHAR(20),			'地区'
	EngFullName VARCHAR(20),		'英文全称'
	CurrencyID VARCHAR(20),			'币别'
	EngShortName VARCHAR(20),		'英文简称'
	ChiefName VARCHAR(20),			'负责人'
	PersonID VARCHAR(20) not null,		'业务人员，非空'
	LinkMan VARCHAR(20),			'联系人'
	TaxNo VARCHAR(20),			'税务登记号'
	Telephone1 VARCHAR(20),			'联系电话一'
	Capitalization VARCHAR(20),		'资本额'
	Telephone2 VARCHAR(20),			'练习电话二'
	IndustrialClass VARCHAR(20),		'行业别'
	Telephone3 VARCHAR(20),			'练习电话三'
	Email VARCHAR(50),			'电子邮件'
	MobileTel VARCHAR(20),			'移动电话'
	WebAddress VARCHAR(20),			'网址'
	BankAccount VARCHAR(20),		'银行账号'
	FaxNo VARCHAR(20),			'传真号码'
	BankID VARCHAR(20),			'开户银行'
	EarliestTradeDate Date,			'最初销售出库日'
	RateOfDiscount FLOAT not null,		'折数(%)'
	FirstTreadeDate date,			'最初销售退货日'
	PriceRank VARCHAR(20) not null,		'售价等级'
	LatelyTradeDate Date,			'最近销售出库日'
	PriceofTax int not null,		'单价是否含税，0未税，1含税'
	LatelyReturnDate Date,			'最近销售退货日'
	TransNewID int,				'潜在客户编号'
	LastVisitDate Date,			'最近拜访日'
	BuildUpDate Date not null,		'客户建立日期'
	BookVisitDate Date,			'预约拜访日'
	InvalidDate Date,			'终止交易日'
	AmountQuota FLOAT not null,		'账款额度'
	StartAdvRecv FLOAT not null,		'期初预收款'
	RemainQuota FLOAT not null,		'剩余额度'
	StartReceivable FLOAT not null,		'期初应收款'
	RecvWay VARCHAR(20) not null,		'收款条件'
	CurAdvRecy FLOAT not null,		'期末预收款'
	DayOfClose Date not null,		'每月结账日'
	CurReceivable FLOAT not null,		'期末应收款'
	CreditLevel VARCHAR(20) not null,	'信誉等级'
	NotInvQuota FLOAT not null,		'未开票金额'
	InvoTypeID VARCHAR(20),			'发票类型'
	AccAdvRecv VARCHAR(20),			'预收账款科目'
	AccReceivable VARCHAR(20),		'应收账款科目'
	AddField1 VARCHAR(20),			'自定栏一'
	AddField2 VARCHAR(20),			'自定栏二'
	Memo VARCHAR(20)			'备注'
     */

    private String ID;
    private String FundsAttribution;
    private String FullName;
    private String ClassID;
    private String ShortName;
    private String AreaID;
    private String EngFullName;
    private String CurrencyID;
    private String EngShortName;
    private String ChiefName;
    private String PersonID;
    private String LinkMan;
    private String TaxNo;
    private String Telephone1;
    private String Capitalization;
    private String Telephone2;
    private String IndustrialClass;
    private String Telephone3;
    private String Email;
    private String MobileTel;
    private String WebAddress;
    private String BankAccount;
    private String FaxNo;
    private String BankID;
    private Date EarliestTradeDate;
    private double RateOfDiscount;
    private Date FirstTreadeDate;
    private String PriceRank;
    private Date LatelyTradeDate;
    private int PriceofTax;
    private Date LatelyReturnDate;
    private int TransNewID;
    private Date LastVisitDate;
    private Date BuildUpDate;
    private Date BookVisitDate;
    private Date InvalidDate;
    private double AmountQuota;
    private double StartAdvRecv;
    private double RemainQuota;
    private double StartReceivable;
    private String RecvWay;
    private double CurAdvRecy;
    private Date DayOfClose;
    private double CurReceivable;
    private String CreditLevel;
    private double NotInvQuota;
    private String InvoTypeID;
    private String AccAdvRecv;
    private String AccReceivable;
    private String AddField1;
    private String AddField2;
    private String Memo;
    private List<Client_masterfile_address> Client_masterfile_address;  //客户主文件地址表子表


    public List<com.example.pojo.procurement.Client_masterfile_address> getClient_masterfile_address() {
        return Client_masterfile_address;
    }

    public void setClient_masterfile_address(List<com.example.pojo.procurement.Client_masterfile_address> client_masterfile_address) {
        Client_masterfile_address = client_masterfile_address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFundsAttribution() {
        return FundsAttribution;
    }

    public void setFundsAttribution(String fundsAttribution) {
        FundsAttribution = fundsAttribution;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getClassID() {
        return ClassID;
    }

    public void setClassID(String classID) {
        ClassID = classID;
    }

    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String shortName) {
        ShortName = shortName;
    }

    public String getAreaID() {
        return AreaID;
    }

    public void setAreaID(String areaID) {
        AreaID = areaID;
    }

    public String getEngFullName() {
        return EngFullName;
    }

    public void setEngFullName(String engFullName) {
        EngFullName = engFullName;
    }

    public String getCurrencyID() {
        return CurrencyID;
    }

    public void setCurrencyID(String currencyID) {
        CurrencyID = currencyID;
    }

    public String getEngShortName() {
        return EngShortName;
    }

    public void setEngShortName(String engShortName) {
        EngShortName = engShortName;
    }

    public String getChiefName() {
        return ChiefName;
    }

    public void setChiefName(String chiefName) {
        ChiefName = chiefName;
    }

    public String getPersonID() {
        return PersonID;
    }

    public void setPersonID(String personID) {
        PersonID = personID;
    }

    public String getLinkMan() {
        return LinkMan;
    }

    public void setLinkMan(String linkMan) {
        LinkMan = linkMan;
    }

    public String getTaxNo() {
        return TaxNo;
    }

    public void setTaxNo(String taxNo) {
        TaxNo = taxNo;
    }

    public String getTelephone1() {
        return Telephone1;
    }

    public void setTelephone1(String telephone1) {
        Telephone1 = telephone1;
    }

    public String getCapitalization() {
        return Capitalization;
    }

    public void setCapitalization(String capitalization) {
        Capitalization = capitalization;
    }

    public String getTelephone2() {
        return Telephone2;
    }

    public void setTelephone2(String telephone2) {
        Telephone2 = telephone2;
    }

    public String getIndustrialClass() {
        return IndustrialClass;
    }

    public void setIndustrialClass(String industrialClass) {
        IndustrialClass = industrialClass;
    }

    public String getTelephone3() {
        return Telephone3;
    }

    public void setTelephone3(String telephone3) {
        Telephone3 = telephone3;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobileTel() {
        return MobileTel;
    }

    public void setMobileTel(String mobileTel) {
        MobileTel = mobileTel;
    }

    public String getWebAddress() {
        return WebAddress;
    }

    public void setWebAddress(String webAddress) {
        WebAddress = webAddress;
    }

    public String getBankAccount() {
        return BankAccount;
    }

    public void setBankAccount(String bankAccount) {
        BankAccount = bankAccount;
    }

    public String getFaxNo() {
        return FaxNo;
    }

    public void setFaxNo(String faxNo) {
        FaxNo = faxNo;
    }

    public String getBankID() {
        return BankID;
    }

    public void setBankID(String bankID) {
        BankID = bankID;
    }

    public Date getEarliestTradeDate() {
        return EarliestTradeDate;
    }

    public void setEarliestTradeDate(Date earliestTradeDate) {
        EarliestTradeDate = earliestTradeDate;
    }

    public double getRateOfDiscount() {
        return RateOfDiscount;
    }

    public void setRateOfDiscount(double rateOfDiscount) {
        RateOfDiscount = rateOfDiscount;
    }

    public Date getFirstTreadeDate() {
        return FirstTreadeDate;
    }

    public void setFirstTreadeDate(Date firstTreadeDate) {
        FirstTreadeDate = firstTreadeDate;
    }

    public String getPriceRank() {
        return PriceRank;
    }

    public void setPriceRank(String priceRank) {
        PriceRank = priceRank;
    }

    public Date getLatelyTradeDate() {
        return LatelyTradeDate;
    }

    public void setLatelyTradeDate(Date latelyTradeDate) {
        LatelyTradeDate = latelyTradeDate;
    }

    public int getPriceofTax() {
        return PriceofTax;
    }

    public void setPriceofTax(int priceofTax) {
        PriceofTax = priceofTax;
    }

    public Date getLatelyReturnDate() {
        return LatelyReturnDate;
    }

    public void setLatelyReturnDate(Date latelyReturnDate) {
        LatelyReturnDate = latelyReturnDate;
    }

    public int getTransNewID() {
        return TransNewID;
    }

    public void setTransNewID(int transNewID) {
        TransNewID = transNewID;
    }

    public Date getLastVisitDate() {
        return LastVisitDate;
    }

    public void setLastVisitDate(Date lastVisitDate) {
        LastVisitDate = lastVisitDate;
    }

    public Date getBuildUpDate() {
        return BuildUpDate;
    }

    public void setBuildUpDate(Date buildUpDate) {
        BuildUpDate = buildUpDate;
    }

    public Date getBookVisitDate() {
        return BookVisitDate;
    }

    public void setBookVisitDate(Date bookVisitDate) {
        BookVisitDate = bookVisitDate;
    }

    public Date getInvalidDate() {
        return InvalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        InvalidDate = invalidDate;
    }

    public double getAmountQuota() {
        return AmountQuota;
    }

    public void setAmountQuota(double amountQuota) {
        AmountQuota = amountQuota;
    }

    public double getStartAdvRecv() {
        return StartAdvRecv;
    }

    public void setStartAdvRecv(double startAdvRecv) {
        StartAdvRecv = startAdvRecv;
    }

    public double getRemainQuota() {
        return RemainQuota;
    }

    public void setRemainQuota(double remainQuota) {
        RemainQuota = remainQuota;
    }

    public double getStartReceivable() {
        return StartReceivable;
    }

    public void setStartReceivable(double startReceivable) {
        StartReceivable = startReceivable;
    }

    public String getRecvWay() {
        return RecvWay;
    }

    public void setRecvWay(String recvWay) {
        RecvWay = recvWay;
    }

    public double getCurAdvRecy() {
        return CurAdvRecy;
    }

    public void setCurAdvRecy(double curAdvRecy) {
        CurAdvRecy = curAdvRecy;
    }

    public Date getDayOfClose() {
        return DayOfClose;
    }

    public void setDayOfClose(Date dayOfClose) {
        DayOfClose = dayOfClose;
    }

    public double getCurReceivable() {
        return CurReceivable;
    }

    public void setCurReceivable(double curReceivable) {
        CurReceivable = curReceivable;
    }

    public String getCreditLevel() {
        return CreditLevel;
    }

    public void setCreditLevel(String creditLevel) {
        CreditLevel = creditLevel;
    }

    public double getNotInvQuota() {
        return NotInvQuota;
    }

    public void setNotInvQuota(double notInvQuota) {
        NotInvQuota = notInvQuota;
    }

    public String getInvoTypeID() {
        return InvoTypeID;
    }

    public void setInvoTypeID(String invoTypeID) {
        InvoTypeID = invoTypeID;
    }

    public String getAccAdvRecv() {
        return AccAdvRecv;
    }

    public void setAccAdvRecv(String accAdvRecv) {
        AccAdvRecv = accAdvRecv;
    }

    public String getAccReceivable() {
        return AccReceivable;
    }

    public void setAccReceivable(String accReceivable) {
        AccReceivable = accReceivable;
    }

    public String getAddField1() {
        return AddField1;
    }

    public void setAddField1(String addField1) {
        AddField1 = addField1;
    }

    public String getAddField2() {
        return AddField2;
    }

    public void setAddField2(String addField2) {
        AddField2 = addField2;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String memo) {
        Memo = memo;
    }
}
