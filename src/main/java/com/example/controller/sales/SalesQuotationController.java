package com.example.controller.sales;

import com.example.pojo.gongyong.TPotentialClientMasterFileAddress;
import com.example.pojo.procurement.Client_masterfile;
import com.example.pojo.procurement.Client_masterfile_address;
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
    public SSellQuote querySellQuote(int pageSize){
//        SSellQuote s = salesQuotationService.querySellQuote(0);
//        System.out.print(s.getQuId());
//        System.out.print(s.getQuCname());
        //System.out.print(s.getsSellQuoteparticulars().get(0).getQpId());
        System.out.print(pageSize);
        return salesQuotationService.querySellQuote(pageSize);
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
