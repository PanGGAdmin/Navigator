package com.example.service.inventory;

import com.example.mapper.inventory.InventoryMapper;
import com.example.pojo.account.yxppojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

/**
 * 盘点单service
 */
@Service
public class InventoryService {
    @Autowired
    private InventoryMapper inventoryMapper;

    /*
        查询盘点单中的一条数据+分页
     */
    public yxpPageBean selectcl(Integer currpage){
        Integer count = this.inventoryMapper.selectckcount();
        checklist cl = this.inventoryMapper.selectcl(currpage-1);
        cl.setCdetailed(this.inventoryMapper.selectcd(cl.getClId()));
        return new yxpPageBean(currpage,1,cl,count);
    }


    /*
        查询盘点单中的一条数据+分页
     */
//    public yxpPageBean changedate(String date) {
//
//    }
    @Transactional
    public String addcl(checklist cl){
        this.inventoryMapper.addck(cl);
        for (checkdetailed item: cl.getCdetailed()) {
            this.inventoryMapper.addcd(item,cl.getClId());
        }
        return null;
    }

}
