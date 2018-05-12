package com.example.pojo.pricing;

/**
 * Created by Administrator on 2018/5/10.
 */

//import java.sql.Timestamp;

/**
 *掉拨单主表
 */
public class DropOut {
    private  int         Id;                         //自增
    private  String      DiaoChuCangku;    //调出仓库
    private  String      DiaoRuCangKu;    //调入仓库
    private  String      DanJvRiQi;       //单据日期
    private  String      DanJvHaoMan;     //单据号码
    private  String      ZhiDanRenYuan;   //制单人员
    private  String      FuHeRenYuan;    //复核人员
    private  DropOuts d;

    public int getId() {
        return Id;
    }

    public String getDiaoChuCangku() {
        return DiaoChuCangku;
    }

    public String getDiaoRuCangKu() {
        return DiaoRuCangKu;
    }

    public String getDanJvRiQi() {
        return DanJvRiQi;
    }

    public String getDanJvHaoMan() {
        return DanJvHaoMan;
    }

    public String getZhiDanRenYuan() {
        return ZhiDanRenYuan;
    }

    public String getFuHeRenYuan() {
        return FuHeRenYuan;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setDiaoChuCangku(String diaoChuCangku) {
        DiaoChuCangku = diaoChuCangku;
    }

    public void setDiaoRuCangKu(String diaoRuCangKu) {
        DiaoRuCangKu = diaoRuCangKu;
    }

    public void setDanJvRiQi(String danJvRiQi) {
        DanJvRiQi = danJvRiQi;
    }

    public void setDanJvHaoMan(String danJvHaoMan) {
        DanJvHaoMan = danJvHaoMan;
    }

    public void setZhiDanRenYuan(String zhiDanRenYuan) {
        ZhiDanRenYuan = zhiDanRenYuan;
    }

    public void setFuHeRenYuan(String fuHeRenYuan) {
        FuHeRenYuan = fuHeRenYuan;
    }
}
