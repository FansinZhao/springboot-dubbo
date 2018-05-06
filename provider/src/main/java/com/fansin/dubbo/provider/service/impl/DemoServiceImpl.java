package com.fansin.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fansin.dubbo.provider.service.DemoService;

/**
 * <p>Title: DemoServiceImpl</p>
 * <p>Description: </p>
 *
 * @author zhaofeng
 * @version 1.0
 * @date 18-5-4
 */
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return null;
    }
}
