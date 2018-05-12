package com.example.controller.procurement;

import com.example.service.procurement.ProcurementWarehousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 采购入库controller
 */
@Controller
public class ProcurementWarehousingController {
    @Autowired
    private ProcurementWarehousingService procurementWarehousingService;
}
