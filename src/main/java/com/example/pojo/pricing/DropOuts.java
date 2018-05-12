package com.example.pojo.pricing;

/**
 * Created by Administrator on 2018/5/10.
 */

/**
 * 调拨从表（明细信息）
 */
public class DropOuts {
    private int      id;        //Id主键自增
    private int      Did;       //Did逻辑外键链接DropOut中的id
    private int      Bid;       //bid逻辑外键链接物料表中的id
    private String   ShuLiang;  //数量
    private String   BeiZhu;    //备注

    public int getId() {
        return id;
    }

    public int getDid() {
        return Did;
    }

    public int getBid() {
        return Bid;
    }

    public String getShuLiang() {
        return ShuLiang;
    }

    public String getBeiZhu() {
        return BeiZhu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDid(int did) {
        Did = did;
    }

    public void setBid(int bid) {
        Bid = bid;
    }

    public void setShuLiang(String shuLiang) {
        ShuLiang = shuLiang;
    }

    public void setBeiZhu(String beiZhu) {
        BeiZhu = beiZhu;
    }
}
