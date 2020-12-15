package com.zut.manager.service.impl;

import com.zut.manager.common.utils.PageUtils;
import com.zut.manager.common.utils.Query;
import com.zut.manager.dao.BookDao;
import com.zut.manager.entity.BookEntity;
import com.zut.manager.service.BookService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("bookService")
public class BookServiceImpl extends ServiceImpl<BookDao, BookEntity> implements BookService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String bookName =(String) params.get("bookName");
        String bookPub =(String) params.get("bookPub");
        QueryWrapper<BookEntity> queryWrapper = new QueryWrapper<>();
        if(bookPub!=null)
            queryWrapper.like("book_pub",bookPub);
        if(bookName!=null)
            queryWrapper.like("book_name",bookName);
        IPage<BookEntity> page = this.page(
                new Query<BookEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

}