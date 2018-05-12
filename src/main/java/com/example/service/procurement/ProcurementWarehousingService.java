package com.example.service.procurement;

import com.example.mapper.procurement.ProcurementWarehousingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 采购入库service
 */
@Service
public class ProcurementWarehousingService {
    @Autowired
    private ProcurementWarehousingMapper procurementWarehousingMapper;
}
