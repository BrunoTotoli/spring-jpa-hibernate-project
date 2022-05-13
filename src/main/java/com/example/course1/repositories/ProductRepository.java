package com.example.course1.repositories;

import com.example.course1.entities.Category;
import com.example.course1.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
