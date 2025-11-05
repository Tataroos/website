package com.almandres.repository;

import com.almandres.entity.CustomerData;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDataRepository extends CrudRepository<CustomerData, Integer> {
    
    CustomerData findByFirstnameAndLastname(String firstname, String lastname);
}

