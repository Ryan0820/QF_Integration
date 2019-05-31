package com.yan.controller;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.common.SolrDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SolrController {

    @Autowired
    private SolrClient solrClient;


    @RequestMapping("/solr")
    @ResponseBody
    public String tt() throws Exception {
        SolrDocument doc = solrClient.getById("738388");
        return doc.toString();
    }
}
