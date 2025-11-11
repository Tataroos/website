package com.almandres.service;

import java.util.List;

import com.almandres.model.Product;
import com.almandres.model.ProductCategory;

public interface ProductService {

    List<ProductCategory> listProductCategories();

    Product get(Integer id);

    Product create(Product product);

    Product update(Product product);

    void delete(Integer id);

}

