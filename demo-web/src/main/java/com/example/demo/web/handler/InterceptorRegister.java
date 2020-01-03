package com.example.demo.web.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 注册器
 */
@Slf4j
@Configuration
public class InterceptorRegister implements WebMvcConfigurer {

    @Autowired
    private IdentityInterceptor identityInterceptor;

    /**
     * 添加拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //todo 后期关闭swagger访问权限
        registry
                .addInterceptor(identityInterceptor)//配置拦截器
                .addPathPatterns("/**").//配置拦截路径
                excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**");//配置不拦截路径
    }

}
