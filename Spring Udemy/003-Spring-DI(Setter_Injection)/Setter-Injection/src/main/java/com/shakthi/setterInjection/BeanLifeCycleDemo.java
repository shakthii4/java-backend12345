package com.shakthi.setterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("BeanLifeCycle.xml");
        Coach thecoach = context.getBean("mycoach", Coach.class);
        System.out.println(thecoach.getDailyworkout());

        context.close();


    }
}
