package com.example.controller.procurement;

import com.example.pojo.procurement.Requisitions;
import com.example.pojo.procurement.Requisitions_detail;
import com.example.service.procurement.PurchaseRequisitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 采购请购controller
 */
@Controller
public class PurchaseRequisitionController {
    @Autowired
    private PurchaseRequisitionService purchaseRequisitionService;

    /**
     * 分页查询采购请购单据
     * @param pageIndex
     * @return
     */
    @RequestMapping("/hjl_pageSelect")
    @ResponseBody
    public List<Requisitions> hjl_pageSelect(Integer pageIndex){
        List<Requisitions> list = this.purchaseRequisitionService.hjl_pageSelect(pageIndex);
        return list;
    }

    /**
     * 分页查询采购请购单据总条数
     * @return
     */
    @RequestMapping("/hjl_count")
    @ResponseBody
    public  int hjl_count(){return this.purchaseRequisitionService.hjl_count();}

    /**
     * 获取当前时间
     * @return
     */
    @RequestMapping("/newDate")
    @ResponseBody
    public Object newDate(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String dateStr=sdf.format(date);
        return dateStr;
    }

    /**
     * 查询当天最大的单据号码
     * @param billDate
     * @return
     */
    @RequestMapping("/hjl_maxBillno")
    @ResponseBody
    public String hjl_maxBillno(String billDate){
        return this.purchaseRequisitionService.hjl_maxBillno(billDate);
    }

    /**
     * 查询采购请购单明细表信息
     * @param billno
     * @return
     */
    @RequestMapping("/hjl_detail")
    @ResponseBody
    public Map<String, Object> hjl_detail(String billno,Integer curr){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", "0");
        map.put("msg", "");
        map.put("data",this.purchaseRequisitionService.hjl_detail(billno));
        return map;
    }
}
