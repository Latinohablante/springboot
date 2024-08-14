package com.apirestapp.api_rest.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Region {
    @Id
    @Column(columnDefinition = "VARCHAR(5)", nullable = false)
    private String coderegion;
    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String nameregion;

    @ManyToOne
    @JoinColumn(name = "codecountry_id")
    private Country countries;


    public Region() {
    }
    public String getCoderegion() {
        return coderegion;
    }
    public void setCoderegion(String coderegion) {
        this.coderegion = coderegion;
    }
    public String getNameregion() {
        return nameregion;
    }
    public void setNameregion(String nameregion) {
        this.nameregion = nameregion;
    }

    
}
