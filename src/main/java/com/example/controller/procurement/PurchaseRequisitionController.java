package com.example.controller.procurement;

import com.example.service.procurement.PurchaseRequisitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 采购请购controller
 */
@Controller
public class PurchaseRequisitionController {
    @Autowired
    private PurchaseRequisitionService purchaseRequisitionService;
}
