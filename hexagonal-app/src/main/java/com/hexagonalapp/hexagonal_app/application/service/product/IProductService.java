package com.hexagonalapp.hexagonal_app.application.service.product;

import java.util.List;
import java.util.Optional;

import com.hexagonalapp.hexagonal_app.domain.entities.Product;
// Casos de uso
public interface IProductService {
    Optional<Product> findById(Long id);
    List<Product> getAll();
    Product save(Product product);
}
