package com.shakthi.valueandrequired;

import org.springframework.beans.factory.annotation.Value;

public class Student
{


        private String name;
        private String interstedCourse;
        private String hobby;

        @Value("shakthi")
        public void setName(String name) {
            this.name = name;
        }
@Value("java")
        public void setInterstedCourse(String interstedCourse) {
            this.interstedCourse = interstedCourse;
        }

        @Value("coding")
        public void setHobby(String hobby) {
            this.hobby = hobby;
        }

        public void displayStudentInfo()
        {
            System.out.println("Student name"+name);
            System.out.println("Student Intersted Course"+interstedCourse);
            System.out.println("Student hobby"+hobby);
        }
    }

