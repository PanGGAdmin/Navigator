package com.example.controller.inventory;

import com.example.service.inventory.TransfersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 调拨单controller
 */
@Controller
public class TransfersController {
    @Autowired
    private TransfersService transfersService;
}
