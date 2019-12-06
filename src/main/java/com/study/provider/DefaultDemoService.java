package com.study.provider;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

import com.study.api.DemoService;

@Service
public class DefaultDemoService implements DemoService{

	/**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;
	@Override
	public String sayHello(String name) {
		return String.format("[%s] : Hello, %s", serviceName, name);
	}

}
