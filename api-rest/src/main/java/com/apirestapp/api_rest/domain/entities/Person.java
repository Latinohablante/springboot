package com.apirestapp.api_rest.domain.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Person {
    @Id
    @Column(name = "id_person", columnDefinition = "VARCHAR(20)", nullable=false)
    private String idperson;
    @Column(name = "first_name", columnDefinition = "VARCHAR(50)", nullable=false)
    private String firstname;
    @Column(name = "last_name", columnDefinition = "VARCHAR(50)", nullable=false)
    private String lastname;

    @ManyToOne
    City cities;

    @ManyToOne
    TypePerson typepersons;

    public TypePerson getTypepersons() {
        return typepersons;
    }

    public void setTypepersons(TypePerson typepersons) {
        this.typepersons = typepersons;
    }

    public Person() {
    }

    public String getIdperson() {
        return idperson;
    }

    public void setIdperson(String idperson) {
        this.idperson = idperson;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public City getCities() {
        return cities;
    }

    public void setCities(City cities) {
        this.cities = cities;
    }
      

    

    
}
