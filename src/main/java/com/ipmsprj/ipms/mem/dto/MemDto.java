package com.ipmsprj.ipms.mem.dto;


import lombok.*;

/**
 * 멤버 목록 조회 응답 DTO
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemDto {

    private String memId;         // 멤버ID
    private String memNm;         // 멤버명
    private String mbrType;       // 멤버구분 코드 (01, 02 등)
    private String mbrTypeNm;     // 멤버구분 명칭 (직원, 프리 등)
    private String birth;         // 생년월일
    private String birthGbn;      // 주민번호구분 (1:남, 2:여)
    private String cellPhoneNum;  // 휴대폰번호
    private String gnrlPhoneNum;  // 일반전화번호
    private String techGrade;     // 기술등급 코드

}