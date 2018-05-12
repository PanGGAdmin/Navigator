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
    checklist selectcl(@Param("currpage") int currpage);
    /*
   查询盘点单中的总记录数
    */
    Integer selectckcount();
    //查询出明细表
    List<checkdetailed> selectcd(@Param("clid") String clid);
    /*
   新增盘点单中的一条数据
    */
    void addck(@Param("cl")checklist cl);
    /*
  新增盘点单从表中的数据
   */
    void addcd(@Param("cd") checkdetailed cd ,@Param("clid") String clId);
    /*
   修改盘点单中的一条数据
    */
    void updatcd(@Param("cl")checklist cl);
}
