package com.tedblob.spring.mvc.springjpa.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
/*@SqlResultSetMapping(
        name="customerTypeMapping",
        classes = @ConstructorResult(
                targetClass = CustomerType.class,
                columns = {
                        @ColumnResult(name = "customer_type", type = String.class),
                        @ColumnResult(name = "count", type = long.class)
                }))

@NamedNativeQuery(name = "Customer.totalCustomersByType",
        resultClass = CustomerType.class,
        resultSetMapping ="customerTypeMapping",
        query = "SELECT c.customer_type, COUNT(c.customer_type) AS count FROM Customer AS c GROUP BY c.customer_type"
)*/
@SqlResultSetMapping(
        name="customerTypeMapping",
        classes = {
                @ConstructorResult(
                    targetClass = CustomerType.class,
                    columns = {
                            @ColumnResult(name = "customer_type", type = String.class),
                            @ColumnResult(name = "count", type = long.class)
                    }),
                @ConstructorResult(
                        targetClass = CustomerType.class,
                        columns = {
                                @ColumnResult(name = "customer_type", type = String.class),
                                @ColumnResult(name = "count", type = long.class)
                        })
        })

@NamedNativeQuery(name = "Customer.totalCustomersByType",
        resultClass = CustomerType.class,
        resultSetMapping ="customerTypeMapping",
        query = "SELECT c.customer_type, COUNT(c.customer_type) AS count FROM Customer AS c GROUP BY c.customer_type"
)
@NamedNativeQuery(name = "Customer.totalCustomersWithPrefixK",
        resultClass = CustomerPrefixA.class,
        resultSetMapping ="customerTypeMapping",
        query = "SELECT c.name, COUNT(c.name) AS count" +
                " FROM Customer AS c GROUP BY c.name LIKE 'K%"
)
public class Customer {

    @Id
    private String id;
    private String name;
    private String customer_type;

}
