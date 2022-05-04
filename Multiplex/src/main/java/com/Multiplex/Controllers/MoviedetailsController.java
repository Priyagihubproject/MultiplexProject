
package com.Multiplex.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.Multiplex.entities.Moviedetails;

import com.Multiplex.service.MoviedetailsServices;


@RestController
public class MoviedetailsController {
	@Autowired
	private MoviedetailsServices moviedetailsServices;
	
	
	@RequestMapping("/moviedetail")
	public String moviedetails() {
		return "this is movie_details list";
	}
	@GetMapping("/moviedetails")
	public List<Moviedetails> getMoviesdetails(){
		return this.moviedetailsServices.getMoviedetails();
	}
	
	 
}