package com.serzh.service;

import com.serzh.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> allCustomers();

    Customer getCustomerDetail(final String id);

}
