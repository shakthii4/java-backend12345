package com.sakthi.day1.practice.repository;

import com.sakthi.day1.practice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>
{



}
