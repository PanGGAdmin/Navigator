package com.example.controller.account;

import com.example.service.account.AccountsReceivableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 应收冲款controller
 */
@Controller
public class AccountsReceivableController {
    @Autowired
    private AccountsReceivableService accountsReceivableService;
}
