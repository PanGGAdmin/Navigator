package com.example.pojo.sales;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 销售订单pojo
 */
public class SSellOrder {
    private String orId;//单据号码

    private Integer orClientid;//客户ID

    private String orClientname;//客户名称

    private String orClientaddress;//送货地址

    private String orType;//订单类型

    private Integer orShuik;//单据是否含税

    private String orDank;//单况

    private Date orOrderdate;//单据日期

    private Integer orState;//审核状态

    private Integer orUserid;//业务人员ID

    private String orUsername;//业务人员姓名

    private Integer orEmpId;//所属部门id

    private String orEmpName;//所属部门姓名

    private Integer orPerzdId;//制单人员id

    private String orPerzdName;//制单人员姓名

    private Integer orPerckId;//复核人员id

    private String orPerckName;//复核人员姓名

    private String orCustomerordere;//客户订单

    private String orMoneytype;//币别

    private Double orExchangerate;//汇率

    private List<SSellOrderparticular> sSellOrderparticulars = new ArrayList<SSellOrderparticular>(0); //销售订单明细对象集合

    public String getOrId() {
        return orId;
    }

    public void setOrId(String orId) {
        this.orId = orId == null ? null : orId.trim();
    }

    public Integer getOrClientid() {
        return orClientid;
    }

    public void setOrClientid(Integer orClientid) {
        this.orClientid = orClientid;
    }

    public String getOrClientname() {
        return orClientname;
    }

    public void setOrClientname(String orClientname) {
        this.orClientname = orClientname == null ? null : orClientname.trim();
    }

    public String getOrClientaddress() {
        return orClientaddress;
    }

    public void setOrClientaddress(String orClientaddress) {
        this.orClientaddress = orClientaddress == null ? null : orClientaddress.trim();
    }

    public String getOrType() {
        return orType;
    }

    public void setOrType(String orType) {
        this.orType = orType == null ? null : orType.trim();
    }

    public Integer getOrShuik() {
        return orShuik;
    }

    public void setOrShuik(Integer orShuik) {
        this.orShuik = orShuik;
    }

    public String getOrDank() {
        return orDank;
    }

    public void setOrDank(String orDank) {
        this.orDank = orDank == null ? null : orDank.trim();
    }

    public Date getOrOrderdate() {
        return orOrderdate;
    }

    public void setOrOrderdate(Date orOrderdate) {
        this.orOrderdate = orOrderdate;
    }

    public Integer getOrState() {
        return orState;
    }

    public void setOrState(Integer orState) {
        this.orState = orState;
    }

    public Integer getOrUserid() {
        return orUserid;
    }

    public void setOrUserid(Integer orUserid) {
        this.orUserid = orUserid;
    }

    public String getOrUsername() {
        return orUsername;
    }

    public void setOrUsername(String orUsername) {
        this.orUsername = orUsername == null ? null : orUsername.trim();
    }

    public Integer getOrEmpId() {
        return orEmpId;
    }

    public void setOrEmpId(Integer orEmpId) {
        this.orEmpId = orEmpId;
    }

    public String getOrEmpName() {
        return orEmpName;
    }

    public void setOrEmpName(String orEmpName) {
        this.orEmpName = orEmpName == null ? null : orEmpName.trim();
    }

    public Integer getOrPerzdId() {
        return orPerzdId;
    }

    public void setOrPerzdId(Integer orPerzdId) {
        this.orPerzdId = orPerzdId;
    }

    public String getOrPerzdName() {
        return orPerzdName;
    }

    public void setOrPerzdName(String orPerzdName) {
        this.orPerzdName = orPerzdName == null ? null : orPerzdName.trim();
    }

    public Integer getOrPerckId() {
        return orPerckId;
    }

    public void setOrPerckId(Integer orPerckId) {
        this.orPerckId = orPerckId;
    }

    public String getOrPerckName() {
        return orPerckName;
    }

    public void setOrPerckName(String orPerckName) {
        this.orPerckName = orPerckName == null ? null : orPerckName.trim();
    }

    public String getOrCustomerordere() {
        return orCustomerordere;
    }

    public void setOrCustomerordere(String orCustomerordere) {
        this.orCustomerordere = orCustomerordere == null ? null : orCustomerordere.trim();
    }

    public String getOrMoneytype() {
        return orMoneytype;
    }

    public void setOrMoneytype(String orMoneytype) {
        this.orMoneytype = orMoneytype == null ? null : orMoneytype.trim();
    }

    public Double getOrExchangerate() {
        return orExchangerate;
    }

    public void setOrExchangerate(Double orExchangerate) {
        this.orExchangerate = orExchangerate;
    }

    public List<SSellOrderparticular> getsSellOrderparticulars() {
        return sSellOrderparticulars;
    }

    public void setsSellOrderparticulars(List<SSellOrderparticular> sSellOrderparticulars) {
        this.sSellOrderparticulars = sSellOrderparticulars;
    }
}