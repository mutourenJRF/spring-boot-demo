2020-01-03 16:40:59.361  INFO 8516 --- [main] com.example.demo.web.DemoWebApplication  : Starting DemoWebApplication on JRA1E1AD8ABEDD with PID 8516 (D:\GitHub\spring-boot-demo2\demo-web\target\classes started by jiruifeng in D:\GitHub\spring-boot-demo2)
2020-01-03 16:40:59.383  INFO 8516 --- [main] com.example.demo.web.DemoWebApplication  : The following profiles are active: @env@
2020-01-03 16:41:00.597  WARN 8516 --- [main] o.m.s.mapper.ClassPathMapperScanner      : No MyBatis mapper was found in '[com.example.demo.web]' package. Please check your configuration.
2020-01-03 16:41:01.264  INFO 8516 --- [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8082 (http)
2020-01-03 16:41:01.274  INFO 8516 --- [main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-01-03 16:41:01.275  INFO 8516 --- [main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.29]
2020-01-03 16:41:01.432  INFO 8516 --- [main] o.a.c.c.C.[.[localhost].[/apis/v1]       : Initializing Spring embedded WebApplicationContext
2020-01-03 16:41:01.432  INFO 8516 --- [main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1977 ms
2020-01-03 16:41:01.759  INFO 8516 --- [main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-01-03 16:41:01.891  WARN 8516 --- [main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource' defined in class path resource [org/springframework/boot/autoconfigure/jdbc/DataSourceConfiguration$Hikari.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'dataSource' threw exception; nested exception is org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$DataSourceBeanCreationException: Failed to determine a suitable driver class
2020-01-03 16:41:01.892  INFO 8516 --- [main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-01-03 16:41:01.895  INFO 8516 --- [main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2020-01-03 16:41:01.906  INFO 8516 --- [main] ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2020-01-03 16:41:01.912 ERROR 8516 --- [main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

Reason: Failed to determine a suitable driver class


Action:

Consider the following:
	If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
	If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).

