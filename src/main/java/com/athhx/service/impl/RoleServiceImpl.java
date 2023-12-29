package com.athhx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.athhx.domain.Role;
import com.athhx.service.RoleService;
import com.athhx.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【role】的数据库操作Service实现
* @createDate 2023-12-28 09:42:24
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




