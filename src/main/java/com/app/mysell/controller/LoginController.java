package com.app.mysell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLEncoder;

/**
 * @Package com.app.mysell.controller
 * @ClassName LoginController
 * @Author shaobin.wang
 * @Date 2019/05/06 17:29
 * @Version 1.0
 * @Description:
 **/
@Controller
@RequestMapping("/login/")
@Slf4j
public class LoginController {


    @GetMapping("checkLogin")
    @ResponseBody
    public String checkLogin(HttpServletRequest request,HttpServletResponse response) {
        //异步校验账号密码是否正确，如果成功后进行把用户ID存入cookie
        request.getSession().setAttribute("loginName", "王少彬");
//        setCookie(response,"userName","wangshaobin",0);
        return "ok";
    }

    /**
     * @param
     * @return java.lang.String
     * @author shaobin.wang
     * @date 2019/05/07 11:48
     * @description
     */
    @GetMapping("loginOut")
    public String loginOut(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("loginName");
        log.info("退出登录操作");
        return "redirect:/";
    }


}
