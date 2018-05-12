package com.example.service.procurement;

import com.example.mapper.procurement.PurchaseOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 采购订单service
 */
@Service
public class PurchaseOrderService {
    @Autowired
    private PurchaseOrderMapper purchaseOrderMapper;
}
