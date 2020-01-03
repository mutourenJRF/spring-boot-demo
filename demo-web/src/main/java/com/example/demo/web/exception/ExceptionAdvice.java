package com.example.demo.web.exception;

import com.example.demo.api.result.Result;
import com.example.demo.api.result.ResultFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 */
@Slf4j
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public
    @ResponseBody
    Result<String> exceptionHandler(Exception e) {
        String message = e.getMessage();
        log.error("#[{},{}]", Result.CodeEnum.STATUS_3009.getStatusCode(), message);
        return ResultFactory.error(e);
    }



}
