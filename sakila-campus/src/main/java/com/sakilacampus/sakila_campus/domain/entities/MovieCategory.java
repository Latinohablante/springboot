package com.sakilacampus.sakila_campus.domain.entities;

import java.sql.Time;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie_categories")
public class MovieCategory {
    @EmbeddedId
    MovieCategoryPk id;
    private Time lastupdate;

    @ManyToOne
    @JoinColumn(name = "id_movie", insertable = false, updatable = false)
    private Movie movies;

    @ManyToOne
    @JoinColumn(name = "id_category", insertable = false, updatable = false)
    private Category categories;

    public MovieCategory() {
    }

    public MovieCategoryPk getId() {
        return id;
    }
    public void setId(MovieCategoryPk id) {
        this.id = id;
    }
    public Time getLastupdate() {
        return lastupdate;
    }
    public void setLastupdate(Time lastupdate) {
        this.lastupdate = lastupdate;
    }
}
