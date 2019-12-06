package com.study.consumer;

import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.study.api.DemoService;

@EnableAutoConfiguration
@SpringBootApplication
public class DubboConsumerApp {

	 private final Logger logger = LoggerFactory.getLogger(getClass());
	 
	 @Reference
	 DemoService demoService;
	 
	 @Bean
	 ApplicationRunner runner() {
		 return args->{
			logger.info(demoService.sayHello("allger")); 
		 };
	 }
	
	
	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerApp.class, args);
	}
}
