package com.zut.manager.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zut.manager.entity.BookEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author liqiqi
 * @email 523892377@qq.com
 * @date 2020-12-10 19:51:11
 */
@Mapper
public interface BookDao extends BaseMapper<BookEntity> {
	
}
