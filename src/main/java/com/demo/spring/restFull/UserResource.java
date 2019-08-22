package com.demo.spring.restFull;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.model.User;
import com.demo.spring.service.UserService;


@RestController
@CrossOrigin
@RequestMapping(path="/user")
public class UserResource {

	@Autowired 
	private UserService userService;
	
	@GetMapping(produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<User> index(){
		return this.userService.findAll();
	}
	
	@GetMapping(path="{id}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public User findById(@PathVariable(value ="id") int id) {
		return this.userService.findById(id);
	}
	
	@PostMapping(consumes= {MediaType.APPLICATION_JSON_VALUE})
	public User store(@RequestBody User user) {
		return this.userService.save(user);
	}
	
	@PutMapping(consumes= {MediaType.APPLICATION_JSON_VALUE})
	public User update(@RequestBody User user) {
		return this.userService.update(user);
	}
	
	@DeleteMapping(path="{id}")
	public void delete(@PathVariable(value="id") int id) {
		User user = new User();
		user.setId(id);
		this.userService.eliminar(user);
	}
	
	@GetMapping(path = "/find")
	public List<User> findByName(@RequestParam(value="search") String search){
		return this.userService.searchByName(search);
	}

	@GetMapping(path = "/find/rol/{id}")
	public List<User> findByName(@PathVariable(value="id") int id){
		return this.userService.findByRol(id);
	}


	
	
	
}
