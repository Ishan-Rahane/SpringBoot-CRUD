package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.MovieManager;
import com.demo.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService mService;

	@GetMapping("/movies")
	public List<MovieManager> getAllMovies()
	{
		return mService.getAllMovies();
	}
	
	@GetMapping("/movies/{id}")
	public Optional<MovieManager> getMoviesById(@PathVariable int id)
	{
		return mService.getMoviesById(id);
	}
	
	@PostMapping("/movies")
	public MovieManager addMovie(@RequestBody MovieManager movie)
	{
		return mService.addMovie(movie);
	}
	
	@PutMapping("/movies")
	public MovieManager updateMovie(@RequestBody MovieManager movie)
	{
		return mService.updateMovie(movie);
	}
	
	@DeleteMapping("/movies/{id}")
	public String deleteMovie(@PathVariable int id)
	{
		return mService.deleteMovie(id);
	}
	
	
}
