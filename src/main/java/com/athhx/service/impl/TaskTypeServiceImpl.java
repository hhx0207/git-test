package com.athhx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.athhx.domain.TaskType;
import com.athhx.service.TaskTypeService;
import com.athhx.mapper.TaskTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【task_type】的数据库操作Service实现
* @createDate 2023-12-28 09:42:24
*/
@Service
public class TaskTypeServiceImpl extends ServiceImpl<TaskTypeMapper, TaskType>
    implements TaskTypeService{

}




