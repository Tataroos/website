package com.almandres.ecommerce.entity;

// We will create this 'enums' package in a later step
// import com.almandres.ecommerce.enums.OrderItemStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*; //
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "order_item_data")
@Data
public class OrderItemData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "productDescription", length = 500)
    private String productDescription;

    @Column(name = "productCategoryName")
    private String productCategoryName;

    @Column(name = "productImageFile")
    private String productImageFile;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "status")
    private Integer status;

    @CreationTimestamp
    @Column(name = "dateCreated")
    private Date created;
    
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private OrderData order;
}