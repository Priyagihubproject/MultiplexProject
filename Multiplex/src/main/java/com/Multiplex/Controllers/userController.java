package com.Multiplex.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import com.Multiplex.exception.UserNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import com.Multiplex.entities.Users;
//import me.jysh.cinematic.model.User;
import com.Multiplex.service.UserServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class userController {

@Autowired
private UserServices userServices;

@RequestMapping("/user")
public String user() {
return "This is users list page";
}

@GetMapping("/userslist")
public List<Users> getAllUsers() throws UserNotFoundException {
return this.userServices.getAllUsers();
}

@GetMapping(value="/viewUsers/{user_id}")
public ResponseEntity getUserById(@PathVariable("user_id") int user_id) throws UserNotFoundException {
return new ResponseEntity(userServices.getUserById(user_id),HttpStatus.OK);
}

@PostMapping("/users")
public Users pushUser(@RequestBody Users users) {
	 return this.userServices.pushUser(users);
}

@DeleteMapping("/deleteUsers/{user_id}")
public void deleteUserById(@PathVariable int user_id) {
	this.userServices.deleteUserById(user_id);
	//return "deleted";
}

@PutMapping("/updateUsers")
public Users updateUser(@RequestBody Users users, int user_id) {
	return this.userServices.updateUser(users, user_id);
}

}