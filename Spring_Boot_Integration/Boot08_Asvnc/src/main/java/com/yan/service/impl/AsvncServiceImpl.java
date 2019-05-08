package com.yan.service.impl;

import com.yan.service.AsvncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.Future;

@Service
public class AsvncServiceImpl implements AsvncService {

    private static  Random ran = new Random();

    @Async
    @Override
    public Future<String> doTask1() throws Exception {
        System.out.println("任务1开始执行。。");
        long start = System.currentTimeMillis();
        Thread.sleep(ran.nextInt(10000));

        long end = System.currentTimeMillis();
        System.out.println("任务1结束耗时： " +(end - start) +"毫秒" );

        return new AsyncResult<>("任务1结束");
    }
    @Async
    @Override
    public Future<String> doTask2() throws Exception {
        System.out.println("任务2开始执行。。");
        long start = System.currentTimeMillis();
        Thread.sleep(ran.nextInt(10000));

        long end = System.currentTimeMillis();
        System.out.println("任务2结束耗时： " +(end - start) +"毫秒" );

        return new AsyncResult<>("任务2结束");
    }
    @Async
    @Override
    public Future<String> doTask3() throws Exception {
        System.out.println("任务3开始执行。。");
        long start = System.currentTimeMillis();
        Thread.sleep(ran.nextInt(10000));

        long end = System.currentTimeMillis();
        System.out.println("任务3结束耗时： " +(end - start) +"毫秒" );

        return new AsyncResult<>("任务3结束");
    }
}
