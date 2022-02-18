package com.backend.example.repositories;

import com.backend.example.models.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findByTitle(final String title);
}
