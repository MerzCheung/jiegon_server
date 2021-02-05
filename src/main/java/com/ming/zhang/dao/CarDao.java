package com.ming.zhang.dao;

import com.ming.zhang.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarDao {
    List<CarListEntity> getCarList(CarListEntity entity);

    List<CarClassEntity> getCarClass(CarClassEntity entity);

    List<CarDetailsEntity> getCarDetails(CarDetailsEntity entity);

    CarAccumulatorConfigEntity getAccumulatorConfig(CarAccumulatorConfigEntity entity);

    List<CarAccumulatorListEntity> getAccumulatorList(CarAccumulatorListEntity entity);
}
