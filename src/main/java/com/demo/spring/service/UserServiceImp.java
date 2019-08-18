package com.demo.spring.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.model.User;
import com.demo.spring.repository.UserRepository;



@Service
public class UserServiceImp implements UserService {


	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return this.userRepository.findAll();
	}

	

	@Override
	public User update(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public void eliminar(User user) {
		this.userRepository.delete(user);
	}

	@Override
	public User findById(int id) {
		return this.userRepository.getOne(id);
	}

	@Override
	public List<User> findByRol(int id) {
		return this.userRepository.findByRol(id);
	}

	@Override
	public List<User> searchByName(String name) {
		return this.userRepository.findByNameWhith(name);
	}
	
	
	
}
