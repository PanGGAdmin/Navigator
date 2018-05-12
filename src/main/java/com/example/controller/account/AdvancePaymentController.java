package com.example.controller.account;

import com.example.service.account.AdvancePaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 预付款controller
 */
@Controller
public class AdvancePaymentController {
    @Autowired
    private AdvancePaymentService advancePaymentService;
}
