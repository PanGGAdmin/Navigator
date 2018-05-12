package com.example.mapper.inventory;

import com.example.pojo.pricing.DropOut;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 调拨单mapper
 */
@Mapper
public interface PricingMapper {
    // 新增调拨单主表
    void insertdropout(@Param("DiaoChuCangku") String DiaoChuCangku,
                       @Param("DiaoRuCangKu") String DiaoRuCangKu,
                       @Param("DanJvRiQi") String DanJvRiQi,
                       @Param("DanJvHaoMan") String DanJvHaoMan,
                       @Param("ZhiDanRenYuan") String ZhiDanRenYuan,
                       @Param("FuHeRenYuan") String FuHeRenYuan
                       );
    // 新增调拨单从表
    void insertdropouts(@Param("Did") int Did,
                        @Param("Bid") int Bid,
                        @Param("ShuLiang") String ShuLiang,
                        @Param("BeiZhu") String BeiZhu
                        );
    //查询分页
    List<DropOut> selectbyone(@Param("begin") int begin);
    //查询最大条数
    int count();
    //删除主表
    void deletedropout(@Param("Id")  int Id);
    //删除从表
    void deletedropouts(@Param("Id")  int Id);
    //修改主表
    void updatedropout(@Param("DiaoChuCangku") String DiaoChuCangku,
                       @Param("DiaoRuCangKu") String DiaoRuCangKu,
                       @Param("DanJvRiQi") String DanJvRiQi,
                       @Param("DanJvHaoMan") String DanJvHaoMan,
                       @Param("ZhiDanRenYuan") String ZhiDanRenYuan,
                       @Param("FuHeRenYuan") String FuHeRenYuan,
                       @Param("Id")  int Id);
    //修改从表
    void updatedropouts(@Param("Did") int Did,
                        @Param("Bid") int Bid,
                        @Param("ShuLiang") String ShuLiang,
                        @Param("BeiZhu") String BeiZhu,
                        @Param("Id")  int Id
    );

}
