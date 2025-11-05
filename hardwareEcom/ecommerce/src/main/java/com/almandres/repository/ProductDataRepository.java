package com.almandres.repository;

import com.almandres.entity.CategoryData;
import com.almandres.entity.ProductData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDataRepository extends CrudRepository<ProductData, Integer> {

    List<ProductData> findByCategory(CategoryData category);

    List<ProductData> findByCategoryName(String categoryName);
}
