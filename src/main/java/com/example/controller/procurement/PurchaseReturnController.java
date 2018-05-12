package com.example.controller.procurement;

import com.example.mapper.procurement.PurchaseReturnMapper;
import com.example.service.procurement.PurchaseReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * 采购退货controller
 */
@Controller
public class PurchaseReturnController {
    @Autowired
    private PurchaseReturnService purchaseReturnService;
}
