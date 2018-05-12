package com.example.controller.sales;

import com.example.pojo.gongyong.TPotentialClientMasterFileAddress;
import com.example.pojo.procurement.Client_masterfile;
import com.example.pojo.procurement.Client_masterfile_address;
import com.example.pojo.sales.SSellQuote;
import com.example.service.sales.SalesQuotationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
     * 按正式客户编号查询客户地址
     * @param addressid
     * @return
     */
    @RequestMapping("/queryClientMasterfileAddress")
    public Map<String,Object> queryClientMasterfileAddress(String addressid){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("queryClientMasterfileAddressData",salesQuotationService.queryClientMasterfileAddress(addressid));
        return map;
    }

    /**
     * 查询潜在客户
     */
    @RequestMapping("/queryPotentialClientFile")
    public Map<String,Object> queryPotentialClientFile(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("queryPotentialClientFileData",salesQuotationService.queryPotentialClientFile());
        return map;
    }

    /**
     * 按潜在客户编号查询客户地址
     * @param addressid
     * @return
     */
    @RequestMapping("/queryPotentialClientFileAddress")
    public Map<String,Object> queryPotentialClientFileAddress(String addressid){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("queryPotentialClientFileAddressData",salesQuotationService.queryPotentialClientFileAddress(addressid));
        return map;
    }

    /**
     * 查询当前系统时间
     * @return
     */
    @RequestMapping("/queryMaxNoByDate")
    public String queryDate(String dateStr){
        return "";
    }

    /**
     * 按日期查询做大订单号
     * @param dateStr
     * @return
     */
    @RequestMapping("/queryMaxQuId")
    public String queryMaxQuId(String dateStr){
        return salesQuotationService.queryMaxQuId(dateStr);
    }

    /**
     * 查询首页数据
     * @param pageSize
     * @return
     */
    @RequestMapping("querySellQuote")
    public Map<String,Object> querySellQuote(Integer pageSize){
        Map<String,Object> map = new HashMap<String,Object>();
        int count = salesQuotationService.querySellQuoteCount();
        int currpage=1;
        if(pageSize!=null){
            currpage=pageSize;
        }
        int perPage=currpage-1>0?currpage-1:1;
        int nextPage=currpage+1>=count?count:currpage+1;
        map.put("maxPage",count);
        map.put("perPage",perPage);
        map.put("nextPage",nextPage);
        map.put("querySellQuoteData",salesQuotationService.querySellQuote(currpage));
        return map;
    }


    /**
     * 主从新增销售报价单
     * @param sSellQuote
     * @return
     */
    @RequestMapping("/saveSalesQuotation")
    public Map<String,Object> saveSalesQuotation(@RequestBody SSellQuote sSellQuote){
        Map<String,Object> map=new HashMap<String,Object>();
        try {
            /*ObjectMapper mapper = new ObjectMapper();
            // 将json字符串解析为一个Java对象
            SSellQuote sSellQuote1 = mapper.readValue(sSellQuote, SSellQuote.class);*/
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

    /**
     * 主从删除销售报价单
     * @param quid
     * @return
     */
    @RequestMapping("delSalesQuotation")
    public Map<String,Object> delSalesQuotation(String quid){
        Map<String,Object> map=new HashMap<String,Object>();
        try {
            salesQuotationService.delSalesQuotation(quid);
            map.put("code",200);
            map.put("msg","删除成功");
        }catch (Exception e){
            map.put("code",500);
            map.put("msg","删除失败,服务器异常");
            e.printStackTrace();
        }
        return map;
    }
}
