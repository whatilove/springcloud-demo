package com.springcloud.serviceconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @user :flyxk
 * date :2018/9/5
 */
@RestController
public class TestController {

    @Value("${profile}")
    String profile;

    @GetMapping("/hi")
    public String hi() {
        return this.profile;
    }
}
