package com.example.gradle.springboot.crud.GradleSpringbootApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gradle.springboot.crud.GradleSpringbootApplication.entity.Userentity;
import com.example.gradle.springboot.crud.GradleSpringbootApplication.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;

	public List<Userentity> getallUsers() {
		return repo.findAll();
	}


	public Userentity createUsers(Userentity user) {
		
		return repo.save(user);
	}


	public void deleteUserById(int userid) {
		repo.deleteById(userid);

	}
	
}

		
		
		
	


