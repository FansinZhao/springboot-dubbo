package com.fansin.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fansin.dubbo.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {

    @RequestMapping("")
    public String index(){

        return "hello!";
    }

    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}",
            url = "dubbo://127.0.0.1:12345")
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.sayHello(name);
    }

}
