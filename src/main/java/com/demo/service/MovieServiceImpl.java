package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.MovieDao;
import com.demo.entity.MovieManager;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao mDao;
	
	@Override
	public List<MovieManager> getAllMovies() {
		return mDao.findAll();
	}

	@Override
	public Optional<MovieManager> getMoviesById(int id) {
		return mDao.findById(id);
	}

	@Override
	public MovieManager addMovie(MovieManager movie) {
		return mDao.save(movie);
	}

	@Override
	public MovieManager updateMovie(MovieManager movie) {
		return mDao.save(movie);
	}

	@Override
	public String deleteMovie(int id) {
		mDao.deleteById(id);
		return "Movie deleted successfully!";
	}

}
