package com.njh.springboot.usermanage.springExtend.single;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @ClassName: BeanPostProcessorExtension
 * @Author: njh
 * @Description: 对bean初始化前后做扩展的接口
 */
@Component
public class BeanPostProcessorExtension implements BeanPostProcessor {
    /*
    *
     * @Author:njh
     * @Description //在
     * @Date 17:42 2020/7/18
     * @Param
     * @return
     **/
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("UserService")){
            System.out.println("BeanPostProcessorExtension:PostProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("UserService")){
            System.out.println("BeanPostProcessorExtension:PostProcessAfterInitialization");
        }
        return bean;
    }
}
