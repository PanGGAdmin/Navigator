package com.example.mapper.sales;

import com.example.pojo.procurement.Client_masterfile;
import com.example.pojo.sales.SSellQuote;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 销售报价mapper
 */
@Mapper
public interface SalesQuotationMapper {

    /**
     * 查询正式客户
     * @return
     */
    public List<Client_masterfile> queryClientMasterfile();


    /**
     * 主从新增销售报价单
     * @param sSellQuote
     * @return
     */
    public int saveSalesQuotation(@Param("sSellQuote") SSellQuote sSellQuote);

}
