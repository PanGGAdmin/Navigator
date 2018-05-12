package com.example.controller.procurement;

import com.example.service.procurement.ProcurementApportionmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 采购分摊controller
 */
@Controller
public class ProcurementApportionmentController {
    @Autowired
    private ProcurementApportionmentService procurementApportionmentService;
}
