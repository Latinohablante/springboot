package com.sakilacampus.sakila_campus.domain.entities;

import java.sql.Time;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie_actors")
public class MovieActor {
    @EmbeddedId
    MovieActorPk id;

    private Time lastupdate;

    @ManyToOne
    @JoinColumn(name = "id_movie", insertable = false, updatable = false)
    private Movie movies;

    @ManyToOne
    @JoinColumn(name = "id_actor", insertable = false, updatable = false)
    private Actor actors;

    public MovieActor() {
    }

    public MovieActorPk getId() {
        return id;
    }

    public void setId(MovieActorPk id) {
        this.id = id;
    }

    public Time getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Time lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Movie getMovies() {
        return movies;
    }

    public void setMovies(Movie movies) {
        this.movies = movies;
    }

    public Actor getActors() {
        return actors;
    }

    public void setActors(Actor actors) {
        this.actors = actors;
    }

}
