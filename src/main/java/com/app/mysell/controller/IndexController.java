package com.app.mysell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Package com.app.mysell.controller
 * @ClassName IndexController
 * @Author shaobin.wang
 * @Date 2019/04/28 14:54
 * @Version 1.0
 * @Description:
 **/
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(ModelMap modelMap) {
        return "index";
    }
}
