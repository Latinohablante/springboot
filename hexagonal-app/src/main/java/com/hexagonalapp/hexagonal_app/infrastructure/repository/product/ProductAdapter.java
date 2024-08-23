package com.hexagonalapp.hexagonal_app.infrastructure.repository.product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexagonalapp.hexagonal_app.application.service.product.IProductService;
import com.hexagonalapp.hexagonal_app.domain.entities.Product;

// Implementación del caso de uso

@Service
public class ProductAdapter implements IProductService{
    @Autowired
    private ProductRepository productrepository;

    @Override
    public Optional<Product> findById(Long id) {
        return productrepository.findById(id);
    }

    @Override
    public List<Product> getAll() {
        return productrepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productrepository.save(product);
    }
}
