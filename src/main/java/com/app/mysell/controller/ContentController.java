package com.app.mysell.controller;

import com.app.mysell.common.model.ReturnInfo;
import com.app.mysell.entity.UserInfoEntity;
import com.app.mysell.service.UserInfoService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("articleList")
    public String articleList() {

        return "content/article-list";
    }

    @GetMapping("danyeList")
    public String danyeList() {

        return "content/danye-list";
    }


    /**
     * @param pageNum
     * @param pageSize
     * @return com.app.mysell.common.model.ReturnInfo<com.github.pagehelper.PageInfo   <   com.app.mysell.entity.UserInfoEntity>>
     * @author shaobin.wang
     * @date 2019/06/20 18:24
     * @description
     */
    @RequestMapping("/userList")
    public String selectUserInfoPage(
            @RequestParam("pageNum") int pageNum,
            @RequestParam("pageSize") int pageSize,
            ModelMap modelMap) {

        modelMap.addAttribute("userPage", userInfoService.selectUserInfoPage(pageNum, pageSize));

        return "content/user-list";
    }

}
