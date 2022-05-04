package com.Multiplex.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Multiplex.entities.Users;
import java.util.List;

public interface UsersDAO extends JpaRepository<Users,Integer> {
//Users getOne(int user_id);
	@Query("Select u from Users u where u.user_id=user_id")
	List<Users>getUserByID();
}