package com.springcloud.servicefeign.controller;

import com.springcloud.servicefeign.feign.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @user :flyxk
 * date :2018/9/3
 */
@RestController
public class TestController {

    HiService hiService;

    @Autowired
    public TestController(HiService hiService){
        this.hiService = hiService;
    }

    @GetMapping("/hi")
    public String hi(@RequestParam String name){
        return this.hiService.hi(name);
    }

}
