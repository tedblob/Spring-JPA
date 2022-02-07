package com.tedblob.spring.mvc.springjpa.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerAddressRepository extends PagingAndSortingRepository<CustomerAddress, String> {

    List<CustomerAddress> findByCustomerIdAndType(String customerId, String type);
}
