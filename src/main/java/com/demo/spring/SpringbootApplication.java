package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.*;
import org.springframework.boot.builder.*;

@SpringBootApplication
public class SpringbootApplication  extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(SpringbootApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
