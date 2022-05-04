
package com.Multiplex.service;
//import me.jysh.cinematic.model.User;
import com.Multiplex.entities.Users;
import java.util.List;
import com.Multiplex.exception.UserNotFoundException;
import org.springframework.stereotype.Service;


/*public interface UserServices {
  List<Users> getAllUsers();

  Users getUserById(Long user_id);

  Users pushUser(Users newUser);

  Users updateUser(Users updatedUser, Long user_id);

  void deleteUserById(Long user_id);
}*/
@Service
public interface UserServices {
	  public List<Users> getAllUsers();

	  public Users getUserById(int user_id) throws UserNotFoundException;

	  public Users pushUser(Users newUser);

	  public Users updateUser(Users updatedUser, int user_id);

	  public void deleteUserById(int user_id);
	 
}