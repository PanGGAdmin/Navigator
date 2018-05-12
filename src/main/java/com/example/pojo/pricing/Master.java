package com.example.pojo.pricing;

/**
 * Created by Administrator on 2018/5/10.
 */
/**
 * 物料主文件表（物料维护）
 */
public class Master {
    private int     Id;                 //id自增
    private String  BianHao;            //物料编号
    private String  Name;               //物料名称
    private String  Model;              //规格型号
    private String  Type;               //物料类别
    private String  JilLiangDanWei;    //计量单位
    private String  Price;              //建议售价
    private String  Pricea;             //售价a
    private String Priceb;             //售价b
    private String  BiaoZhuenJingJiaoi;//标准进价
    private String  BiBei;              // 使用币别
    private String  ZhuangTai;          //物料状态
    private String  HanShuei;           //单价是否含税
    private String  ShuieLv;            //税率

    private String  CaiGouTiQianQi;       //采购提前期
    private String  ZhuGongYingShang;   //主供应商
    private String  QiChuZongShuLiang;  //期初总数量
    private String  PingJunChenBen;     //平均成本
    private String  BIaozhuenChenBen;   //标准成本
    private String  QiChuZongChenBen;   //期初总成本
    private String  XianYouZongShuLiang;//现有总数量
    private String  XianXingPingJunChenBen;//现行平均成本
    private String  BiaoZhuenZongChenBen;//标准总成本
    private String   MasterBh;             //现行总成本

    public int getId() {
        return Id;
    }

    public String getBianHao() {
        return BianHao;
    }

    public String getName() {
        return Name;
    }

    public String getModel() {
        return Model;
    }

    public String getType() {
        return Type;
    }

    public String getJilLiangDanWei() {
        return JilLiangDanWei;
    }

    public String getPrice() {
        return Price;
    }

    public String getPricea() {
        return Pricea;
    }

    public String getPriceb() {
        return Priceb;
    }

    public String getBiaoZhuenJingJiaoi() {
        return BiaoZhuenJingJiaoi;
    }

    public String getBiBei() {
        return BiBei;
    }

    public String getZhuangTai() {
        return ZhuangTai;
    }

    public String getHanShuei() {
        return HanShuei;
    }

    public String getShuieLv() {
        return ShuieLv;
    }

    public String getCaiGouTiQianQi() {
        return CaiGouTiQianQi;
    }

    public String getZhuGongYingShang() {
        return ZhuGongYingShang;
    }

    public String getQiChuZongShuLiang() {
        return QiChuZongShuLiang;
    }

    public String getPingJunChenBen() {
        return PingJunChenBen;
    }

    public String getBIaozhuenChenBen() {
        return BIaozhuenChenBen;
    }

    public String getQiChuZongChenBen() {
        return QiChuZongChenBen;
    }

    public String getXianYouZongShuLiang() {
        return XianYouZongShuLiang;
    }

    public String getXianXingPingJunChenBen() {
        return XianXingPingJunChenBen;
    }

    public String getBiaoZhuenZongChenBen() {
        return BiaoZhuenZongChenBen;
    }

    public String getMasterBh() {
        return MasterBh;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setBianHao(String bianHao) {
        BianHao = bianHao;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setJilLiangDanWei(String jilLiangDanWei) {
        JilLiangDanWei = jilLiangDanWei;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setPricea(String pricea) {
        Pricea = pricea;
    }

    public void setPriceb(String priceb) {
        Priceb = priceb;
    }

    public void setBiaoZhuenJingJiaoi(String biaoZhuenJingJiaoi) {
        BiaoZhuenJingJiaoi = biaoZhuenJingJiaoi;
    }

    public void setBiBei(String biBei) {
        BiBei = biBei;
    }

    public void setZhuangTai(String zhuangTai) {
        ZhuangTai = zhuangTai;
    }

    public void setHanShuei(String hanShuei) {
        HanShuei = hanShuei;
    }

    public void setShuieLv(String shuieLv) {
        ShuieLv = shuieLv;
    }

    public void setCaiGouTiQianQi(String caiGouTiQianQi) {
        CaiGouTiQianQi = caiGouTiQianQi;
    }

    public void setZhuGongYingShang(String zhuGongYingShang) {
        ZhuGongYingShang = zhuGongYingShang;
    }

    public void setQiChuZongShuLiang(String qiChuZongShuLiang) {
        QiChuZongShuLiang = qiChuZongShuLiang;
    }

    public void setPingJunChenBen(String pingJunChenBen) {
        PingJunChenBen = pingJunChenBen;
    }

    public void setBIaozhuenChenBen(String BIaozhuenChenBen) {
        this.BIaozhuenChenBen = BIaozhuenChenBen;
    }

    public void setQiChuZongChenBen(String qiChuZongChenBen) {
        QiChuZongChenBen = qiChuZongChenBen;
    }

    public void setXianYouZongShuLiang(String xianYouZongShuLiang) {
        XianYouZongShuLiang = xianYouZongShuLiang;
    }

    public void setXianXingPingJunChenBen(String xianXingPingJunChenBen) {
        XianXingPingJunChenBen = xianXingPingJunChenBen;
    }

    public void setBiaoZhuenZongChenBen(String biaoZhuenZongChenBen) {
        BiaoZhuenZongChenBen = biaoZhuenZongChenBen;
    }

    public void setMasterBh(String masterBh) {
        MasterBh = masterBh;
    }
}
