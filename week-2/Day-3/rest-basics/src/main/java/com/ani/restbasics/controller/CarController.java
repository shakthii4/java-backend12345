package com.ani.restbasics.controller;

import com.ani.restbasics.domain.Car;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping
@RestController
public class CarController
{
    @GetMapping("/hi")
    public String sayHi()
    {
        return "hi";
    }

    @GetMapping
    public Car defaultCar()
    {
        var car=new Car();
        car.setFwd(true);
        car.setSpeed(100);
        car.setParts(List.of("abc","pqr","lmn"));
        return car;
    }
    @PostMapping
    public Car saveCar(@RequestBody Car car)
    {
        var cr=new Car();
        cr.setSpeed(0);
        cr.setFwd(false);
        cr.setParts(car.getParts());
        return cr;
    }
    @PutMapping
    public Car updatedCar(@RequestBody Car updatedCar)
    {
        return updatedCar;
    }
    @DeleteMapping("/{carId}")
    public String deleteCar(@PathVariable int carId)
    {
        return "Car deleted Successfully";
    }

}
