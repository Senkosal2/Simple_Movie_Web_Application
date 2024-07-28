package com.movie.app.rated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rated {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String rated;

    public Integer getId() { return this.id; }
    public void setId(Integer id) { this.id = id; }

    public String getRated() { return this.rated; }
    public void setRated(String rated) { this.rated = rated; }

    public Rated() {}

    public Rated(Integer id, String rated) {
        this.id = id;
        this.rated = rated;
    }

    public Rated(String rated) {
        this.rated = rated;
    }
}
