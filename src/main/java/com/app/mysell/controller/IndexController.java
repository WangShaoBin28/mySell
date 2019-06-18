package com.app.mysell.controller;

import com.app.mysell.dao.UserInfoMapper;
import com.app.mysell.entity.UserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.util.Date;

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
    private UserInfoMapper userInfoMapper;

    @GetMapping("/")
    public String index(ModelMap modelMap, HttpServletRequest request) {
        String session = (String) request.getSession().getAttribute("loginName");
        if (!StringUtils.isEmpty(session)) {
            return "redirect:/main/main";
        }
        return "login/login";
    }
}
