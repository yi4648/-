package com.zut.manager.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zut.manager.common.utils.PageUtils;
import com.zut.manager.entity.MessageEntity;

import java.util.Map;


public interface MessageService extends IService<MessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

