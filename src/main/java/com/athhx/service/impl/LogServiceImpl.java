package com.athhx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.athhx.domain.Log;
import com.athhx.service.LogService;
import com.athhx.mapper.LogMapper;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【log】的数据库操作Service实现
* @createDate 2023-12-28 09:42:24
*/
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log>
    implements LogService{

}




