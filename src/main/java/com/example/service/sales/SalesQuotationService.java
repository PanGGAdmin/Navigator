package com.example.service.sales;

import com.example.mapper.sales.SalesQuotationMapper;
import com.example.pojo.gongyong.TPotentialClientMasterFile;
import com.example.pojo.gongyong.TPotentialClientMasterFileAddress;
import com.example.pojo.procurement.Client_masterfile;
import com.example.pojo.procurement.Client_masterfile_address;
import com.example.pojo.sales.SSellQuote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 销售报价service
 */
@Service
public class SalesQuotationService {
    @Autowired
    private SalesQuotationMapper salesQuotationMapper;

    /**
     * 查询正式客户
     */
    public List<Client_masterfile> queryClientMasterfile(){
        return salesQuotationMapper.queryClientMasterfile();
    }

    /**
     * 按正式客户编号查询客户地址
     * @param addressid
     * @return
     */
    public List<Client_masterfile_address> queryClientMasterfileAddress(String addressid){
        return salesQuotationMapper.queryClientMasterfileAddress(addressid);
    }

    /**
     * 查询潜在客户
     */
    public List<TPotentialClientMasterFile> queryPotentialClientFile(){
        return salesQuotationMapper.queryPotentialClientFile();
    }

    /**
     * 按潜在客户编号查询客户地址
     * @param addressid
     * @return
     */
    public List<TPotentialClientMasterFileAddress> queryPotentialClientFileAddress(String addressid){
        return salesQuotationMapper.queryPotentialClientFileAddress(addressid);
    }

    /**
     * 按日期查询做大订单号
     * @param dateStr
     * @return
     */
    public String queryMaxQuId(String dateStr){
        Long quId=salesQuotationMapper.queryMaxQuId(dateStr);
        if(quId!=null){
            return quId+1+"";
        }
        return dateStr.replace("-","")+"01";
    }

    public Integer querySellQuoteCount(){
        return salesQuotationMapper.querySellQuoteCount();
    }

    public SSellQuote querySellQuote(int pageSize){
        return salesQuotationMapper.querySellQuote((pageSize-1)*1);
    }

    /**
     * 主从新增销售报价单
     * @param sSellQuote
     * @return
     */
    public int saveSalesQuotation(SSellQuote sSellQuote){
        salesQuotationMapper.delSalesQuotation(sSellQuote.getQuId());
        return salesQuotationMapper.saveSalesQuotation(sSellQuote);
    }

    public int delSalesQuotation(String quid){
        return salesQuotationMapper.delSalesQuotation(quid);
    }
}
