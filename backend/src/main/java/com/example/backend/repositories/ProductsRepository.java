package com.example.backend.repositories;

import java.util.UUID;

import com.example.backend.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, UUID> {}
