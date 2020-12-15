package com.zut.manager.common.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginHandleInterator implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String role = (String) request.getSession().getAttribute("role");


        String url = request.getRequestURI();
        if (url.contains("/login"))
            return true;
        if (!url.contains("/manager"))
            return true;
        if (role == null) {
            response.sendRedirect("/util/unLogin");
            return true;
        }
        if (role.equals("管理员")) {
            return true;
        }
        if (url.contains("/manager/message/save")||url.contains("/manager/message/update")||url.contains("/manager/message/delete")) {
            response.sendRedirect("/util/noPermission");
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
