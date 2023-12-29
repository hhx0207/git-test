package com.athhx.controller;

import com.athhx.common.R;
import com.athhx.domain.Car;
import com.athhx.mapper.CarMapper;
import com.athhx.service.CarService;
import com.athhx.service.impl.CarServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Hou Huaxin
 * @date 2023-12-27 16:39
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    CarService carService;
    @Autowired
    CarMapper carMapper;
    @GetMapping("/hello")
    public List<Car> hello() {

        List <Car> carList =  carService.list();
        return carList;
    }

    @ResponseBody
    @GetMapping("{currentPage}/{pageSize}")
    public R<IPage<Car>> getPage(HttpServletRequest q,@PathVariable int currentPage, @PathVariable int pageSize) {
        IPage iPage = new Page(currentPage,pageSize);
        LambdaQueryWrapper<Car> lqw = new LambdaQueryWrapper<Car>();
        lqw.eq(Car::getId, 1);
        IPage<Car> page = carMapper.selectPage(iPage, null);

        return R.success(page);
    }

}
