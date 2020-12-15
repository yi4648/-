package com.zut.manager.controller;

import java.util.Arrays;
import java.util.Map;


import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zut.manager.entity.MessageEntity;
import com.zut.manager.service.MessageService;
import com.zut.manager.common.utils.PageUtils;
import com.zut.manager.common.utils.R;


@RestController
@RequestMapping("manager/message")
@Api
public class MessageController {
    @Autowired
    private MessageService messageService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = messageService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{no}")
    public R info(@PathVariable("no") Integer no) {
        MessageEntity message = messageService.getById(no);

        return R.ok().put("message", message);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MessageEntity message) {
        messageService.save(message);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update/{no}")
    public R update(@RequestBody MessageEntity message,@PathVariable("no") Integer no) {
        message.setNo(no);
        messageService.updateById(message);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete/{no}")
    public R delete(@PathVariable("no") Integer no) {
        messageService.removeById(no);

        return R.ok();
    }

}
