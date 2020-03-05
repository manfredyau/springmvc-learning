package com.yau.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("all")
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getRequestURI().contains("loginPage") || request.getRequestURI().contains("verify")) {
            return true;
        }
        String userLoginInfo = (String) request.getSession().getAttribute("userLoginInfo");
        System.err.println("userLoginInfo: " + userLoginInfo);
        if (userLoginInfo == null || userLoginInfo.equals("")) {
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("==post==");
    }
}
