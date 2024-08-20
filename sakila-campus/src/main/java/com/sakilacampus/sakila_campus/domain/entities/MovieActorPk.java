package com.sakilacampus.sakila_campus.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.time.LocalDateTime;

@Embeddable
public class MovieActorPk implements Serializable {
    @Column(name = "id_movie")
    private Long idmovie;
    
    @Column(name = "id_category")
    private Long idactor;

    @Column(name = "last_update", columnDefinition = "TIMESTAMP")
    private LocalDateTime lastupdate;

    public Long getIdmovie() {
        return idmovie;
    }

    public void setIdmovie(Long idmovie) {
        this.idmovie = idmovie;
    }

    public Long getIdactor() {
        return idactor;
    }

    public void setIdactor(Long idactor) {
        this.idactor = idactor;
    }

    public LocalDateTime getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(LocalDateTime lastupdate) {
        this.lastupdate = lastupdate;
    }

    
}
