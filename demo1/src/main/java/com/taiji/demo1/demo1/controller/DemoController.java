package com.taiji.demo1.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    @GetMapping("/demo")
    @ResponseBody
    public  String getDemo(){
        System.out.println("DemoController.getDemo");

        return  "hello demo fdsfdsn dskf 无法第三方 ";


//        return  "hello demo fdsfdsn dskf000";


    }
}
