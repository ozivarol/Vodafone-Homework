package com.backend.example.repositories;

import com.backend.example.models.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRole(final String role);

}
