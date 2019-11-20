package com.caizhixiang.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caizhixiang
 * @description:
 * @Date 2019-11-19 17:18
 * @Version 1.0
 **/
@RestController
@Slf4j
@RequestMapping("/provide")
public class ProviderController {

    @RequestMapping("/hi")
    public void sayHello(String name) {
        log.info("----------hello:{}-----------",name);
    }
}
