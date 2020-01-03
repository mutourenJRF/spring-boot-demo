package com.example.demo.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jiruifeng
 * @version 1.0
 * @date 2019/12/4 11:55
 */
@Slf4j
@RestController//controller+responsebody
@Api(tags = "TestController", description = "controller测试")//注释
@RequestMapping("/test")//路径
public class TestController {

    @ApiOperation("测试")//api注释
    @ApiImplicitParams({@ApiImplicitParam(name="name",value="名字",required = true,dataType = "string",paramType = "query")
    })//入参
    @PostMapping("/name")//访问路径、方式
    public String grant(String name) throws Exception{
        log.info("name:{}",name);
        return name;
    }





}
