package com.example.service.account;

import com.example.mapper.account.AccountsReceivableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 应收冲款service
 */
@Service
public class AccountsReceivableService {
    @Autowired
    private AccountsReceivableMapper accountsReceivableMapper;
}
