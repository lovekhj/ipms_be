package com.ipmsprj.ipms.mem.service;

import com.ipmsprj.ipms.mem.repository.MemMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MemService {

    private final MemMapper memMapper;

    public MemService(MemMapper memMapper) {
        this.memMapper = memMapper;
    }



}
