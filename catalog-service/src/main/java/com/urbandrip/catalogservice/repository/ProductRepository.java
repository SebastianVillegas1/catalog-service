package com.urbandrip.catalogservice.repository;

import com.urbandrip.catalogservice.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>{
}
