package com.almandres.ecommerce.entity;

import lombok.Data;


import javax.persistence.*;


@Data
@Entity
@Table(name = "product_data")
public class ProductData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String category;
    private int quantity;
    private double price;
    private int stock;
}