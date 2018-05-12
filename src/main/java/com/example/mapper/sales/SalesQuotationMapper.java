package com.example.mapper.sales;

import com.example.pojo.gongyong.TPotentialClientMasterFile;
import com.example.pojo.gongyong.TPotentialClientMasterFileAddress;
import com.example.pojo.procurement.Client_masterfile;
import com.example.pojo.procurement.Client_masterfile_address;
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
     * 按正式客户编号查询客户地址
     * @param addressid
     * @return
     */
    public List<Client_masterfile_address> queryClientMasterfileAddress(@Param("addressid") String addressid);

    /**
     * 查询潜在客户
     * @return
     */
    public List<TPotentialClientMasterFile> queryPotentialClientFile();

    /**
     * 按潜在客户编号查询客户地址
     * @param addressid
     * @return
     */
    public List<TPotentialClientMasterFileAddress> queryPotentialClientFileAddress(@Param("addressid") String addressid);

    /**
     * 按日期查询做大订单号     * @param dateStr
     * @return
     */
    public Long  queryMaxQuId(@Param("dateStr") String dateStr);

    public SSellQuote querySellQuote(@Param("pageSize") int pageSize);

    /**
     * 主从新增销售报价单
     * @param sSellQuote
     * @return
     */
    public int saveSalesQuotation(@Param("sSellQuote") SSellQuote sSellQuote);

}
