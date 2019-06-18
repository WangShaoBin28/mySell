package com.app.mysell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Package com.app.mysell.controller
 * @ClassName ContentController
 * @Author shaobin.wang
 * @Date 2019/06/04 11:22
 * @Version 1.0
 * @Description:
 **/
@Controller
@RequestMapping("/content/")
public class ContentController {

    @GetMapping("articleList")
    public String articleList() {

        return "content/article-list";
    }

    @GetMapping("danyeList")
    public String danyeList() {

        return "content/danye-list";
    }

}
