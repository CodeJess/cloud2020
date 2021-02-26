package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMesageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController {

    @Resource
    private IMesageProvider mesageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return mesageProvider.send();
    }
}
