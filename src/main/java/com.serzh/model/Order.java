package com.serzh.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.ResourceSupport;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order extends ResourceSupport {

    private String orderId;
    private double price;
    private int quantity;

}