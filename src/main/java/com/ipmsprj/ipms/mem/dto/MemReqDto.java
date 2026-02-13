package com.ipmsprj.ipms.mem.dto;


import lombok.*;

/**
 * 멤버 목록 조회 응답 DTO
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemReqDto {

    private String memNm;         // 멤버명
    private String mbrType;       // 멤버구분 코드 (01, 02 등)
    private String cellPhoneNum;  // 휴대폰번호

}