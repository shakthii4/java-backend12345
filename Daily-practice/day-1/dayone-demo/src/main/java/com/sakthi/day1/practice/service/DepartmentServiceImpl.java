package com.sakthi.day1.practice.service;

import com.sakthi.day1.practice.repository.DepartmentRepository;
import com.sakthi.day1.practice.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;
import java.util.Objects;

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

    @Override
    public void deleteDepartmentById(Long dId) {
        repository.deleteById(dId);
    }

    @Override
    public Department updateDepartment(Long dId, Department department) {
        Department dp=repository.findById(dId).get();
        if(Objects.nonNull(department.getdName()) && !"".equalsIgnoreCase(department.getdName()))
        {
            dp.setdName(department.getdName());
        }
        if(Objects.nonNull(department.getdCode()) && !"".equalsIgnoreCase(department.getdCode()))
        {
            dp.setdCode(department.getdCode());
        }
        if(Objects.nonNull(department.getdAddress()) && !"".equalsIgnoreCase(department.getdAddress()))
        {
            dp.setdAddress(department.getdAddress());
        }
        return repository.save(dp);

    }

    @Override
    public Department fetchDepartmentByName(String dName)
    {
        return repository.findBydName(dName);
    }


}
