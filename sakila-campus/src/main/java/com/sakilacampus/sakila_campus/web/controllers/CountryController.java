package com.sakilacampus.sakila_campus.web.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakilacampus.sakila_campus.domain.entities.Country;
import com.sakilacampus.sakila_campus.service.country.CountryInterface;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/countries")
public class CountryController {
    @Autowired
    private CountryInterface service;

    @GetMapping("/all")
    public ResponseEntity<Page<Country>> findAll(Pageable pageable) {
        Page<Country> countryPage = service.findAll(pageable);

        if (countryPage.hasContent()) {
            return ResponseEntity.ok(countryPage);
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> searchCountry(@PathVariable Integer id) {
        Optional<Country> countryOpt = service.findById(id);
        if (countryOpt.isPresent()){
            return ResponseEntity.ok(countryOpt.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }
    @PostMapping
    public ResponseEntity<Country> create(@Valid @RequestBody Country country, BindingResult result){
        Country countryNew = service.createOne(country);
        if (result.hasFieldErrors()) {
            return validation(result);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(countryNew);
    }

    private ResponseEntity<?> validation(BindingResult result) {
        Map<String, String> errors = new HashMap<>();

        result.getFieldErrors().forEach(err -> {
            errors.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errors);
    }
    
}
