package com.example.controller.procurement;

import com.example.service.procurement.PurchaseInquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 采购询价controller
 */
@Controller
public class PurchaseInquiryController {
    @Autowired
    private PurchaseInquiryService purchaseInquiryService;
}
