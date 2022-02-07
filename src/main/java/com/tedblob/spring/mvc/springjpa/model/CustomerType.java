package com.tedblob.spring.mvc.springjpa.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerType {

    private String customerType;
    private long count;
}
