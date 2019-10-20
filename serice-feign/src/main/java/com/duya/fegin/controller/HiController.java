package com.duya.fegin.controller;

import com.duya.fegin.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name") String name) {
        System.out.println(schedualServiceHi==null);
        return schedualServiceHi.home( name );
    }
}