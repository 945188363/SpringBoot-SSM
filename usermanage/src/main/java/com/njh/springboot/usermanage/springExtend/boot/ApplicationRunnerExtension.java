package com.njh.springboot.usermanage.springExtend.boot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName: ApplicationRunnerExtension
 * @Author: njh
 * @Description: 如果定义了多个ApplicationRunner或ApplicationRunner bean，必须以特定的顺序调用它们使用@Order(优先级)
 *              需要结合@Component注解使用，或者在SpringApplication类中实现这个接口 或者在SpringApplication类使用一个@Bean导出实现接口的类
 */
@Component
@Order(1)
public class ApplicationRunnerExtension implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunnerExtension:start");
    }
}
