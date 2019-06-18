package com.app.mysell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Package com.app.mysell.controller
 * @ClassName AdminController
 * @Author shaobin.wang
 * @Date 2019/06/04 11:37
 * @Version 1.0
 * @Description:
 **/
@Controller
@RequestMapping("/admin/")
public class AdminController {

    @GetMapping("adminInfo")
    public String adminInfo() {
        return "admin/admin-info";
    }

    @GetMapping("system")
    public String system() {
        return "admin/system";
    }
}
