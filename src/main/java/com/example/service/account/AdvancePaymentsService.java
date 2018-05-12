package com.example.service.account;

import com.example.mapper.account.AdvancePaymentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 预收款service
 */
@Service
public class AdvancePaymentsService {
    @Autowired
     private AdvancePaymentsMapper advancePaymentsMapper;
}
