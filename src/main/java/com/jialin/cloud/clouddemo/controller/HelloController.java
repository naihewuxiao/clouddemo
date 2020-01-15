package com.jialin.cloud.clouddemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(path = {"/hello"})
    public String index(){
        return "hello susu";
    }
}
