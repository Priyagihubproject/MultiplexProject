package com.Multiplex.service;
import com.Multiplex.dao.UsersDAO;
//package me.jysh.cinematic.service.impl;
import com.Multiplex.entities.Users;
//import me.jysh.cinematic.repository.UserRepository;
//import com.Multiplex.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.Multiplex.exception.UserNotFoundException;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices {
    
    @Autowired
	private  UsersDAO usersDao;
    
    /*public UserServicesImpl(UsersDAO userRepository) {
        this.userRepository = userRepository;
    }*/

    @Override
    public List<Users> getAllUsers() {
        return usersDao.findAll();
    }

    
	
	@Override
    public Users getUserById(int user_id) throws UserNotFoundException {
       // return null;
    	//return usersDao.getOne(user_id);
		Users user;
		if(usersDao.findById(user_id).isEmpty()) {
			throw new UserNotFoundException();
		}
		else {
			user=usersDao.findById(user_id).get();
		}
		
		return user;
    }

    @Override
    public Users pushUser(Users user) {
        //return null;
    	usersDao.save(user);
    	return user;
    }

    @Override
    public Users updateUser(Users updatedUser,int user_id) {
        //return null;
    	usersDao.save(updatedUser);
    	//usersDao.save(user_id);
    	return updatedUser;
    }

    
	@Override
    public void deleteUserById(int user_id) {
    	Users obj=usersDao.getById(user_id);
    	usersDao.delete(obj);

    }
}