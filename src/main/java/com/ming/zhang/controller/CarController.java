package com.ming.zhang.controller;

import com.ming.zhang.entity.CarListEntity;
import com.ming.zhang.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("/getCarList")
    public Object getCarList() {
        List<CarListEntity> res = carService.getCarList();
    }
}
