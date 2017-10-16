package com.serzh.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.ResourceSupport;

import java.util.Map;

@Data
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class Customer extends ResourceSupport {
    private String customerId;
    private String customerName;
    private String companyName;
    private Map<String, Order> orders;

    public Customer(final String customerId, final String customerName, final String companyName) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.companyName = companyName;
    }

}
