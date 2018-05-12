package com.example.controller.sales;

import com.example.service.sales.SalesReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 销售退货controller
 */
@Controller
public class SalesReturnController {
    @Autowired
    public SalesReturnService salesReturnService;
}
