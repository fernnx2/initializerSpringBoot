package com.demo.spring.service;

import java.util.List;

import com.demo.spring.model.Rol;
import com.demo.spring.repository.RolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolServiceImp implements RolService {

    @Autowired
    private  RolRepository rolRepository;

	@Override
	public List<Rol> findAll() {
		return this.rolRepository.findAll();
	}

}  

