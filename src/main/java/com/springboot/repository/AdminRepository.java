package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	Admin findByUsername(String username);
	
}
