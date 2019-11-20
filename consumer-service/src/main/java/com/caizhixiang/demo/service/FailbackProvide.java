package com.caizhixiang.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author caizhixiang
 * @description:
 * @Date 2019-11-19 16:52
 * @Version 1.0
 **/
@Slf4j
@Component
public class FailbackProvide implements ProviderClient{

    @Override
    public void sayHello(String name) {
        log.info("====================");
    }
}
