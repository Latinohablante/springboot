package com.sakilacampus.sakila_campus.service.country;

import java.util.Optional;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sakilacampus.sakila_campus.domain.entities.Country;

public interface CountryInterface {
    Page<Country> findAll(Pageable pageable);

    Optional<Country> findById(Integer id);

    Country createOne(Country country);
    
    Country updateOneById(Integer id , Country country); 

    Optional<Country> delete(Integer id);

    Optional<Country> buscar(String name);  
}
