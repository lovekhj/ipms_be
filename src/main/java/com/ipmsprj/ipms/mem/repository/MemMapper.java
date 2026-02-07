package com.ipmsprj.ipms.mem.repository;


import com.ipmsprj.ipms.mem.dto.MemDto;
import com.ipmsprj.ipms.mem.dto.MemReqDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemMapper {
    List<MemDto> getMemLists(MemReqDto memReqDto);
}
