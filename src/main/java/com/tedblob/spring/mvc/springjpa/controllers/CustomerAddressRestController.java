package com.tedblob.spring.mvc.springjpa.controllers;


import com.tedblob.spring.mvc.springjpa.model.CustomerAddress;
import com.tedblob.spring.mvc.springjpa.model.CustomerAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerAddressRestController {


    @Autowired
    CustomerAddressRepository customerAddressRepository;

    @GetMapping(path = "/customers/{customerId}/addresses", params = {"type"})
    public List<CustomerAddress> handleGetAddressesByIdAndType(@PathVariable String customerId,
                                                               @RequestParam String type) {


        List<CustomerAddress> addressFlux = customerAddressRepository.findByCustomerIdAndType(customerId, type);

        return addressFlux;

    }

}
