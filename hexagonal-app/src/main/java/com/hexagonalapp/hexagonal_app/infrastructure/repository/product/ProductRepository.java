package com.hexagonalapp.hexagonal_app.infrastructure.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexagonalapp.hexagonal_app.domain.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

} 