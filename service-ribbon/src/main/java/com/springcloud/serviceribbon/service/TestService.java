package com.springcloud.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @user :flyxk
 * date :2018/9/3
 */
@Service
public class TestService {

    RestTemplate restTemplate;

    @Autowired
    public TestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String hi(String name) {
        return this.restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }
}
