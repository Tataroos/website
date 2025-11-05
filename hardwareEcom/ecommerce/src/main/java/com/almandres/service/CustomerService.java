package com.almandres.service;

import com.almandres.entity.CustomerData;
import com.almandres.model.Customer;

public interface CustomerService {

    CustomerData findOrCreateCustomer(Customer customerModel);
}
