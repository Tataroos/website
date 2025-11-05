package com.almandres.repository;

import com.almandres.entity.CategoryData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryDataRepository extends CrudRepository<CategoryData, Integer> {

    Optional<CategoryData> findByName(String name);
}

