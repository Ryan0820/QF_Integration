package com.yan.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalException {


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> handler(Exception e){

        Map<String,Object> map = new HashMap<>();
        map.put("errorCode",500);
        map.put("errorMsg",e.toString());
        return map;
    }

}
