package com.backend.example.repositories;

import com.backend.example.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(final String email);

}
