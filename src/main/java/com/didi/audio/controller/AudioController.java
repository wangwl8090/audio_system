package com.didi.audio.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import testMain.TestController;

@RestController
@SpringBootApplication //Spring Boot核心注解，用于开启自动配置
public class AudioController {
	@RequestMapping("/TEST")
    String index(){
      return "Hello Spring Boot";
    }
}
