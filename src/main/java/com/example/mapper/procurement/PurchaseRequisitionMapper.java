package com.example.mapper.procurement;

import com.example.pojo.procurement.Orders;
import com.example.pojo.procurement.Requisitions;
import com.example.pojo.procurement.Requisitions_detail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 采购请购mapper
 */
@Mapper
public interface PurchaseRequisitionMapper {
    /**
     * 分页查询采购请购单据
     * @return
     */
    List<Requisitions> hjl_pageSelect(@Param("pageIndex") Integer pageIndex);

    /**
     * 分页查询采购请购单据总条数
     * @return
     */
    int hjl_count();

    /**
     * 查询采购请购单明细表信息
     * @param billno
     * @return
     */
    List<Requisitions_detail> hjl_detail(@Param("billno") String billno);


    /**
     * 查询销售订单信息
     * @return
     */


    /**
     * 查询当天最大的单据号码
     * @return
     */
    String hjl_maxBillno(@Param("billDate") String billDate);

    /**
     * 新增采购请购单据
     * @param requisitions
     * @return
     */
    int hjl_insert(Requisitions requisitions);

    /**
     * 新增采购单据从表信息
     * @param requisitions_detail
     * @return
     */
    int hjl_insertDetail(Requisitions_detail requisitions_detail);

    /**
     * 修改采购请购单据主表信息
     * @param requisitions
     * @return
     */
    int hjl_update(Requisitions requisitions);

    /**
     * 修改采购请购单据从表信息
     * @param requisitions_detail
     * @return
     */
    int hjl_updateDetail(Requisitions_detail requisitions_detail);

    /**
     * 删除采购请购单据主表信息，将删除状态1可见改为删除状态0不可见
     * @param requisitions
     * @return
     */
    int hjl_delete(Requisitions requisitions);

    /**
     * 删除采购请购单据，将删除状态1可见改为删除状态0不可见
     * @param requisitions_detail
     * @return
     */
    int hjl_deleteDetail(Requisitions_detail requisitions_detail);
}
