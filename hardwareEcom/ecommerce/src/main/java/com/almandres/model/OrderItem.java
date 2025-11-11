package com.almandres.model;
import lombok.Data;

import java.util.*;

import com.almandres.enums.OrderItemStatus;

@Data
public class OrderItem {
    int id;
    int orderId;
    int customerId;
    String customerName;
    int productId;
    String productName;
    String productDescription;
    String productCategoryName;
    String productImageFile;
    String productUnitOfMeasure;
    double quantity;
    double price;
    OrderItemStatus status;
    Date created;
    Date lastUpdated;
}
