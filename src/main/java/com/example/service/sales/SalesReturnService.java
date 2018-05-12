package com.example.service.sales;

import com.example.mapper.sales.SalesReturnMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 销售退货service
 */
@Service
public class SalesReturnService {
    @Autowired
    public SalesReturnMapper salesReturnMapper;
}
