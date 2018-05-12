package com.example.controller.sales;

import com.example.service.sales.SalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 销售订单controller
 */
@Controller
public class SalesOrderController {
    @Autowired
    public SalesOrderService salesOrderService;
}
