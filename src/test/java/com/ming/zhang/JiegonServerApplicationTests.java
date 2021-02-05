package com.ming.zhang;

import com.ming.zhang.entity.CarListEntity;
import com.ming.zhang.service.CarService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan("com.ming.zhang.*")
@SpringBootTest
class JiegonServerApplicationTests {

    @Autowired
    private CarService carService;

    @Test
    void contextLoads() {
        CarListEntity entity = new CarListEntity();
        entity.setIsValid(1);
        List<CarListEntity> res = carService.getCarList(entity);
        System.out.println(res);
    }

}
