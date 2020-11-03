package com.yuliyao.helloword.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YuLiyao
 * @date 2020/11/3
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello() {
        return "hello world!";
    }
}
