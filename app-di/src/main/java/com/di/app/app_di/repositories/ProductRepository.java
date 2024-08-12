package com.di.app.app_di.repositories;

import java.util.List;

import com.di.app.app_di.models.Product;

public interface ProductRepository {
    Product findById(Long id);
    List<Product> findAll();
}
