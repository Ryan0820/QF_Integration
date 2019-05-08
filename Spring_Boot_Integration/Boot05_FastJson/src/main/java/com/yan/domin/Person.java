package com.yan.domin;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Person {


    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date date;
    private String name;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
