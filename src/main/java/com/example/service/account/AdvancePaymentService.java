package com.example.service.account;

import com.example.mapper.account.AdvancePaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 预付款service
 */
@Service
public class AdvancePaymentService {
    @Autowired
    private AdvancePaymentMapper advancePaymentMapper;
}
