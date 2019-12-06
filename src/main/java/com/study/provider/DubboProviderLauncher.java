package com.study.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboProviderLauncher {

	void init() {
		//DubboAutoConfiguration
		//DubboRelaxedBinding2AutoConfiguration
		//DubboConfigurationProperties
		//AnnotationInjectedBeanPostProcessor
		//@Autowired
		//ThreadPoolExecutor
		//AutowiredAnnotationBeanPostProcessor
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DubboProviderLauncher.class, args);
	}
}
