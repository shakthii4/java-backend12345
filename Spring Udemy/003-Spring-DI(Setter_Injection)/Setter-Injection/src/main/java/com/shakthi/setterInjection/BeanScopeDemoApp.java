package com.shakthi.setterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("BeanScope.xml");
        Coach thecoach = context.getBean("mycoach", Coach.class);
        Coach alphacoach = context.getBean("mycoach", Coach.class);
        boolean result=(thecoach==alphacoach);
        System.out.println("pointing to same object           "+result);
        System.out.println("memory location for thecoach      "+thecoach);
        System.out.println("memory location for alphacoach    "+alphacoach);
        context.close();

    }
}
