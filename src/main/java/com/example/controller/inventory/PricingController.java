package com.example.controller.inventory;

import com.example.service.inventory.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 调价单controller
 */
@Controller
public class PricingController {
    @Autowired
    private PricingService pricingService;

}



