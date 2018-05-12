package com.example.service.procurement;

import com.example.mapper.procurement.PurchaseReturnMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 采购退货service
 */
@Service
public class PurchaseReturnService {
    @Autowired
    private PurchaseReturnMapper purchaseReturnMapper;
}
