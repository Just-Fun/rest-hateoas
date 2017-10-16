package com.serzh.service;


import com.serzh.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrdersForCustomer(String customerId);

    Order getOrderByIdForCustomer(String customerId, String orderId);

}
