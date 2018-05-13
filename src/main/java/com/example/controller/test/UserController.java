package com.example.controller.test;

import com.example.pojo.test.Test;
import com.example.service.test.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/5.
 */
@RestController
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/sel")
    public Object select(){
        Map<String,Object> map=new HashMap<String,Object>();
        List<Test> users=service.select();
        map.put("users",users);
        map.put("success",true);
        return map;
    }
}
