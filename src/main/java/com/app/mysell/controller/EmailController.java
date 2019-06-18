package com.app.mysell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Package com.app.mysell.controller
 * @ClassName EmailController
 * @Author shaobin.wang
 * @Date 2019/06/04 11:28
 * @Version 1.0
 * @Description:
 **/
@Controller
@RequestMapping("/email/")
public class EmailController {

    @GetMapping("email")
    public String email() {

        return "email/email";
    }


    @GetMapping("emailWrite")
    public String emailWrite() {

        return "email/email-write";
    }
}
