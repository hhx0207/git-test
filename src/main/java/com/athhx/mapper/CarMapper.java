package com.athhx.mapper;

import com.athhx.domain.Car;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author DELL
* @description 针对表【car】的数据库操作Mapper
* @createDate 2023-12-28 09:42:23
* @Entity com.athhx.domain.Car
*/
@Mapper
public interface CarMapper extends BaseMapper<Car> {

}




