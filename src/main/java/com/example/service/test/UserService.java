package com.example.service.test;

import com.example.mapper.test.UserMapper;
import com.example.pojo.test.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/5/5.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper TestMapper;
    /**
     * 查询所有
     * @return
     */
    public List<Test> select(){
        return TestMapper.select();
    }
}
