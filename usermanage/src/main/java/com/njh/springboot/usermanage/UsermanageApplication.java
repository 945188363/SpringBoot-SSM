package com.njh.springboot.usermanage;

import com.njh.springboot.usermanage.springExtend.boot.ApplicationListenerExtension;
import com.njh.springboot.usermanage.springExtend.boot.BeanFactoryPostProcessorExtension;
import com.njh.springboot.usermanage.springExtend.boot.ProtocolResolverExtension;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsermanageApplication {

    public static void main(String[] args) {

        SpringApplication.run(UsermanageApplication.class, args)
                .addProtocolResolver(new ProtocolResolverExtension());
        SpringApplication.run(UsermanageApplication.class, args)
                .addBeanFactoryPostProcessor(new BeanFactoryPostProcessorExtension());
        SpringApplication.run(UsermanageApplication.class, args)
                .addApplicationListener(new ApplicationListenerExtension());
    }

}
