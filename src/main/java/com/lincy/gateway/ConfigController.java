package com.lincy.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/config")
//@RefreshScope
public class ConfigController {

    @Value("${route.a}")
    private String config;

    @Value("${server.port}")
    private String port;

    @GetMapping("/a")
    @ResponseBody
    public String get() {
        return config;
    }

    @GetMapping("/port")
    @ResponseBody
    public String port() {
        return port;
    }
}
