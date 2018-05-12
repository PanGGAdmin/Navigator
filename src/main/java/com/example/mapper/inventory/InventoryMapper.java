package com.example.mapper.inventory;

import com.example.pojo.account.yxppojo.checkdetailed;
import com.example.pojo.account.yxppojo.checklist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 盘点单mapper
 */
@Mapper
public interface InventoryMapper {

    /*
    查询盘点单中的一条数据+分页
     */
    checklist selectck(@Param("currpage") int currpage);
    /*
   查询盘点单中的总记录数
    */
    int selectckcount();
    //查询出明细表
    List<checkdetailed> selectcd(@Param("clid") String clid);
    /*
   新增盘点单中的一条数据
    */
    void addck(checklist cl);
    /*
   修改盘点单中的一条数据
    */
    void updatck(checklist cl);
}
