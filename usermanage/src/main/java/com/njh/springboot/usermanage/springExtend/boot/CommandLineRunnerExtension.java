package com.njh.springboot.usermanage.springExtend.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName: CommandLineRunnerExtension
 * @Author: njh
 * @Description: 如果定义了多个CommandLineRunner或ApplicationRunner bean，必须以特定的顺序调用它们使用@Order(优先级)
 *               需要结合@Component注解使用，或者在SpringApplication类中实现这个接口 或者在SpringApplication类使用一个@Bean导出实现接口的类
 */
@Component
@Order(2)
public class CommandLineRunnerExtension implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunnerExtension:start");
    }
}
