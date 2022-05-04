package com.Multiplex.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;

import com.Multiplex.entities.Movies;

public interface MoviesDAO extends JpaRepository<Movies,Integer>{

@Query("Select m from Movies m where movie_name='Happy'")
List<Movies>getMovieByName();
}