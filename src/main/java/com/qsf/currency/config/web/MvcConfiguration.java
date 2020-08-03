package com.qsf.currency.config.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 开启Mvc,自动注入spring容器。 WebMvcConfigurerAdapter：配置视图解析器
 * 当一个类实现了这个接口（ApplicationContextAware）之后，这个类就可以方便获得ApplicationContext中的所有bean
 * @Author QSF
 * @Date 2020/8/3 11:30
 * @Version 1.0
 */

@Configuration
public class MvcConfiguration implements WebMvcConfigurer {
    private static String winUploadPath;
    private static String linuxUploadPath;

    @Value("${win.base.upload.path}")
    public void setWinUploadPath(String winUploadPath) {
        MvcConfiguration.winUploadPath = winUploadPath;
    }

    @Value("${linux.base.upload.path}")
    public void setLinuxUploadPath(String linuxUploadPath) {
        MvcConfiguration.linuxUploadPath = linuxUploadPath;
    }


    /**
     * 静态资源配置
     *
     * @param registry
     */

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        String os = System.getProperty("os.name");
        if (os.toLowerCase().startsWith("win")) {
//            registry.addResourceHandler("/upload/**").addResourceLocations("file:F:/ep/image/upload/");
            registry.addResourceHandler("/upload/**").addResourceLocations("file:/"+winUploadPath);
        }else {
//            registry.addResourceHandler("/upload/**").addResourceLocations("file:/Users/ep/image/upload/");
            registry.addResourceHandler("/upload/**").addResourceLocations("file:"+linuxUploadPath);
        }
    }

}

