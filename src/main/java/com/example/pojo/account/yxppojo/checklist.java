package com.example.pojo.account.yxppojo;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/5/10.
 */
public class checklist {

    private String clId;         //编号Id
    private Date clDate;		//单据日期
    private int warehouseId;	//仓库编号
    private int pandianuserId;  //盘点人id
    private int departmentId;	//部门id
    private int zhidanuserId;	//制单人员
    private int fuheuserId;		//复核人员
    public String getClId() {
        return clId;
    }
    public void setClId(String clId) {
        this.clId = clId;
    }
    public Date getClDate() {
        return clDate;
    }
    public void setClDate(Date clDate) {
        this.clDate = clDate;
    }
    public int getWarehouseId() {
        return warehouseId;
    }
    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }
    public int getPandianuserId() {
        return pandianuserId;
    }
    public void setPandianuserId(int pandianuserId) {
        this.pandianuserId = pandianuserId;
    }
    public int getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
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


    private List<checkdetailed> cdetailed;

    public List<checkdetailed> getCdetailed() {
        return cdetailed;
    }

    public void setCdetailed(List<checkdetailed> cdetailed) {
        this.cdetailed = cdetailed;
    }
}
