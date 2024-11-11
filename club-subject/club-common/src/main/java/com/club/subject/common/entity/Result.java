package com.club.subject.common.entity;

import com.club.subject.common.enums.ResultCodeEnum;
import lombok.Data;

@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T data;
    private Boolean success;

    public static Result success() {
        Result tResult = new Result<>();
        tResult.setSuccess(true);
        tResult.setCode(ResultCodeEnum.SUCCESS.getCode());
        tResult.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return tResult;
    }


    public static <T> Result<T> success(T data) {
        Result<T> tResult = new Result<>();
        tResult.setSuccess(true);
        tResult.setCode(ResultCodeEnum.SUCCESS.getCode());
        tResult.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        tResult.setData(data);
        return tResult;
    }


    public static Result fail() {
        Result tResult = new Result<>();
        tResult.setSuccess(false);
        tResult.setCode(ResultCodeEnum.FAIL.getCode());
        tResult.setMessage(ResultCodeEnum.FAIL.getMessage());
        return tResult;
    }


    public static <T> Result<T> fail(T data) {
        Result<T> tResult = new Result<>();
        tResult.setSuccess(false);
        tResult.setCode(ResultCodeEnum.FAIL.getCode());
        tResult.setMessage(ResultCodeEnum.FAIL.getMessage());
        tResult.setData(data);
        return tResult;
    }
}
