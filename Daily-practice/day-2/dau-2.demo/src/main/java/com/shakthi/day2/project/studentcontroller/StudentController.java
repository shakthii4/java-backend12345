package com.shakthi.day2.project.studentcontroller;

import com.shakthi.day2.project.service.StudentService;
import com.shakthi.day2.project.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController
{
    @Autowired
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getStudent()
    {
       return ser
    }

}
