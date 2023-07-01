package com.example.dubbodemo;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Demo2Controller {

    @DubboReference
    private Demo2Service demo1Service;

}
