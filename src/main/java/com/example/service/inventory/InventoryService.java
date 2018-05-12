package com.example.service.inventory;

import com.example.mapper.inventory.InventoryMapper;
import com.example.pojo.account.yxppojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        checklist cl = this.inventoryMapper.selectck(currpage-1);
        return new yxpPageBean(currpage,1,cl,count);
    }

}
