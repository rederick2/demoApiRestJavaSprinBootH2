package com.example.demoapirest.dao;

import com.example.demoapirest.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String user);
}
