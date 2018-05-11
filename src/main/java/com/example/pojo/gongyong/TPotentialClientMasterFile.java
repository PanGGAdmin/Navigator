package com.example.pojo.gongyong;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 潜在客户主文件表
 */
public class TPotentialClientMasterFile {
    private String id;//客户编号

    private String custintro;//英文简称

    private String fullname;//客户全称

    private String clazzid;//类别

    private String shortname;//客户简称

    private String areaid;//地区

    private String engshortname;//英文全称

    private String currencyid;//币别

    private String levelid;//客户等级

    private Date beginstagedate;//始洽日期

    private Float efficiency;//成功几率%

    private Float bargainamt;//预估成交

    private String personid;//业务人员

    private List<TPotentialClientMasterFileAddress> tPotentialClientMasterFileAddresses = new ArrayList<TPotentialClientMasterFileAddress>(); //潜在客户地址集合

    public List<TPotentialClientMasterFileAddress> gettPotentialClientMasterFileAddresses() {
        return tPotentialClientMasterFileAddresses;
    }

    public void settPotentialClientMasterFileAddresses(List<TPotentialClientMasterFileAddress> tPotentialClientMasterFileAddresses) {
        this.tPotentialClientMasterFileAddresses = tPotentialClientMasterFileAddresses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCustintro() {
        return custintro;
    }

    public void setCustintro(String custintro) {
        this.custintro = custintro == null ? null : custintro.trim();
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public String getClazzid() {
        return clazzid;
    }

    public void setClazzid(String clazzid) {
        this.clazzid = clazzid == null ? null : clazzid.trim();
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getEngshortname() {
        return engshortname;
    }

    public void setEngshortname(String engshortname) {
        this.engshortname = engshortname == null ? null : engshortname.trim();
    }

    public String getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(String currencyid) {
        this.currencyid = currencyid == null ? null : currencyid.trim();
    }

    public String getLevelid() {
        return levelid;
    }

    public void setLevelid(String levelid) {
        this.levelid = levelid == null ? null : levelid.trim();
    }

    public Date getBeginstagedate() {
        return beginstagedate;
    }

    public void setBeginstagedate(Date beginstagedate) {
        this.beginstagedate = beginstagedate;
    }

    public Float getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(Float efficiency) {
        this.efficiency = efficiency;
    }

    public Float getBargainamt() {
        return bargainamt;
    }

    public void setBargainamt(Float bargainamt) {
        this.bargainamt = bargainamt;
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }
}