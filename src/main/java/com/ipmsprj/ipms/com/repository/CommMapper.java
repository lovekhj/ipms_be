package com.ipmsprj.ipms.com.repository;

import com.ipmsprj.ipms.com.dto.CommCdDto;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface CommMapper {
    List<CommCdDto> getCommCdList(List<String> grpCdList);
}
