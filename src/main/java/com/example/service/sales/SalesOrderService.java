package com.example.service.sales;

import com.example.mapper.sales.SalesOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 销售订单service
 */
@Service
public class SalesOrderService {
    @Autowired
    public SalesOrderMapper salesOrderMapper;
}
