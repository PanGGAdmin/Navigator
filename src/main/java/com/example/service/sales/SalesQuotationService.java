package com.example.service.sales;

import com.example.mapper.sales.SalesQuotationMapper;
import com.example.pojo.procurement.Client_masterfile;
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
     * 主从新增销售报价单
     * @param sSellQuote
     * @return
     */
    public int saveSalesQuotation(SSellQuote sSellQuote){
        return salesQuotationMapper.saveSalesQuotation(sSellQuote);
    }
}
