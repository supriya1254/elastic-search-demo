package com.learn.elasticsearch.elasticsearchdemo.repository;

import com.learn.elasticsearch.elasticsearchdemo.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


import java.util.List;

public interface CustomerRepository extends ElasticsearchRepository<Customer,String> {
    List<Customer> findByFirstname(String firstName);
}
