package com.Multiplex.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_Ticket")

public class Booking {
	@Id
	private int book_id;
	private int seats;
	private int date;
	private int time;
	public Booking(int book_id, int seats, int date, int time) {
		super();
		this.book_id = book_id;
		this.seats = seats;
		this.date = date;
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Booking [book_id=" + book_id + ", seats=" + seats + ", date=" + date + ", time=" + time + "]";
	}

	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}