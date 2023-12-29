package com.athhx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.athhx.domain.Task;
import com.athhx.service.TaskService;
import com.athhx.mapper.TaskMapper;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【task】的数据库操作Service实现
* @createDate 2023-12-28 09:42:24
*/
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task>
    implements TaskService{

}




