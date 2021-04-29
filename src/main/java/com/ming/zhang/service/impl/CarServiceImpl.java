package com.ming.zhang.service.impl;

import com.ming.zhang.dao.CarDao;
import com.ming.zhang.entity.*;
import com.ming.zhang.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<CarListMapEntity> getCarList(CarListEntity entity) {
        return carDao.getCarList(entity);
    }

    @Override
    public List<CarClassEntity> getCarClass(CarClassEntity entity) {
        return carDao.getCarClass(entity);
    }

    @Override
    public List<CarDetailsEntity> getCarDetails(CarDetailsEntity entity) {
        return carDao.getCarDetails(entity);
    }

    @Override
    public CarAccumulatorConfigEntity getAccumulatorConfig(CarAccumulatorConfigEntity entity) {
        return carDao.getAccumulatorConfig(entity);
    }

    @Override
    public List<CarAccumulatorListEntity> getAccumulatorList(CarAccumulatorListEntity entity) {
        return carDao.getAccumulatorList(entity);
    }

    @Override
    public List<CarYearEntity> getCarYearList(Integer id) {
        return carDao.getCarYearList(id);
    }

    @Override
    public List<CarCcEntity> getCarCcList(Integer id) {
        return carDao.getCarCcList(id);
    }
}
