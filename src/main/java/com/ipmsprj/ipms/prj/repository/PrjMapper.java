package com.ipmsprj.ipms.prj.repository;

import com.ipmsprj.ipms.prj.dto.PrjDto;
import com.ipmsprj.ipms.prj.dto.PrjReqDto;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface PrjMapper {
    List<PrjDto> getPrjList(PrjReqDto prjReqDto);
}
