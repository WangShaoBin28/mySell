package com.app.mysell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Package com.app.mysell.controller
 * @ClassName MainController
 * @Author shaobin.wang
 * @Date 2019/05/06 19:03
 * @Version 1.0
 * @Description: 程序入口
 **/
@Controller
@RequestMapping("/main/")
public class MainController {

    @RequestMapping("main")
    public String main() {
        //根据角色获取相对应的菜单 登录信息

        return "main/main";
    }

    @RequestMapping("panel")
    public String panel() {
        //根据角色获取相对应的菜单 登录信息

        return "main/panel";
    }

}
