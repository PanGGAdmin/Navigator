package com.example.service.sales;

import com.example.mapper.sales.SalesIssueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 销售出库service
 */
@Service
public class SalesIssueService {
    @Autowired
    public SalesIssueMapper salesIssueMapper;
}
