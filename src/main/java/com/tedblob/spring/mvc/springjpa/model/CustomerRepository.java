package com.tedblob.spring.mvc.springjpa.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    @Query("SELECT new java.lang.Boolean(COUNT(u) > 0) FROM Customer u WHERE u.customer_type=?1")
    Boolean getCountOfNewUsers(String customertype);
/*   @Query("SELECT COUNT(u) FROM Customer u WHERE u.new_user=:new_user")
    long getCountOfNewUsers(@Param("new_user") int newUser);
    */
    List<Customer> findAllByOrderByNameDesc();

    @Query(nativeQuery = true)
    List<CustomerType> totalCustomersByType();
}
