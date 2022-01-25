package com.sakthi.day1.practice.service;

import com.sakthi.day1.practice.entity.Department;
import com.sakthi.day1.practice.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest
{
    @Autowired
    private DepartmentService service;

    @MockBean
    private DepartmentRepository repository;

    @BeforeEach
    void setUp()
    {
        try {
            Department department=Department.builder()
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void whenValidDepartmentName_thenDepartmentShouldFound()
    {
        String dName="Bca";
        Department found=service.fetchDepartmentByName(dName);
        assertEquals(dName,found.getdName());

    }

}