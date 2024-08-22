package com.sakilacampus.sakila_campus.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sakilacampus.sakila_campus.domain.entities.Country;

public interface CountryRepository extends JpaRepository <Country, Integer>{
    //CREO MI PROPIA CONSULTA CON QUERY 
     @Query( value = "select p from pais p where p.nombre=?1", nativeQuery = true)
    Optional<Country> buscar(String name);
}
