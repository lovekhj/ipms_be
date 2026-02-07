package com.ipmsprj.ipms.mem.controller;

import com.ipmsprj.ipms.com.dto.ApiResponse;
import com.ipmsprj.ipms.mem.dto.MemDto;
import com.ipmsprj.ipms.mem.dto.MemReqDto;
import com.ipmsprj.ipms.mem.service.MemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/mem")
@Slf4j
public class MemController {

    private final MemService memService;

    public MemController(MemService memService) {
        this.memService = memService;
    }

    @GetMapping("/list")
    public ApiResponse<List<MemDto>> getMemList(MemReqDto memReqDto) {
        log.info("input ==> {}", memReqDto);
        return ApiResponse.ok(memService.getMemList(memReqDto));
    }
}
