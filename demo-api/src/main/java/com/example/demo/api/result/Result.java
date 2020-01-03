package com.example.demo.api.result;

import lombok.Data;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * 统一返回处理结果
 */
@Data
public class Result<T> {

    private String msg;
    private String code;
    private T data;

    public Result(T data) {
        this(CodeEnum.STATUS_3000, null, data);
    }

    public Result(CodeEnum code, String msg) {
        this(code, msg, null);
    }

    public Result(CodeEnum code, String msg, T data) {
        this.code = code.getStatusCode();
        this.msg = StringUtils.isBlank(msg) ? code.getStatusDesc() : msg;
        this.data = data;
    }

    public Result() {
    }

    @Getter
    public enum CodeEnum {

        STATUS_3000("3000", "success"),
        STATUS_3001("3001", "remote service error"),
        STATUS_3002("3002", "Illegal parameter"),
        STATUS_3003("3003", "failure"),
        STATUS_3009("3009", "unknown error");

        private String statusCode;
        private String statusDesc;

        CodeEnum(String statusCode, String statusDesc) {
            this.statusCode = statusCode;
            this.statusDesc = statusDesc;
        }

        public static final CodeEnum findEnum(String statusCode) {
            for (CodeEnum sc : CodeEnum.values()) {
                if (sc.getStatusCode().equals(statusCode)) {
                    return sc;
                }
            }
            return STATUS_3009;//默认返回未知异常
        }

    }
}
