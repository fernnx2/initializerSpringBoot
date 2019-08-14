package com.demo.spring.restFull;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.model.User;
import com.demo.spring.service.UserService;


@RestController
@RequestMapping(path="/user")
public class UserResource {

	@Autowired 
	private UserService userService;
	
	@GetMapping(produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<User> index(){
		return this.userService.findAll();
	}
	
	@GetMapping(path="{id}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public User findById(@PathVariable("id") Long id) {
		return this.userService.findById(id);
	}
	
	@PostMapping(consumes= {MediaType.APPLICATION_JSON_VALUE})
	public User store(User user) {
		return this.userService.save(user);
	}
	
	@PutMapping(consumes= {MediaType.APPLICATION_JSON_VALUE})
	public User update(User user) {
		return this.update(user);
	}
	
	@DeleteMapping(consumes= {MediaType.APPLICATION_JSON_VALUE},params= {"id"})
	public void delete(@PathVariable("id") int id) {
		User user = new User();
		user.setId(id);
		this.userService.eliminar(user);
	}
	
	
	
	
	
}
