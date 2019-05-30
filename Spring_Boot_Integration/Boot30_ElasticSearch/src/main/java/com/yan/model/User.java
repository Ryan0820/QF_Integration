package com.yan.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;
import java.util.List;

@ToString
@Data
@Document(indexName = "userindex",type = "user")
public class User {

    @Id
    private Long uid;
    private String name;
    private Date birthday;
    private List<String> list;
}
