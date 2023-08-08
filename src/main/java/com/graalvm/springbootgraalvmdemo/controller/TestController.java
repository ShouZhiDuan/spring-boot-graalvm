package com.graalvm.springbootgraalvmdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author duanshouzhi
 * @create 2023-08-08 9:57
 */
@RestController
@RequestMapping("/graalvm")
public class TestController {

    @GetMapping("/test")
    public Object test(String msg){
        System.out.println("收到请求：" + msg);
        return msg;
    }

}
