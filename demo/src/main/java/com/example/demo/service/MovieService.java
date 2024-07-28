package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository _movieRepository;

    public List<Movie> getAllMovies() {
        return _movieRepository.findAll();
    }

    public Movie saveMovie(Movie movie) {
        return _movieRepository.save(movie);
    }
}
