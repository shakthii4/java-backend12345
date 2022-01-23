package com.ani.orm.project.ormdemo.repository;

import com.ani.orm.project.ormdemo.domain.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car,Long>
{
    @Override
    List<Car> findAll();
}
