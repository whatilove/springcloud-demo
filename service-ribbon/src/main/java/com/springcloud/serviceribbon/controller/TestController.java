package com.springcloud.serviceribbon.controller;

import com.springcloud.serviceribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @user :flyxk
 * date :2018/9/3
 */
@RestController
public class TestController {

    TestService testService;

    @Autowired
    public TestController(TestService testService){
        this.testService = testService;
    }

    @GetMapping("/hi")
    public String hi(){
        return testService.hi("kz");
    }
}
