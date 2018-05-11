package com.example.pojo.gongyong;

public class TPotentialClientMasterFileAddress {
    private String addrid;//地址编号

    private String address;//地址

    private String zipcode;//邮政编码

    private String linkman;//联系人

    private String linkmanprof;//联系人职称

    private String telephone;//联系电话

    private String faxno;//传真号码

    private String walkaddr;//行走路线

    private String memo;//备注

    private String addressid;//地址关联

    private TPotentialClientMasterFile tPotentialClientMasterFile; //潜在客户主文件对象

    public TPotentialClientMasterFile gettPotentialClientMasterFile() {
        return tPotentialClientMasterFile;
    }

    public void settPotentialClientMasterFile(TPotentialClientMasterFile tPotentialClientMasterFile) {
        this.tPotentialClientMasterFile = tPotentialClientMasterFile;
    }

    public String getAddrid() {
        return addrid;
    }

    public void setAddrid(String addrid) {
        this.addrid = addrid == null ? null : addrid.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getLinkmanprof() {
        return linkmanprof;
    }

    public void setLinkmanprof(String linkmanprof) {
        this.linkmanprof = linkmanprof == null ? null : linkmanprof.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getFaxno() {
        return faxno;
    }

    public void setFaxno(String faxno) {
        this.faxno = faxno == null ? null : faxno.trim();
    }

    public String getWalkaddr() {
        return walkaddr;
    }

    public void setWalkaddr(String walkaddr) {
        this.walkaddr = walkaddr == null ? null : walkaddr.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getAddressid() {
        return addressid;
    }

    public void setAddressid(String addressid) {
        this.addressid = addressid == null ? null : addressid.trim();
    }
}