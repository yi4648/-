package com.zut.manager.service.impl;

import com.zut.manager.common.utils.Constant;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zut.manager.common.utils.PageUtils;
import com.zut.manager.common.utils.Query;

import com.zut.manager.dao.MessageDao;
import com.zut.manager.entity.MessageEntity;
import com.zut.manager.service.MessageService;


@Service("messageService")
public class MessageServiceImpl extends ServiceImpl<MessageDao, MessageEntity> implements MessageService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        QueryWrapper<MessageEntity> queryWrapper = new QueryWrapper<MessageEntity>();
        if (params.get("name") != null) {
            queryWrapper.like("uName", params.get("name"));
        }
        IPage<MessageEntity> page = this.page(
                new Query<MessageEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

}