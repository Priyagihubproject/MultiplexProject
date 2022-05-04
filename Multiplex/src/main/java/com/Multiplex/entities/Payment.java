package com.Multiplex.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
	
	@Id
	private int payment_id;
	private int cost;
	private int total_seats;
	public Payment(int payment_id,int cost, int total_seats) {
		super();
		this.payment_id=payment_id;
		this.cost = cost;
		this.total_seats = total_seats;
	}
	
	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", cost=" + cost + ", total_seats=" + total_seats + "]";
	}

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getTotal_seats() {
		return total_seats;
	}
	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}
	

}