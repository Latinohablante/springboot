package com.sakilacampus.sakila_campus.domain.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;



@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "El nombre no puede ser nulo")
    @Column(length = 50, nullable = false)
    private String name;

    @Column(name = "last_update", columnDefinition = "TIMESTAMP")
    private LocalDateTime lastupdate;

    public Country() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(LocalDateTime lastupdate) {
        this.lastupdate = lastupdate;
    }
    
}
