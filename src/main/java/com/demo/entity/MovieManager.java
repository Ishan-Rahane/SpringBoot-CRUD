package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MovieManager {

	@Id
	@GeneratedValue
	int movieId;
	String movieName;
	String budget;
	String boxOfficeCollection;
	
	public MovieManager(String movieName, String budget, String boxOfficeCollection) {
		super();
		this.movieName = movieName;
		this.budget = budget;
		this.boxOfficeCollection = boxOfficeCollection;
	}

	public MovieManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getBoxOfficeCollection() {
		return boxOfficeCollection;
	}

	public void setBoxOfficeCollection(String boxOfficeCollection) {
		this.boxOfficeCollection = boxOfficeCollection;
	}

	@Override
	public String toString() {
		return "MovieManager [movieId=" + movieId + ", movieName=" + movieName + ", budget=" + budget
				+ ", boxOfficeCollection=" + boxOfficeCollection + "]";
	}
	
}
