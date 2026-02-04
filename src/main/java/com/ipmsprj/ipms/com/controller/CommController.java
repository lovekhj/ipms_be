package com.ipmsprj.ipms.com.controller;

import com.ipmsprj.ipms.com.dto.ApiResponse;
import com.ipmsprj.ipms.com.dto.CommCdDto;
import com.ipmsprj.ipms.com.dto.CommCdReqDto;
import com.ipmsprj.ipms.com.service.CommService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/com")
@Slf4j
public class CommController {

    private final CommService commService;

    public CommController(CommService commService) {
        this.commService = commService;
    }

    /**
     * 공통 코드 목록 조회 API
     * 쉼표로 구분된 그룹 코드 문자열을 받아 그룹별 코드 목록을 반환합니다.
     * 예: /api/com/codes?grpCds=PRJ_GBN,MBR_TYPE
     * 
     * @param commCdReqDto 조회할 그룹 코드 정보 (쉼표로 구분된 문자열)
     * @return 그룹 코드를 키로 하는 코드 목록 맵
     */
    @GetMapping("/codes")
    public ApiResponse<Map<String, List<CommCdDto>>> getCommCdList(CommCdReqDto commCdReqDto) {
        log.info("input => {}", commCdReqDto);
        return ApiResponse.ok(commService.getCommCdList(commCdReqDto));
    }
}
