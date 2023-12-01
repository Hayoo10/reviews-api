package com.reviews.DAL.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reviews.model.Users;



public interface userRepository extends JpaRepository<Users, Long> {

    Users findByUsername(String username);
  
    
}