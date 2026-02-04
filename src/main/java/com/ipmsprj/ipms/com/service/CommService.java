package com.ipmsprj.ipms.com.service;

import com.ipmsprj.ipms.com.dto.CommCdDto;
import com.ipmsprj.ipms.com.dto.CommCdReqDto;
import com.ipmsprj.ipms.com.repository.CommMapper;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Collections;

@Service
public class CommService {

    private final CommMapper commMapper;

    public CommService(CommMapper commMapper) {
        this.commMapper = commMapper;
    }

    /**
     * 공통 코드 목록 조회
     * 쉼표로 구분된 그룹 코드 문자열을 파싱하여 리스트로 변환 후 조회합니다.
     * 
     * @param commCdReqDto 조회할 그룹 코드 정보
     * @return 그룹 코드를 키로 하고, 해당 그룹의 코드 목록을 값으로 하는 맵
     */
    public Map<String, List<CommCdDto>> getCommCdList(CommCdReqDto commCdReqDto) {
        if (commCdReqDto.getGrpCds() == null || commCdReqDto.getGrpCds().isEmpty()) {
            return Collections.emptyMap();
        }

        // 쉼표(,)로 구분된 문자열을 리스트로 변환 (공백 제거 포함)
        List<String> grpCdList = Arrays.stream(commCdReqDto.getGrpCds().split(","))
                                       .map(String::trim)
                                       .collect(Collectors.toList());

        List<CommCdDto> list = commMapper.getCommCdList(grpCdList);
        
        // 조회된 리스트를 그룹 코드(grpCd)별로 그룹화하여 맵으로 변환
        return list.stream()
                .collect(Collectors.groupingBy(CommCdDto::getGrpCd));
    }
}
