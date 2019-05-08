package com.yan.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class User {
    private Long uid;
    private String name;
    private Integer age;
    private String sex;
    private Date birthday;
    private Long phone;
    private String address;

}
