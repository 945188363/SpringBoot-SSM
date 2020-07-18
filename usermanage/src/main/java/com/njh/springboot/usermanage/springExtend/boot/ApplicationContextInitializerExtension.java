package com.njh.springboot.usermanage.springExtend.boot;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName: ApplicationContextInitializerExtension
 * @Author: njh
 * @Description: 在ConfigurableApplicationContext类型(或者子类型)的ApplicationContext做refresh之前，允许我们对ConfiurableApplicationContext的实例做进一步的设置和处理
 */
public class ApplicationContextInitializerExtension implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("ApplicationContextInitializerExtension:Initialize");
    }
}
