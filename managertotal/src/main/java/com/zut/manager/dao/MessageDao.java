package com.zut.manager.dao;

import com.zut.manager.entity.MessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


@Mapper
@Component
public interface MessageDao extends BaseMapper<MessageEntity> {
	
}
