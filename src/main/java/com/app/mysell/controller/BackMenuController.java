package com.app.mysell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Package com.app.mysell.controller
 * @ClassName BackMenuController
 * @Author shaobin.wang
 * @Date 2019/05/07 13:24
 * @Version 1.0
 * @Description:
 **/
@RequestMapping("/backMenu/")
@Controller
public class BackMenuController {

    /**
     * @param
     * @return java.lang.String
     * @author shaobin.wang
     * @date 2019/05/07 13:31
     * @description
     */
    @GetMapping("menu")
    public String backMenu() {
        return "backMenu/menu";
    }


}
