package com.example.pojo.account.yxppojo;

/**
 * Created by Administrator on 2018/5/10.
 */
public class modifydetailed {

    private String mdId;            //单据号码
    private int columnId;           //栏号
    private String materielId;      //物料编号
    private double avgVost;         //平均成本价
    private double price;           //单价
    private double tiaojiajine;     //调价金额
    private String cause;           //原因

    public String getMdId() {
        return mdId;
    }

    public void setMdId(String mdId) {
        this.mdId = mdId;
    }
}
