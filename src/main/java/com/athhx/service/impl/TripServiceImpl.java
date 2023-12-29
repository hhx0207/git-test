package com.athhx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.athhx.domain.Trip;
import com.athhx.service.TripService;
import com.athhx.mapper.TripMapper;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【trip】的数据库操作Service实现
* @createDate 2023-12-28 09:42:24
*/
@Service
public class TripServiceImpl extends ServiceImpl<TripMapper, Trip>
    implements TripService{

}




