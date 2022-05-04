package com.Multiplex.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	public Users() {
		super();
	}
	@Id
	private int user_id;
	private String name;
	private int phone_number;
	private String email_id;
	private String password;
	public Users(int user_id, String name, int phone_number, String email_id, String password) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.phone_number = phone_number;
		this.email_id = email_id;
		this.password = password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Users [useer_id=" + user_id + ", name=" + name + "phone_number=" + phone_number + "email_id=" +email_id + "password=" + password + "]";
	}

	
}