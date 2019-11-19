package com.caizhixiang.demo.controller;

import com.caizhixiang.demo.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caizhixiang
 * @description:
 * @Date 2019-11-19 17:06
 * @Version 1.0
 **/
@RestController
public class SayHiController {
    @Autowired
    private ProviderService providerService;

    @RequestMapping("hi")
    public void sayHi(String name) {
        providerService.sayHello(name);
    }
}
