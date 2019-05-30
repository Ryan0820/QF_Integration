package com.yan.controller;

import com.yan.model.User;
import org.elasticsearch.index.query.ExistsQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private ElasticsearchTemplate esc;

    @RequestMapping("/search")
    @ResponseBody
    public String findDoc(){
        //构造搜索条件
        ExistsQueryBuilder queryBuilder = QueryBuilders.existsQuery("first name");

        SearchQuery searchQuery =  new NativeSearchQueryBuilder().withQuery(queryBuilder)
                .build();
        List<User> users = esc.queryForList(searchQuery, User.class);
        for (User user : users) {
            System.out.println(user);
        }
        return "seccess";

    }

}
