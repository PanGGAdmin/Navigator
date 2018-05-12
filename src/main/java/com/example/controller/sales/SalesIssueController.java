package com.example.controller.sales;

import com.example.service.sales.SalesIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 销售出库controller
 */
@Controller
public class SalesIssueController {
    @Autowired
    public SalesIssueService salesIssueService;
}
