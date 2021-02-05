package com.ming.zhang.service.impl;

import com.ming.zhang.dao.CarDao;
import com.ming.zhang.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;
}
