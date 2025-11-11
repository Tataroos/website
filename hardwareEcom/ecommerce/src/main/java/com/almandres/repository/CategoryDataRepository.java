package com.almandres.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.almandres.entity.CategoryData;

import java.util.Optional;

@Repository
public interface CategoryDataRepository extends CrudRepository<CategoryData, Integer> {

    Optional<CategoryData> findByName(String name);
}

