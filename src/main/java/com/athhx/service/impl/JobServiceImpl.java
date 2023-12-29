package com.athhx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.athhx.domain.Job;
import com.athhx.service.JobService;
import com.athhx.mapper.JobMapper;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【job】的数据库操作Service实现
* @createDate 2023-12-28 09:42:24
*/
@Service
public class JobServiceImpl extends ServiceImpl<JobMapper, Job>
    implements JobService{

}




