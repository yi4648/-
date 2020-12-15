package com.zut.manager.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zut.manager.common.utils.PageUtils;
import com.zut.manager.entity.BookEntity;

import java.util.Map;

/**
 * 
 *
 * @author liqiqi
 * @email 523892377@qq.com
 * @date 2020-12-10 19:51:11
 */
public interface BookService extends IService<BookEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

