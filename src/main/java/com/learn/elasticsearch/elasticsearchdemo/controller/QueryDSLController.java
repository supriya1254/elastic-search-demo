package com.learn.elasticsearch.elasticsearchdemo.controller;

import com.learn.elasticsearch.elasticsearchdemo.model.Customer;
import com.learn.elasticsearch.elasticsearchdemo.service.QueryDSLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QueryDSLController {

    @Autowired
    private QueryDSLService queryDSLService;

    @GetMapping("searchMultiField/{firstname}/{age}")
    public List<Customer> searchByMultiField(@PathVariable String firstname,@PathVariable int age) {
        return queryDSLService.searchMultiField(firstname,age);
    }

    @GetMapping("/customSearch/{firstName}")
    public List<Customer> getCustomerByField(@PathVariable String firstName) {
        return queryDSLService.getCustomerSearchData(firstName);
    }

    @GetMapping("/search/{text}")
    public List<Customer> doMultiMatchQuery(@PathVariable String text) {
        return queryDSLService.multiMatchQuery(text);
    }
}
