package com.tedblob.spring.mvc.springjpa.controllers;


import com.tedblob.spring.mvc.springjpa.dao.CustomerDAO;
import com.tedblob.spring.mvc.springjpa.model.Customer;
import com.tedblob.spring.mvc.springjpa.model.CustomerType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class CustomerRestController {


    @Autowired
    CustomerDAO customerDAO;

/*
    @GetMapping(path = "/customerCount")
    public long getCustomerCount() {
        return customerDAO.getCustomerCount();
    }*/

    @GetMapping(path = "/customers")
    public Iterable<Customer> handleGetCustomers() {

        return customerDAO.getCustomers();

    }



    @GetMapping(path = "/countCustomersByType")
    public List<CustomerType> countCustomersByType() {

        return customerDAO.totalCustomersByType();

    }
    @GetMapping(path = "/customersDesc")
    public Iterable<Customer> getCustomersDesc() {

        return customerDAO.getCustomersByDesc();

    }

}
