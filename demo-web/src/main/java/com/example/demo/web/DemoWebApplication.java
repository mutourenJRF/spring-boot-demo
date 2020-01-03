package com.example.demo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Profile;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@Slf4j//日志
@EnableSwagger2//开启swagger
@Profile({"dev","dev"})//仅测试环境开启swagger
//@EnableTransactionManagement//启动事务管理
public class DemoWebApplication {

    public static void main(String[] args) throws Exception{
        ConfigurableApplicationContext run =SpringApplication.run(DemoWebApplication.class, args);
        serverUrl(run);
    }

    private static void serverUrl(ConfigurableApplicationContext context) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        String serverPort = context.getEnvironment().getProperty("server.port");
        String serverPath = context.getEnvironment().getProperty("server.servlet.context-path");
        log.info("started at http://{}:{}{}   and this routine is {} ", localHost.getHostAddress(), serverPort, serverPath, ManagementFactory.getRuntimeMXBean().getName());
        log.info("API message  http://{}:{}{}/swagger-ui.html", localHost.getHostAddress(), serverPort, serverPath);
    }
}
