package com.tedblob.spring.mvc.springjpa.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends CrudRepository<Address, String> {

    @Query("SELECT c FROM Address c WHERE c.isPermanentAddress = true")
    public Iterable<Address> findAllPermanentAddress();

    Iterable<Address> findByIsPermanentAddressTrue();

    Iterable<Address> findByIsPermanentAddressFalse();

}
