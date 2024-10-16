package com.vedruna.ejemplo1.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedruna.ejemplo1.persistance.models.Product;

@Repository
public interface ProductRepositoryI extends JpaRepository<Product, Long>{
    //https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
    Product findByProductName(String productName);
    Product findByProductPrecio(Double ProductPrecio);
    Product findByProductNameAndProductPrecio(String productName, Double productPrecio);
}
