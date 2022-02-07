package com.tedblob.spring.mvc.springjpa.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@Data
public class CustomerAddress {

    @Id
    private String customerAddressId;

    private String customerId;
    private String line1;
    private String line2;
    private String city;
    private String type;
}
