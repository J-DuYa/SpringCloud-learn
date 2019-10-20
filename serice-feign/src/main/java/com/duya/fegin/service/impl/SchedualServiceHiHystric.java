package com.duya.fegin.service.impl;

import com.duya.fegin.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String home(String name) {
        return "Sorry, " + name;
    }
}
