package com.ipmsprj.ipms.prj.service;

import com.ipmsprj.ipms.prj.dto.PrjDto;
import com.ipmsprj.ipms.prj.repository.PrjMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PrjService {

    private final PrjMapper prjMapper;

    public PrjService(PrjMapper prjMapper) {
        this.prjMapper = prjMapper;
    }

    public List<PrjDto> getPrjList() {
        return prjMapper.getPrjList();
    }
}
