package com.example.service.inventory;

import com.example.mapper.inventory.TransfersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 调拨单service
 */
@Service
public class TransfersService {
    @Autowired
    private TransfersMapper transfersMapper;
}
