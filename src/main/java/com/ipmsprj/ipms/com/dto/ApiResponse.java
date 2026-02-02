package com.ipmsprj.ipms.com.dto;

import com.ipmsprj.ipms.com.common.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@AllArgsConstructor
@Slf4j
public class ApiResponse<T> {
    private boolean success;
    private T data;
    private ApiError error;

    public static <T> ApiResponse<T> ok(T data){
        return new ApiResponse<>(true, data, null);
    }

    public static ApiResponse<?> error(ErrorCode code){
        log.error("[ERROR] {}", code.getMessage());
        log.error("[ERROR] {}", code);
        return new ApiResponse<>(false, null,
                new ApiError(code.getCode(), code.getMessage()));
    }

}
