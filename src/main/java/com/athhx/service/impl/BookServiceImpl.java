package com.athhx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.athhx.domain.Book;
import com.athhx.service.BookService;
import com.athhx.mapper.BookMapper;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【book】的数据库操作Service实现
* @createDate 2023-12-28 09:42:23
*/
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book>
    implements BookService{

}




