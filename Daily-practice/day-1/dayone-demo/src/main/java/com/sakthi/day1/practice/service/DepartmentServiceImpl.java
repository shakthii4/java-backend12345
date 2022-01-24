package com.sakthi.day1.practice.service;

import com.sakthi.day1.practice.repository.DepartmentRepository;
import com.sakthi.day1.practice.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public class DepartmentServiceImpl  implements DepartmentService
{
    @Autowired
    private DepartmentRepository repository;

    @Override
    public Department saveDepartment(Department department) {
        return repository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return repository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long dId) {
        return repository.findById(dId).get();
    }




}
