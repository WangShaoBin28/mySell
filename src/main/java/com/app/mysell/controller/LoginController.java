package com.app.mysell.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package com.app.mysell.controller
 * @ClassName LoginController
 * @Author shaobin.wang
 * @Date 2019/05/06 17:29
 * @Version 1.0
 * @Description:
 **/
@RestController
@RequestMapping("/login/")
public class LoginController {


    @GetMapping("checkLogin")
    public String checkLogin() {
        //异步校验账号密码是否正确，如果成功后进行把用户ID存入cookie




        return "ok";
    }

}
