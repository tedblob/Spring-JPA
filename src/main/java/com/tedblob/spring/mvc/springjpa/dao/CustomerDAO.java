package com.tedblob.spring.mvc.springjpa.dao;


import com.tedblob.spring.mvc.springjpa.model.Customer;
import com.tedblob.spring.mvc.springjpa.model.CustomerRepository;
import com.tedblob.spring.mvc.springjpa.model.CustomerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDAO {

    @Autowired
    CustomerRepository customerRepository;

    public Long getNewCustomerCount() {
        Customer customer = new Customer();
        customer.setCustomer_type("New");
        customerRepository.findAll(PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "name")));
        return customerRepository.count(Example.of(customer));
    }

    public List<CustomerType> totalCustomersByType() {
        return customerRepository.totalCustomersByType();
    }

    public List<Customer> getCustomersByDesc() {
        return customerRepository.findAll(Sort.by(Sort.Order.desc("name")));
    }

    public List<Customer> getCustomersByDesc2() {
        return customerRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
    }

    public List<Customer> getCustomers() {

        return customerRepository.findAll();

    }
}
