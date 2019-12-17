package com.shuwen.media.adapter.servie.virgo.executer.impl;

/**
 * @description: 描述一下
 * @className:Animal
 * @author:njh
 * @time:下午4:04
 */
public abstract class Animal {

    public void template(){
        start();
        dosomething();
        end();
    }

    public void start(){
        System.out.println("start");
    }

    public void end(){
        System.out.println("end");
    }

    public abstract void dosomething();
}
