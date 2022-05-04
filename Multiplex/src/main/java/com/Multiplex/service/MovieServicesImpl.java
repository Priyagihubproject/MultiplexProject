package com.Multiplex.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Multiplex.dao.MoviesDAO;
import com.Multiplex.entities.Movies;
import com.Multiplex.exception.MovieNotFoundException;
//import com.Multiplex.exceptions.EmptyInputException;

@Service
public class MovieServicesImpl implements MovieServices{
	@Autowired
	private MoviesDAO moviesDao;

	@Override
	public List<Movies> getMovies() {
		
		return moviesDao.findAll();
			
	}

	@Override
	public Movies getMovieById(int movieid) throws MovieNotFoundException{
		Movies movie;
		if(moviesDao.findById(movieid).isEmpty()) {
			throw new MovieNotFoundException();
		}
		else {
			movie=moviesDao.findById(movieid).get();
		}
		
		return movie;
	}

	@Override
	public Movies addMovies(Movies movie){
		moviesDao.save(movie);
		return movie;
	}

	@Override
	public void deleteMoviesById(int movieid) {
		
		Movies obj = moviesDao.getById(movieid);
		moviesDao.delete(obj);
	}

	@Override
	public Movies updateMovies(Movies movie) {
		// TODO Auto-generated method stub
		moviesDao.save(movie);
		return movie;
	}

	@Override
	public List<Movies> getMovieByName() {
		// TODO Auto-generated method stub
		
		return moviesDao.getMovieByName();
	}	
}