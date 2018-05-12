package com.example.service.inventory;

import com.example.mapper.inventory.PricingMapper;
import com.example.pojo.pricing.DropOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 调拨单service
 */
@Service
public class PricingService {
    @Autowired
    private PricingMapper pricingMapper;

    // 新增调拨单主表
    public void insertdropout(String DiaoChuCangku,String DiaoRuCangKu,String DanJvRiQi, String DanJvHaoMan, String ZhiDanRenYuan, String FuHeRenYuan){
        pricingMapper.insertdropout(DiaoChuCangku,DiaoRuCangKu,DanJvRiQi,DanJvHaoMan,ZhiDanRenYuan,FuHeRenYuan);
    }
    // 新增调拨单从表
    public void insertdropouts(int Did, int Bid, String ShuLiang,String BeiZhu){
        pricingMapper.insertdropouts(Did,Bid,ShuLiang,BeiZhu);
    }
    //查询分页
    public List<DropOut> selectbyone(int begin) {
        return  pricingMapper.selectbyone(begin);
    }
    //查询最大条数
    public int count(){
        return pricingMapper.count();
    }
    //删除主表
    public  void deletedropout( int Id){
         pricingMapper.deletedropout(Id);
    }
    //删除从表
    public  void deletedropouts(int Id){
        pricingMapper.deletedropouts(Id);
    }
    //修改主表
    void updatedropout( String DiaoChuCangku, String DiaoRuCangKu, String DanJvRiQi, String DanJvHaoMan, String ZhiDanRenYuan, String FuHeRenYuan, int Id){
        pricingMapper.updatedropout(DiaoChuCangku,DiaoRuCangKu,DanJvRiQi,DanJvHaoMan,ZhiDanRenYuan,FuHeRenYuan,Id);
    }
    //修改从表
    void updatedropouts( int Did, int Bid, String ShuLiang, String BeiZhu, int Id){
        pricingMapper.updatedropouts(Did,Bid,ShuLiang,BeiZhu,Id);
    }

}
