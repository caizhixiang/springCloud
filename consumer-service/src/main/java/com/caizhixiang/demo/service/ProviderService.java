package com.caizhixiang.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author caizhixiang
 * @description:
 * @Date 2019-11-19 16:52
 * @Version 1.0
 **/
@FeignClient(value = "provider-feign")
public interface ProviderService {

    @RequestMapping("/hi")
    void sayHello(@RequestParam(value = "name") String name);
}
