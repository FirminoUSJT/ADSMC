package br.usjt.SpringbootJPA.weather;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

importbr.usjt.SpringbootJPA.weather.interceptor.LoginInterceptor;



@Configuration
public class SystemConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/login", "/", "/fazerLogin", "/bootstrap/**", "/webjars/**");
	}
}
