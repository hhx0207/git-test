package com.athhx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.athhx.domain.Dept;
import com.athhx.service.DeptService;
import com.athhx.mapper.DeptMapper;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【dept】的数据库操作Service实现
* @createDate 2023-12-28 09:42:23
*/
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept>
    implements DeptService{

}




