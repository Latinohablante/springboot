package com.sakilacampus.sakila_campus.domain.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "rents")
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rent_date")
    private LocalDateTime rentdate;

    @ManyToOne
    Inventory inventories;

    @ManyToOne
    Customer customers;

    @ManyToOne
    Employee employees;

    @Column(name = "last_update", columnDefinition = "TIMESTAMP")
    private LocalDateTime lastupdate;

    public Rent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getRentdate() {
        return rentdate;
    }

    public void setRentdate(LocalDateTime rentdate) {
        this.rentdate = rentdate;
    }

    public Inventory getInventories() {
        return inventories;
    }

    public void setInventories(Inventory inventories) {
        this.inventories = inventories;
    }

    public Customer getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    public Employee getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employees) {
        this.employees = employees;
    }

    public LocalDateTime getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(LocalDateTime lastupdate) {
        this.lastupdate = lastupdate;
    }

    
}
