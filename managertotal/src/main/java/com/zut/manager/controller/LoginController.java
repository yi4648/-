package com.zut.manager.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zut.manager.common.utils.R;
import com.zut.manager.dao.MessageDao;
import com.zut.manager.entity.MessageEntity;
import com.zut.manager.vo.UserVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Api
public class LoginController {

    @Autowired
    private MessageDao messageDao;

    @RequestMapping("/login")
    public R login(UserVo userVo, HttpServletRequest request) {


        MessageEntity username1 = messageDao.selectOne(new QueryWrapper<MessageEntity>().eq("uNo", userVo.getUsername()));
        if (username1 == null)
            return R.error().put("msg", "账号不存在");
        if (username1.getPassword().equals(userVo.getPassword())) {
            request.getSession().setAttribute("role", username1.getUrole());
            return R.ok().put("user", username1);

        }

        return R.error().put("msg", "密码错误");

    }

    @RequestMapping("/logout")
    public R logout(UserVo userVo, HttpServletRequest request) {


        request.getSession().invalidate();
        return R.ok();


    }
}
