package com.ming.zhang.controller;

import com.ming.zhang.common.ResponseEntity;
import com.ming.zhang.entity.*;
import com.ming.zhang.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("/getCarList")
    public ResponseEntity getCarList() {
        CarListEntity entity = new CarListEntity();
        entity.setIsValid(1);
        List<CarListMapEntity> res = carService.getCarList(entity);
        return ResponseEntity.success(null, res);
    }

    @RequestMapping("/getCarClass/{id}")
    public ResponseEntity getCarClass(@PathVariable("id") Integer id) {
        CarClassEntity carClassEntity = new CarClassEntity();
        carClassEntity.setIsValid(1);
        carClassEntity.setCarListId(id);
        List<CarClassEntity> res = carService.getCarClass(carClassEntity);
        return ResponseEntity.success(null, res);
    }


    @RequestMapping("/getCarConfig/{id}")
    public ResponseEntity getCarConfig(@PathVariable("id") Integer id) {
        List<CarYearEntity> yearEntities = carService.getCarYearList(id);
        List<CarCcEntity> carCcEntities = carService.getCarCcList(id);
        Map<String, List> map = new HashMap(2);
        map.put("yearEntities", yearEntities);
        map.put("carCcEntities", carCcEntities);
        return ResponseEntity.success(null, map);
    }


    @RequestMapping("/getCarDetails")
    public ResponseEntity getCarDetails(@RequestBody CarDetailsEntity entity) {
        entity.setIsValid(1);
        List<CarDetailsEntity> res = carService.getCarDetails(entity);
        return ResponseEntity.success(null, res);
    }

    @RequestMapping("/getAccumulator/{id}")
    public ResponseEntity getAccumulator(@PathVariable Integer id) {
        CarAccumulatorConfigEntity carAccumulatorConfigEntity = new CarAccumulatorConfigEntity();
        carAccumulatorConfigEntity.setCarDetailsId(id);
        carAccumulatorConfigEntity.setIsValid(1);
        CarAccumulatorConfigEntity configEntity = carService.getAccumulatorConfig(carAccumulatorConfigEntity);

        CarAccumulatorListEntity carAccumulatorListEntity = new CarAccumulatorListEntity();
        carAccumulatorListEntity.setCarDetailsId(id);
        carAccumulatorListEntity.setIsValid(1);
        List<CarAccumulatorListEntity> listEntities = carService.getAccumulatorList(carAccumulatorListEntity);
        Map<String, Object> data = new HashMap<>();
        data.put("configEntity", configEntity);
        data.put("listEntities", listEntities);
        return ResponseEntity.success(null, data);
    }
}
