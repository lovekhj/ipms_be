package com.ipmsprj.ipms.mem.service;

import com.ipmsprj.ipms.mem.dto.MemDto;
import com.ipmsprj.ipms.mem.dto.MemReqDto;
import com.ipmsprj.ipms.mem.repository.MemMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MemService {

    private final MemMapper memMapper;

    public MemService(MemMapper memMapper) {
        this.memMapper = memMapper;
    }

    public List<MemDto> getMemList(MemReqDto memReqDto){
        return memMapper.getMemLists(memReqDto);
    }

}
