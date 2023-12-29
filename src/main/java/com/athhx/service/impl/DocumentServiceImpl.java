package com.athhx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.athhx.domain.Document;
import com.athhx.service.DocumentService;
import com.athhx.mapper.DocumentMapper;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【document】的数据库操作Service实现
* @createDate 2023-12-28 09:42:23
*/
@Service
public class DocumentServiceImpl extends ServiceImpl<DocumentMapper, Document>
    implements DocumentService{

}




