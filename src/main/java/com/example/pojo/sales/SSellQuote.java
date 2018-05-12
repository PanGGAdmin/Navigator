package com.example.pojo.sales;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 销售报价pojo
 */
public class SSellQuote {
    private String quId;            //1、单据号码

    private Integer quCid;          //2、客户编号id

    private String quCname;         //3、客户名称

    private String quCaddress;      //4、送货地址（客户表中带出）

    private Date quDate;            //5、单据日期

    private Date quEffectdate;      //6、有效日期

    private Integer quPricetax;     //7、单价是否含税 (1代表是0代表否)

    private String quMoneytype;     //8、币别

    private Double quExchangerate; //9、汇率

    private Integer quPeoywId;      //10、业务人员id

    private String quPeoywName;     //11、业务人员名称

    private Integer quEmpId;        //12、所属部门id

    private String quEmpName;       //13、所属部门名称

    private Integer quPerzdId;      //14、制单人员id

    private String quPerzdName;     //15、制单人员名称

    private Integer quPerckId;      //16、审核人员id

    private String quPerckName;     //17、审核人员name

    private Integer quCheckstatus;  //18、是否审核  (1代表审核，0代表未审核)

    private List<SSellQuoteparticular> sSellQuoteparticulars = new ArrayList<SSellQuoteparticular>(0); //销售报价明细对象集合

    public String getQuId() {
        return quId;
    }

    public void setQuId(String quId) {
        this.quId = quId == null ? null : quId.trim();
    }

    public Integer getQuCid() {
        return quCid;
    }

    public List<SSellQuoteparticular> getsSellQuoteparticulars() {
        return sSellQuoteparticulars;
    }

    public void setsSellQuoteparticulars(List<SSellQuoteparticular> sSellQuoteparticulars) {
        this.sSellQuoteparticulars = sSellQuoteparticulars;
    }

    public void setQuCid(Integer quCid) {
        this.quCid = quCid;
    }

    public String getQuCname() {
        return quCname;
    }

    public void setQuCname(String quCname) {
        this.quCname = quCname == null ? null : quCname.trim();
    }

    public String getQuCaddress() {
        return quCaddress;
    }

    public void setQuCaddress(String quCaddress) {
        this.quCaddress = quCaddress == null ? null : quCaddress.trim();
    }

    public Date getQuDate() {
        return quDate;
    }

    public void setQuDate(Date quDate) {
        this.quDate = quDate;
    }

    public Date getQuEffectdate() {
        return quEffectdate;
    }

    public void setQuEffectdate(Date quEffectdate) {
        this.quEffectdate = quEffectdate;
    }

    public Integer getQuPricetax() {
        return quPricetax;
    }

    public void setQuPricetax(Integer quPricetax) {
        this.quPricetax = quPricetax;
    }

    public String getQuMoneytype() {
        return quMoneytype;
    }

    public void setQuMoneytype(String quMoneytype) {
        this.quMoneytype = quMoneytype == null ? null : quMoneytype.trim();
    }

    public Double getQuExchangerate() {
        return quExchangerate;
    }

    public void setQuExchangerate(Double quExchangerate) {
        this.quExchangerate = quExchangerate;
    }

    public Integer getQuPeoywId() {
        return quPeoywId;
    }

    public void setQuPeoywId(Integer quPeoywId) {
        this.quPeoywId = quPeoywId;
    }

    public String getQuPeoywName() {
        return quPeoywName;
    }

    public void setQuPeoywName(String quPeoywName) {
        this.quPeoywName = quPeoywName == null ? null : quPeoywName.trim();
    }

    public Integer getQuEmpId() {
        return quEmpId;
    }

    public void setQuEmpId(Integer quEmpId) {
        this.quEmpId = quEmpId;
    }

    public String getQuEmpName() {
        return quEmpName;
    }

    public void setQuEmpName(String quEmpName) {
        this.quEmpName = quEmpName == null ? null : quEmpName.trim();
    }

    public Integer getQuPerzdId() {
        return quPerzdId;
    }

    public void setQuPerzdId(Integer quPerzdId) {
        this.quPerzdId = quPerzdId;
    }

    public String getQuPerzdName() {
        return quPerzdName;
    }

    public void setQuPerzdName(String quPerzdName) {
        this.quPerzdName = quPerzdName == null ? null : quPerzdName.trim();
    }

    public Integer getQuPerckId() {
        return quPerckId;
    }

    public void setQuPerckId(Integer quPerckId) {
        this.quPerckId = quPerckId;
    }

    public String getQuPerckName() {
        return quPerckName;
    }

    public void setQuPerckName(String quPerckName) {
        this.quPerckName = quPerckName == null ? null : quPerckName.trim();
    }

    public Integer getQuCheckstatus() {
        return quCheckstatus;
    }

    public void setQuCheckstatus(Integer quCheckstatus) {
        this.quCheckstatus = quCheckstatus;
    }
}