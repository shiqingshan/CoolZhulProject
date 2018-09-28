package com.coolzhul.feign.test.controller;

import com.coolzhul.feign.test.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "sayHi")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHi(name);
    }
}
