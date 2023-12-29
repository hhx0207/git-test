package com.athhx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.athhx.domain.Income;
import com.athhx.service.IncomeService;
import com.athhx.mapper.IncomeMapper;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【income】的数据库操作Service实现
* @createDate 2023-12-28 09:42:24
*/
@Service
public class IncomeServiceImpl extends ServiceImpl<IncomeMapper, Income>
    implements IncomeService{

}




