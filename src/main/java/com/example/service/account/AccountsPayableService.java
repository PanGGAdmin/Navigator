package com.example.service.account;

import com.example.mapper.account.AccountsPayableMapper;
import com.example.pojo.account.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 应付冲款service
 */
@Service
public class AccountsPayableService {
    @Autowired
    private AccountsPayableMapper accountsPayableMapper;

    public List<Test> selTest(){
        return accountsPayableMapper.selTest();
    }
}
