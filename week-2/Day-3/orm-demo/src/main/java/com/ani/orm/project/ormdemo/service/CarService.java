package com.ani.orm.project.ormdemo.service;

import com.ani.orm.project.ormdemo.domain.Car;
import com.ani.orm.project.ormdemo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService
{
        @Autowired
        private CarRepository repository;

        public Car saveCar(Car car) {
            return repository.save(car);
        }

        public void deleteCar(Long id) {
            repository.deleteById(id);
        }

        public List<Car> findAllCars() {
            return repository.findAll();
        }

        public Car updateCar() {

            // complete the code for updating the car
            return null;
        }
}
