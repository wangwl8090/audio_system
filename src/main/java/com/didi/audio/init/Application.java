package com.didi.audio.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication  
@Configuration    
@ComponentScan(basePackages="com.didi.audio")   //默认扫描是当前包下的路径  
@EnableAutoConfiguration    
public class Application extends SpringBootServletInitializer {  
  
    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
        return application.sources(Application.class);  
    }  
  
    public static void main(String[] args) throws Exception {  
        SpringApplication.run(Application.class, args);  
    }  
}  
