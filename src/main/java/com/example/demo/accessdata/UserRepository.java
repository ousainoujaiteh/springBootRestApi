package com.example.demo.accessdata;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.email = :email AND password = :password")
    User getLoginDetails(@Param("email") String email, @Param("password") String password);
}
