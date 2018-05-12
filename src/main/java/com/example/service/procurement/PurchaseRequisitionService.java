package com.example.service.procurement;

import com.example.mapper.procurement.PurchaseRequisitionMapper;
import com.example.pojo.procurement.Requisitions;
import com.example.pojo.procurement.Requisitions_detail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 采购请购service
 */
@Service
public class PurchaseRequisitionService {
    @Autowired
    private PurchaseRequisitionMapper purchaseRequisitionMapper;

    /**
     * 分页查询采购请购单据
     * @param pageIndex
     * @return
     */
    public List<Requisitions> hjl_pageSelect(Integer pageIndex){
        pageIndex=pageIndex-1;
        List<Requisitions> list= this.purchaseRequisitionMapper.hjl_pageSelect(pageIndex);
        return list;
    }

    /**
     * 分页查询采购请购单据总条数
     * @return
     */
    public  int hjl_count(){
        return this.purchaseRequisitionMapper.hjl_count();
    }

    /**
     * 查询当天最大的单据号码
     * @param billDate
     * @return
     */
    public String hjl_maxBillno(String billDate){
        //将格式yyyy-MM-dd转换成yyyyMMdd
        String billDaten =billDate.toString().replaceAll("-","");
        String billNo= this.purchaseRequisitionMapper.hjl_maxBillno(billDate);
        if(billNo==null){
            return billDaten+"01";
        }
        return (Integer.parseInt(billNo)+1)+"";
    }

    /**
     * 查询采购请购单明细表信息
     * @param billno
     * @return
     */
    public List<Requisitions_detail> hjl_detail(String billno){
       return this.purchaseRequisitionMapper.hjl_detail(billno);
    }





}
