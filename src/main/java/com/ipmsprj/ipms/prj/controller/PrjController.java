package com.ipmsprj.ipms.prj.controller;

import com.ipmsprj.ipms.com.dto.ApiResponse;
import com.ipmsprj.ipms.prj.dto.PrjDto;
import com.ipmsprj.ipms.prj.dto.PrjReqDto;
import com.ipmsprj.ipms.prj.service.PrjService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/prj")
@Slf4j
public class PrjController {

    private final PrjService prjService;

    public PrjController(PrjService prjService) {
        this.prjService = prjService;
    }

    @GetMapping("/list")
    public ApiResponse<List<PrjDto>> getPrjList(PrjReqDto prjReqDto) {
        log.info("input ==>{}", prjReqDto);
        return ApiResponse.ok(prjService.getPrjList(prjReqDto));
    }
}
