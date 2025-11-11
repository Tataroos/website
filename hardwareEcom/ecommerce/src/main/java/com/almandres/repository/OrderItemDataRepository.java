package com.almandres.repository;

import org.springframework.data.repository.CrudRepository;

import com.almandres.entity.OrderItemData;

public interface OrderItemDataRepository extends CrudRepository<OrderItemData, Integer> {

}

