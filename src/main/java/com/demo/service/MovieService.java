package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.entity.MovieManager;

public interface MovieService {

	List<MovieManager> getAllMovies();

	Optional<MovieManager> getMoviesById(int id);

	MovieManager addMovie(MovieManager movie);

	MovieManager updateMovie(MovieManager movie);

	String deleteMovie(int id);

}
