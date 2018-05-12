package com.example.service.procurement;

import com.example.mapper.procurement.ProcurementApportionmentMapper;
import com.example.mapper.procurement.PurchaseInquiryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 采购询价service
 */
@Service
public class PurchaseInquiryService {
    @Autowired
    private PurchaseInquiryMapper purchaseInquiryMapper;
}
