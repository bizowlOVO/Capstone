package kr.ac.sunmoon.mrs.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	@Autowired
	MrsInterceptor mrsInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(mrsInterceptor)
		.addPathPatterns("/**")
		.excludePathPatterns("/common/login");
		
		WebMvcConfigurer.super.addInterceptors(registry);
	}
	
	
}
