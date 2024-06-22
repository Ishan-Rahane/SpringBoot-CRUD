package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.MovieManager;

public interface MovieDao extends JpaRepository<MovieManager,Integer> {

}
