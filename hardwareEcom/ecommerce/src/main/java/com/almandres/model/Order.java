package com.almandres.model;

import lombok.Data;
import java.util.List;

@Data
public class Order {
    private int id;
    private Customer customer;
    private List<OrderItem> items;
    private double totalPrice;
    private int totalQuantity;
}

