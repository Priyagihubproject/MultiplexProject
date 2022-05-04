package com.Multiplex.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Multiplex.dao.MoviedetailsDAO;
import com.Multiplex.entities.Moviedetails;



@Service
public class MoviedetailsServicesImpl implements MoviedetailsServices {
	
	@Autowired
	private MoviedetailsDAO moviesdetailsDao;
	
	@Override
	public List<Moviedetails>getMoviedetails(){
		return moviesdetailsDao.findAll();
	}


}