package com.whz.k8spod.swaggertest.controller;

import com.whz.k8spod.swaggertest.entity.Order;
import com.whz.k8spod.swaggertest.fegin.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private ITestService iTestService;



    @GetMapping("/feigns-test")
    public List<Order> feignTest(){
        return iTestService.get();
    }

}
