package com.ipmsprj.ipms.mem.controller;

import com.ipmsprj.ipms.mem.service.MemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mem")
@Slf4j
public class MemController {

    private final MemService memService;

    public MemController(MemService memService) {
        this.memService = memService;
    }

}
