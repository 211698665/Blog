package cn.henu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置静态资源的访问路径
 * @author syw
 *
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

   @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
    public void addInterceptors(InterceptorRegistry registry){
        LoginHandlerInterceptor loginInceptor= new LoginHandlerInterceptor();//自定义的拦截器
        registry.addInterceptor(loginInceptor).addPathPatterns("/**")
                .excludePathPatterns(loginInceptor.getUrl());
        WebMvcConfigurer.super.addInterceptors(registry);
        //"/login","/","/admin/login","/static/**","/webjars/**","/admin/css/**","/admin/js/**"
    }
}
