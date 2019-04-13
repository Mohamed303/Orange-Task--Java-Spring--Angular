package com.orange.task.Repositories;

import com.orange.task.Models.Category;
import com.orange.task.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> getProductsByCategory(Category category);

}
