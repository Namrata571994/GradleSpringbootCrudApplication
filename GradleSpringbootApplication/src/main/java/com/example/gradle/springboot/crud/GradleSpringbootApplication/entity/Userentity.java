package com.example.gradle.springboot.crud.GradleSpringbootApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
public class Userentity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	
	private String username;
	
	private int salary;
	
	

	public Userentity() {
		super();
	}

	public Userentity(int userid, String username, int salary) {
		super();
		this.userid = userid;
		this.username = username;
		this.salary = salary;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Userentity [userid=" + userid + ", username=" + username + ", salary=" + salary + "]";
	}
	
	
	
	
	

}
