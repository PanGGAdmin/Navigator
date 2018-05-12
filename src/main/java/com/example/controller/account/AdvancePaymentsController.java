package com.example.controller.account;

import com.example.service.account.AdvancePaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 预收款controller
 */
@Controller
public class AdvancePaymentsController {
    @Autowired
     private AdvancePaymentsService advancePaymentsService;
}
