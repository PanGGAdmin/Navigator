package com.example.pojo.procurement;

/**
 * 供应商主文件地址表
 * Created by Administrator on 2018/5/10.
 */
public class Vendor_masterfile_address {
    /*
    AddrID int not null PRIMARY key,	'地址编号'
	Address VARCHAR(20) not null,		'地址'
	ZipCode VARCHAR(20) not null,		'邮政编码'
	LinkMan VARCHAR(20),			'联系人'
	LinkManProf VARCHAR(20),		'联系人职称'
	Telephone VARCHAR(20),			'联系人电话'
	FaxNo VARCHAR(20),			'传真号码'
	WalkAddr VARCHAR(20),			'行走路线'
	Memo VARCHAR(20)			'备注'
     */

    private int AddrID;
    private String Address;
    private String ZipCode;
    private String LinkMan;
    private String LinkManProf;
    private String Telephone;
    private String FaxNo;
    private String WalkAddr;
    private String Memo;

    public int getAddrID() {
        return AddrID;
    }

    public void setAddrID(int addrID) {
        AddrID = addrID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public String getLinkMan() {
        return LinkMan;
    }

    public void setLinkMan(String linkMan) {
        LinkMan = linkMan;
    }

    public String getLinkManProf() {
        return LinkManProf;
    }

    public void setLinkManProf(String linkManProf) {
        LinkManProf = linkManProf;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getFaxNo() {
        return FaxNo;
    }

    public void setFaxNo(String faxNo) {
        FaxNo = faxNo;
    }

    public String getWalkAddr() {
        return WalkAddr;
    }

    public void setWalkAddr(String walkAddr) {
        WalkAddr = walkAddr;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String memo) {
        Memo = memo;
    }
}
