package com.atguigu.springboot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
        //war包方式调用springboot 的SpringBoot04WebJspApplication方法进行调用
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBoot04WebJspApplication.class);
	}

}
