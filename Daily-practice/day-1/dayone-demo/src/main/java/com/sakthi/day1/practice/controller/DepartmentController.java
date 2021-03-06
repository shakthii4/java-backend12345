package com.sakthi.day1.practice.controller;

import com.sakthi.day1.practice.service.DepartmentService;
import com.sakthi.day1.practice.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController
{
    @Autowired
    private DepartmentService service;
    @PostMapping("/dept")
    public Department saveDepartment(@RequestBody Department department)
    {
        return service.saveDepartment(department);
    }

    @GetMapping("/depts")
    public List<Department> fetchDepartmentList()
    {
        return service.fetchDepartmentList();
    }
    @GetMapping("/depts/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long dId)
    {
        return service.fetchDepartmentById(dId);

    }
    @DeleteMapping("depts/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long dId)
    {
        service.deleteDepartmentById(dId);
        return "Deleted successfull";
    }

    @PutMapping("deptpp/{id}")
    public Department updateDepartment(@PathVariable("id") Long dId,@RequestBody Department department)
    {
        return service.updateDepartment(dId,department);
    }

    @GetMapping("/dept/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String dName)
    {
        return service.fetchDepartmentByName(dName);

    }
}
