package com.athhx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.athhx.domain.Car;
import com.athhx.service.CarService;
import com.athhx.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【car】的数据库操作Service实现
* @createDate 2023-12-28 09:42:23
*/
@Service
public class CarServiceImpl extends ServiceImpl<CarMapper, Car>
    implements CarService{

}




