package com.ipmsprj.ipms.com.common;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    INVALID_REQUEST(HttpStatus.BAD_REQUEST, "COMMON_001", "잘못된 요청"),
    INVALID_AMOUNT(HttpStatus.BAD_REQUEST, "ORDER_001", "결제 금액 오류"),
    INVALID_PAYMENT_TYPE(HttpStatus.BAD_REQUEST, "ORDER_002", "결제 타입 오류"),
    PAYMENT_PROCESSOR_NOT_FOUND(HttpStatus.BAD_REQUEST, "PAY_001", "결제 프로세서 없음"),
    INTERNAL_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON_500", "서버 오류");

    private final HttpStatus status;
    private final String code;
    private final String message;

    ErrorCode(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
