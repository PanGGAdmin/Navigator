package com.example.controller.sales;

import com.example.pojo.procurement.Client_masterfile;
import com.example.pojo.sales.SSellQuote;
import com.example.service.sales.SalesQuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 销售报价controller
 */
@RestController
public class SalesQuotationController {
    @Autowired
    private SalesQuotationService salesQuotationService;

    /**
     * 查询正式客户
     */
    @RequestMapping("/queryClientMasterfile")
    public Map<String,Object> queryClientMasterfile(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("queryClientMasterfileData",salesQuotationService.queryClientMasterfile());
        return map;
    }

    /**
     * 查询当前系统时间
     * @return
     */
    @RequestMapping("/queryDate")
    public String queryDate(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = sdf.format(date);
        return dateStr;
    }

    /**
     * 主从新增销售报价单
     * @param sSellQuote
     * @return
     */
    @RequestMapping("/saveSalesQuotation")
    public Map<String,Object> saveSalesQuotation(SSellQuote sSellQuote){
        Map<String,Object> map=new HashMap<String,Object>();
        try {
            int i = salesQuotationService.saveSalesQuotation(sSellQuote);
            if(i>0){
                map.put("code",200);
                map.put("msg","新增成功");
            }else {
                map.put("code",204);
                map.put("msg","新增失败");
            }
            return map;
        }catch (Exception e){
            map.put("code",500);
            map.put("msg","新增失败,服务器异常");
            e.printStackTrace();
        }
        return map;
    }
}
