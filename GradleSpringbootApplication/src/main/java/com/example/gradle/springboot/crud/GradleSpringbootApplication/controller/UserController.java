package com.example.gradle.springboot.crud.GradleSpringbootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties.Http;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.gradle.springboot.crud.GradleSpringbootApplication.entity.Userentity;
import com.example.gradle.springboot.crud.GradleSpringbootApplication.service.UserService;

import lombok.Delegate;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/getallusers")
	public List<Userentity> getAllUsers() {
		return service.getallUsers();
		
	}
	
	@PostMapping("/createusers")
	public ResponseEntity<Userentity> CreateUsers(@RequestBody Userentity user) {
		Userentity u1=service.createUsers(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(u1);
		
		
		
	}
	
//	@DeleteMapping("/delete/{userid}")
//	public ResponseEntity<String> deleteUserById(@PathVariable int userid) throws Exception {
//		service.deleteUserById(userid);
//		return ResponseEntity.status(HttpStatus.ACCEPTED).body("userid deleted successfully")  ;
//	
//	}
	
	@DeleteMapping("/delete/{userid}")
	public void deleteUserById(@PathVariable int userid) throws Exception {
		service.deleteUserById(userid);
		
	
	}
	
	@DeleteMapping("/deleteallusers")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteAllUser() {
		service.deleteAllUsers();
		
	
	}
	
	

}
