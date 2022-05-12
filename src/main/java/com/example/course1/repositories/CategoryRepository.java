package com.example.course1.repositories;

import com.example.course1.entities.Category;
import com.example.course1.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
