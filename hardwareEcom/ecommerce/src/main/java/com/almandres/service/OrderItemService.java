package com.almandres.service;
import java.util.List;

import com.almandres.enums.OrderItemStatus;
import com.almandres.model.OrderItem;

public interface OrderItemService {
    List<OrderItem> getAll();
    List<OrderItem> getOrderItems(Integer customerId);
    List<OrderItem> getCartItems(Integer customerId);
    OrderItem create(OrderItem orderItem);
    List<OrderItem> create(List<OrderItem> orderItems);
    OrderItem update(OrderItem orderItem);
    List<OrderItem> update(List<OrderItem> orderItems);
    List<OrderItem> updateStatus(List<Integer> id, OrderItemStatus orderItemStatus);
    OrderItem get(Integer id);
    void delete (Integer id);
}
