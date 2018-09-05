package com.springcloud.servicefeign.feign;

import org.springframework.stereotype.Component;

/**
 * @user :flyxk
 * date :2018/9/3
 */
@Component
public class TestHystrix implements HiService {
    @Override
    public String hi(String name) {
        return "sorry " + name;
    }
}
