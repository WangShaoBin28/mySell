package com.app.mysell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

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
    public String index(ModelMap modelMap, HttpServletRequest request) {
        String session = (String) request.getSession().getAttribute("loginName");
        if (!StringUtils.isEmpty(session)) {
            return "redirect:/main/main";
        }
        return "login/login";
    }
}
