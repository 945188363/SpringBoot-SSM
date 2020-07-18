package com.njh.springboot.usermanage.springExtend.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @ClassName: SpringApplicationRunListenerExtension
 * @Author: njh
 * @Description: 在整个启动流程中接收不同执行点事件通知的监听者
 */
public class SpringApplicationRunListenerExtension implements SpringApplicationRunListener {
    private final SpringApplication application;
    private final String[] args;

    public SpringApplicationRunListenerExtension(SpringApplication application, String[] args) {
        this.application = application;
        this.args = args;
    }

    @Override
    public void starting() {
        System.out.println("SpringApplicationRunListenerExtension:Starting");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.out.println("SpringApplicationRunListenerExtension:EnvironmentPrepared");

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("SpringApplicationRunListenerExtension:ContextPrepared");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("SpringApplicationRunListenerExtension:ContextLoaded");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("SpringApplicationRunListenerExtension:Started");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("SpringApplicationRunListenerExtension:Running");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("SpringApplicationRunListenerExtension:Failed");
    }
}
