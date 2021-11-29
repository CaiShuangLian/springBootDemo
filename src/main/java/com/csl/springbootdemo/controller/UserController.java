package com.csl.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 查看源码可知：
 * @RestController=@Controller+@ResponseBody
 */
@RestController
public class UserController {

    @RequestMapping("/hello")
    public String Hello(){
        return "Hello World!Today is Friday";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
