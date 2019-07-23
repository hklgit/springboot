package com.hklspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Kerven-HAN on 2019/7/23 13:34.
 * Talk is cheap , show me the code
 */

@Controller
public class HelloController {

    // 要把信息输出到浏览器，使用注解@ResponseBody
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world spring boot !!!";
    }

}
