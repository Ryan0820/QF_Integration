package com.yan.service;

import java.util.concurrent.Future;

public interface AsvncService {
    Future<String> doTask1() throws Exception;
    Future<String> doTask2() throws Exception;
    Future<String> doTask3() throws Exception;
}
