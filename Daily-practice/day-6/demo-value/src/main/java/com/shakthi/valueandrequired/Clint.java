package com.shakthi.valueandrequired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Clint {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("beans is loaded");
        Student student=context.getBean("student",Student.class);
        student.displayStudentInfo();
    }
}