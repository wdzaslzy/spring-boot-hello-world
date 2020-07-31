package com.wdzaslzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @GetMapping("hello_world")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }

}
