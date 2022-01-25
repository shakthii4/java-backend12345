package com.sakthi.day1.practice.service;

import com.sakthi.day1.practice.entity.Department;

import java.util.List;

public interface DepartmentService
{
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long dId);

    void deleteDepartmentById(Long dId);

    Department updateDepartment(Long dId, Department department);

    Department fetchDepartmentByName(String dName);
}
