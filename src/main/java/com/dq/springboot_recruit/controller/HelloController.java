package com.dq.springboot_recruit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* 设置项目欢迎页面
*/
@Controller
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "forward:index_jober.html";
    }
}
