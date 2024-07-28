package com.movie.app.movie;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private LocalDate dateCreated;

    public Integer getId() { return this.id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    
    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDate getDateCreated() { return this.dateCreated; }
    public void setDateCreated(LocalDate date) { this.dateCreated = date; }

    public Movie() {}

    public Movie(Integer id, String name, String description, LocalDate date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateCreated = date;
    }

    public Movie(Integer id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.dateCreated = date;
    }

    public Movie(String name, String description, LocalDate date) {
        this.name = name;
        this.description = description;
        this.dateCreated = date;
    }

    public Movie(String name, LocalDate date) {
        this.name = name;
        this.dateCreated = date;
    }
}
