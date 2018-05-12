package com.example.service.procurement;

import com.example.mapper.procurement.PurchaseRequisitionMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 采购请购service
 */
@Service
public class PurchaseRequisitionService {
    @Autowired
    private PurchaseRequisitionMapper purchaseRequisitionMapper;
}
