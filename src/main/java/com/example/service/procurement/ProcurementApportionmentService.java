package com.example.service.procurement;

import com.example.mapper.procurement.ProcurementApportionmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 采购分摊service
 */
@Service
public class ProcurementApportionmentService {
    @Autowired
    private ProcurementApportionmentMapper procurementApportionmentMapper;
}
