package com.app.mysell.controller;

import com.app.mysell.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    UserMapper userMapper;

    @GetMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("userList",userMapper.selectListUser());
        return "index";
    }
}
