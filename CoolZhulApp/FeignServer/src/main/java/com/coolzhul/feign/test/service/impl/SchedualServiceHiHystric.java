package com.coolzhul.feign.test.service.impl;

import com.coolzhul.feign.test.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHi(String name) {
        return "sorry,"+name;
    }
}
