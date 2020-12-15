package com.zut.manager.common.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class myconfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandleInterator()).addPathPatterns("/manager/**").excludePathPatterns("/login","/util/noPermission","/util/unLogin","/swagger-ui.html");
    }




}
