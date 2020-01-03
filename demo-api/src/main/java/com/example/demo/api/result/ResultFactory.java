package com.example.demo.api.result;

/**
 * 返回工厂，统一处理
 */
public class ResultFactory {

    public static <T> Result<T> success(T data) {
        return new Result<>(data);
    }

    public static <T> Result<T> failure(Result.CodeEnum code, String msg) {
        return new Result<>(code, msg);
    }

    public static <T> Result<T> failure(String msg) {
        return new Result<>(Result.CodeEnum.STATUS_3003, msg);
    }

    public static <T> Result<T> error(Exception e) {
        return new Result<>(Result.CodeEnum.STATUS_3009, e.getMessage());
    }

}
