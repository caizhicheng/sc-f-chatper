package com.forezp.servicefeign.controller;

import com.forezp.servicefeign.service.FeignServiceHi;
import com.forezp.servicefeign.service.RibbonServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class feignHiController {

    @Autowired
    FeignServiceHi feignServiceHi;
    @Autowired
    RibbonServiceHi ribbonServiceHi;

    @GetMapping("/hi")
    public String hiController(@RequestParam(name = "name") String name){
        return feignServiceHi.hiService(name) + "service-hi";
    }

    @GetMapping("/ribbonhi")
    public String ribbonHiController(@RequestParam(name = "name") String name){
        return ribbonServiceHi.ribbonService(name) + "service-ribbon";
    }
}
