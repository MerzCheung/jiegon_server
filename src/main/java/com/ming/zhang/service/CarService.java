package com.ming.zhang.service;


import com.ming.zhang.entity.*;

import java.util.List;

public interface CarService {
    List<CarListMapEntity> getCarList(CarListEntity entity);

    List<CarClassEntity> getCarClass(CarClassEntity carClassEntity);

    List<CarDetailsEntity> getCarDetails(CarDetailsEntity entity);

    CarAccumulatorConfigEntity getAccumulatorConfig(CarAccumulatorConfigEntity carAccumulatorConfigEntity);

    List<CarAccumulatorListEntity> getAccumulatorList(CarAccumulatorListEntity carAccumulatorListEntity);

    List<CarYearEntity> getCarYearList(Integer id);

    List<CarCcEntity> getCarCcList(Integer id);
}
