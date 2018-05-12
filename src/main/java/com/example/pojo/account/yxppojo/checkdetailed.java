package com.example.pojo.account.yxppojo;

/**
 * Created by Administrator on 2018/5/10.
 */
public class checkdetailed {

    private String clId;                //单据号码
    private int columId;                //栏号
    private String materielId;          //物料编号
    private double zhangmianCount;      //账面数量
    private double pandianCount;        //盘点数量
    private double price;               //单价
    private double yingkuiPrice;        //盈亏金额
    private String cause;               //原因
    public String getClId() {
        return clId;
    }
    public void setClId(String clId) {
        this.clId = clId;
    }
    public int getColumId() {
        return columId;
    }
    public void setColumId(int columId) {
        this.columId = columId;
    }
    public String getMaterielId() {
        return materielId;
    }
    public void setMaterielId(String materielId) {
        this.materielId = materielId;
    }
    public double getZhangmianCount() {
        return zhangmianCount;
    }
    public void setZhangmianCount(double zhangmianCount) {
        this.zhangmianCount = zhangmianCount;
    }
    public double getPandianCount() {
        return pandianCount;
    }
    public void setPandianCount(double pandianCount) {
        this.pandianCount = pandianCount;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getYingkuiPrice() {
        return yingkuiPrice;
    }
    public void setYingkuiPrice(double yingkuiPrice) {
        this.yingkuiPrice = yingkuiPrice;
    }
    public String getCause() {
        return cause;
    }
    public void setCause(String cause) {
        this.cause = cause;
    }

}
