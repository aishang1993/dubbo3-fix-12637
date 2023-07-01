package com.example.dubbodemo;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Demo1Controller {

    @Resource
    private Demo1Service demo1Service;

}
