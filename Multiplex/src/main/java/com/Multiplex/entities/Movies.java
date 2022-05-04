package com.Multiplex.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="movies")

public class Movies 
{
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private int movie_id;
	private  String movie_name;
	public Movies(int movie_id, String movie_name) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
	}
	
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	@Override
	public String toString() {
		return "Movies [movie_id=" + movie_id + ", movie_name=" + movie_name + "]";
	}
}