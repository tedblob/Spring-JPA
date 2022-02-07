package com.tedblob.spring.mvc.springjpa.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {

    @Id
    private String id;
    private String address;
    private boolean isPermanentAddress;
}
