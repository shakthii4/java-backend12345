package com.shakthi.dependancy;

public class Student
{
    private int id;



    private String studentName; //now here we considered studentName as a Dependency
                                // we are injecting the dependency using setter method
  /*  public void setId(int id)
    {
        this.id = id;              //setter
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }*/

    public Student(int id, String studentName)
    {
        this.id = id;
        this.studentName = studentName;
    }

    public void displayStudentInfo()
    {
        System.out.println("student name is "+studentName);
    }
}
