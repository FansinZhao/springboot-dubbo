package com.fansin.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.fansin.dubbo.api.DemoService;

/**
 * <p>Title: DefaultDemoService</p>
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
public class DefaultDemoService implements DemoService {
    @Override
    public String sayHello(String name) {
        return "[服务端] 接收到客户端的:"+name;
    }
}
