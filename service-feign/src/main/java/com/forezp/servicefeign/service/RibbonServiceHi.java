package com.forezp.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-ribbon")
public interface RibbonServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String ribbonService(@RequestParam(name = "name") String name);
}
