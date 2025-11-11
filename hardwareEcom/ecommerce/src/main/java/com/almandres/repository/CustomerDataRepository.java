package com.almandres.repository;

import org.springframework.data.repository.CrudRepository;

import com.almandres.entity.CustomerData;

public interface CustomerDataRepository extends CrudRepository<CustomerData, Integer> {
    
    CustomerData findByFirstnameAndLastname(String firstname, String lastname);
}

