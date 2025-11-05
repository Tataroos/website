package com.almandres.ecommerce.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customer_data")
@Data
@EqualsAndHashCode(exclude = "orders")
public class CustomerData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "middle_name")
    private String middlename;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "gender")
    private String gender;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<OrderData> orders = new HashSet<>();

    // Helper function
    public void addOrder(OrderData order) {
        if (order != null) {
            if (orders == null) {
                orders = new HashSet<>();
            }
            orders.add(order);
            order.setCustomer(this);
        }
    }
}