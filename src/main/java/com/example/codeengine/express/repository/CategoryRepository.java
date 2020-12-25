package com.example.codeengine.express.repository;

import com.example.codeengine.express.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> { // connection to database created

    Category findByName(String name);
}
