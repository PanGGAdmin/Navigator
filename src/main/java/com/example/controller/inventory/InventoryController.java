package com.example.controller.inventory;

import com.example.pojo.account.yxppojo.*;
import com.example.service.inventory.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.reflect.generics.repository.MethodRepository;

/**
 * 盘点单controller
 */
@Controller
@RequestMapping("Inventory/")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    /*
     查询盘点单中的一条数据+分页
     */
    @RequestMapping(value = "selectcl",method = RequestMethod.GET)
    @ResponseBody
    public yxpPageBean selectcl(int currpage){
        return this.inventoryService.selectcl(currpage);
    }

}
