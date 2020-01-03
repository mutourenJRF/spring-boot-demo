package com.example.demo.web.aspect;

import com.alibaba.fastjson.JSON;
import com.example.demo.web.request.HeaderMessage;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 日志记录切面
 */
@Slf4j
@Aspect
@Configuration
@Component
public class LogAspect {

    @Pointcut("execution(public * com.example.demo.web.controller..*.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before(JoinPoint point) {

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        String token = request.getHeader(HeaderMessage.Authorization);
        String method = request.getMethod();
        String url = request.getRequestURI();
        String remoteAddress = request.getRemoteAddr();
        log.info("request message---------->[token:{},method:{},url:{},ip:{}]", token, method, url, remoteAddress);

    }

    @AfterReturning(pointcut = "pointCut()", returning = "result")
    public void after(JoinPoint joinPoint, Object result) {
        log.info("response message---------->[{}]", JSON.toJSONString(result));
    }


}
