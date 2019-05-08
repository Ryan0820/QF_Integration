package com.yan.controller;

import com.yan.service.AsvncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

@RestController
public class IController {

    @Autowired
    private AsvncService service;

    @RequestMapping("/")
    public String index() throws Exception {
        long start = System.currentTimeMillis();
        Future<String> doTask1 = service.doTask1();
        Future<String> doTask2 = service.doTask2();
        Future<String> doTask3 = service.doTask3();
        while (true) {
            if (doTask1.isDone() &&doTask2.isDone() &&doTask3.isDone() ){
                break;
            }
            Thread.sleep(10000);
        }
        long end = System.currentTimeMillis();
        return "ok 全部完成，总耗时： " +(end - start) +"毫秒";
    }
}
