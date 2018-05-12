package com.example.controller.procurement;

import com.example.service.procurement.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 采购订单controller
 */
@Controller
public class PurchaseOrderController {
    @Autowired
    private PurchaseOrderService purchaseOrderService;
}
