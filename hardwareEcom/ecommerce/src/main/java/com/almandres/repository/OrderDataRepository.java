package com.almandres.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.almandres.entity.OrderData;

import java.util.List;

@Repository
public interface OrderDataRepository extends CrudRepository<OrderData, Integer> {

    List<OrderData> findByCustomer_Id(Integer customerId);
}

