package com.demo.spring.service;

import java.util.List;

import com.demo.spring.model.User;

public interface UserService {

	public User save(User user);
	
	public List<User> findAll();
	
	public User findById(Long id);
	
	public void eliminar(User user);
	
	public User update(User user);
	
}
