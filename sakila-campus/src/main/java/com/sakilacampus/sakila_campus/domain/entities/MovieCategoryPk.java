package com.sakilacampus.sakila_campus.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class MovieCategoryPk implements Serializable{
    @Column(name = "id_movie")
    private Long idmovie;
    @Column(name = "id_category")
    private Long idcategory;
    
    public Long getIdmovie() {
        return idmovie;
    }
    public void setIdmovie(Long idmovie) {
        this.idmovie = idmovie;
    }
    public Long getIdcategory() {
        return idcategory;
    }
    public void setIdcategory(Long idcategory) {
        this.idcategory = idcategory;
    }

    

}
