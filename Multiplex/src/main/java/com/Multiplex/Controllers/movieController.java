package com.Multiplex.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Multiplex.entities.Movies;
import com.Multiplex.service.MovieServices;

@RestController
public class movieController {

	@Autowired

	private MovieServices movieServices;

	@RequestMapping("/movie")
	public String movie() {
		return "this is movie list";
	}
	@GetMapping("/movies")
	public List<Movies> getMovies() {
		return this.movieServices.getMovies();
	}
	@GetMapping(value="/movies/{movieid}")
	 public ResponseEntity getMovieById(@PathVariable ("movieid") int movieid) {
		  	return new ResponseEntity(movieServices.getMovieById(movieid),HttpStatus.OK);
		  	
	  }
	
	  @PostMapping("/movies")
	  public Movies addMovies(@RequestBody Movies movie)  {  
		  return this.movieServices.addMovies(movie);
	  }
	  
	  @PutMapping("/movies")
	  public Movies updateMovies(@RequestBody Movies movie)
	 {
		  return this.movieServices.updateMovies(movie); 
		  } 
	  
	  @DeleteMapping("/movies/{movieid}")
	  public void deleteMovies(@PathVariable int movieid) {
		   this.movieServices.deleteMoviesById(movieid);
		  } 
	  @GetMapping("/movieByName")
	  public List<Movies> getMovieByName(){
		  return this.movieServices.getMovieByName();
	  }
}