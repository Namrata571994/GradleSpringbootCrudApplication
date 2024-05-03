package com.example.gradle.springboot.crud.GradleSpringbootApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gradle.springboot.crud.GradleSpringbootApplication.entity.Userentity;

@Repository
public interface UserRepository extends JpaRepository<Userentity, Integer> {

}
