package com.example.pojo.account.yxppojo;

import java.util.Date;

/**
 * Created by Administrator on 2018/5/10.
 */
public class modifyprice {

    private String mpId;            //调价编号
    private Date madate;            //单据日期
    private int warehouseId;        //仓库
    private int modifyType;         //调整方式 1调单价/2调金额
    private int zhidanuserId;       //制单人员
    private int fuheuserId;         //复核人员
    public String getMpId() {
        return mpId;
    }
    public void setMpId(String mpId) {
        this.mpId = mpId;
    }
    public Date getMadate() {
        return madate;
    }
    public void setMadate(Date madate) {
        this.madate = madate;
    }
    public int getWarehouseId() {
        return warehouseId;
    }
    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }
    public int getModifyType() {
        return modifyType;
    }
    public void setModifyType(int modifyType) {
        this.modifyType = modifyType;
    }
    public int getZhidanuserId() {
        return zhidanuserId;
    }
    public void setZhidanuserId(int zhidanuserId) {
        this.zhidanuserId = zhidanuserId;
    }
    public int getFuheuserId() {
        return fuheuserId;
    }
    public void setFuheuserId(int fuheuserId) {
        this.fuheuserId = fuheuserId;
    }


}
