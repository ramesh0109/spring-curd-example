package com.rsr.techi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsr.techi.entity.User;
import com.rsr.techi.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	public User findById(Integer id) {
		return userRepository.findOne(id);
	}
	
	public User updateById(User user) {
		return userRepository.save(user);
	}
	
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	
	public void deleteUser(User user) {
		userRepository.delete(user);
	}
}
