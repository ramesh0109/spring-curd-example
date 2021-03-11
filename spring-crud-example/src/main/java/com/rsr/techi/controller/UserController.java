package com.rsr.techi.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsr.techi.entity.User;
import com.rsr.techi.service.UserService;


@RestController
@RequestMapping(value="/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public User saveTicket(@RequestBody User user) {
		
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public User getById(@PathVariable Integer id) {
		
		return userService.findById(id);
	}
	
	@PutMapping("/{id}")
	public User updateUser(@RequestBody User user, @PathVariable Integer id) {
		User getUser = this.userService.findById(id);
		return userService.updateById(getUser);
	}
	
	@GetMapping("/getAll")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable Integer id) {
		User existingUser = this.userService.findById(id);
		this.userService.deleteUser(existingUser);
		return ResponseEntity.ok().build();
	}
}
