package com.ani.orm.project.ormdemo.controller;

import com.ani.orm.project.ormdemo.domain.Car;
import com.ani.orm.project.ormdemo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/car")
@RestController
public class CarController
{

    @Autowired
    private CarService service;

    @PostMapping
    public String saveCar(@RequestBody Car car) {
        service.saveCar(car);
        return "car saved successfully";
    }

    @DeleteMapping("/{carId}")
    public String deleteCar(@PathVariable Long carId) {
        service.deleteCar(carId);
        return "car deleted successfully";
    }

    @GetMapping
    public List<Car> findAllCars() {
        return service.findAllCars();
    }
}
