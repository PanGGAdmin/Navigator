package com.example.pojo.procurement;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * 采购请购主表信息字段
 */
public class Requisitions {

    private String billno;//当前日期+三位流水号	单据号码

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date billdate;//当前日期	单据日期

    private String billstyleid;//	采购请购类型（关联采购请购类别设定）

    private String billstatus;//未结案	单况（1.已结案，2.未结案，3.无效）

    private Integer salesid;//	请购人员（关联人员主文件设定）

    private Integer departid;//	请购部门(关联部门设定)

    private String maker;//系统登录人员	制单人员

    private String permitter;//系统登录复核人员	复核人员

    private Integer headerid;//	表头条文(关联报表条文)

    private Integer footerid;//	表尾条文(关联报表条文)

    private String userdef1;//	自定栏一

    private String userdef2;//	自定栏二

    private String remark;//	备注

    private Integer deletestatus;//默认可用  1	是否可用  0不可用 1可用(删除是改为不可用)

    private List<Requisitions_detail> requisitions_detail;//关联采购请购从表信息

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public String getBillstyleid() {
        return billstyleid;
    }

    public void setBillstyleid(String billstyleid) {
        this.billstyleid = billstyleid;
    }

    public String getBillstatus() {
        return billstatus;
    }

    public void setBillstatus(String billstatus) {
        this.billstatus = billstatus;
    }

    public Integer getSalesid() {
        return salesid;
    }

    public void setSalesid(Integer salesid) {
        this.salesid = salesid;
    }

    public Integer getDepartid() {
        return departid;
    }

    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getPermitter() {
        return permitter;
    }

    public void setPermitter(String permitter) {
        this.permitter = permitter;
    }

    public Integer getHeaderid() {
        return headerid;
    }

    public void setHeaderid(Integer headerid) {
        this.headerid = headerid;
    }

    public Integer getFooterid() {
        return footerid;
    }

    public void setFooterid(Integer footerid) {
        this.footerid = footerid;
    }

    public String getUserdef1() {
        return userdef1;
    }

    public void setUserdef1(String userdef1) {
        this.userdef1 = userdef1;
    }

    public String getUserdef2() {
        return userdef2;
    }

    public void setUserdef2(String userdef2) {
        this.userdef2 = userdef2;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getDeletestatus() {
        return deletestatus;
    }

    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }

    public List<Requisitions_detail> getRequisitions_detail() {
        return requisitions_detail;
    }

    public void setRequisitions_detail(List<Requisitions_detail> requisitions_detail) {
        this.requisitions_detail = requisitions_detail;
    }
}