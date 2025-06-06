package com.projects.movieApi.auth.repositories;

import com.projects.movieApi.auth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User,Integer> {


    Optional<User> findByEmail(String username);
}