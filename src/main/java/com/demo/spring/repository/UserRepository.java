package com.demo.spring.repository;

import org.springframework.stereotype.Repository;

import com.demo.spring.model.User;


import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	
}
