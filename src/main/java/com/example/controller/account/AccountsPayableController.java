package com.example.controller.account;

import com.example.pojo.account.Test;
import com.example.service.account.AccountsPayableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 应付冲款controller
 */
@RestController
public class AccountsPayableController {
    @Autowired
    private AccountsPayableService accountsPayableService;
    @RequestMapping("/selTest")
    public Object selTest(){
        Map<String,Object> map=new HashMap<String,Object>();
        List<Test> users=accountsPayableService.selTest();
        map.put("users",users);
        map.put("success",true);
        return map;
    }
}
