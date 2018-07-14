package com.example.demo;

import javax.servlet.Filter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.config.CorsConfig;
import com.example.demo.config.JwtFilter;


@SpringBootApplication
public class DemoApplication {

	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter((Filter) new JwtFilter());
		registrationBean.addUrlPatterns("/rest/*");

		return registrationBean;
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
