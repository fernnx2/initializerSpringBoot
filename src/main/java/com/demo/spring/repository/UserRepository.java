package com.demo.spring.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.demo.spring.model.User;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("SELECT u FROM User u WHERE u.firstName like %?1%")
    List<User> findByNameWhith(String firstName);

    List<User> findByRol(@Param("id") int id);
    
}
