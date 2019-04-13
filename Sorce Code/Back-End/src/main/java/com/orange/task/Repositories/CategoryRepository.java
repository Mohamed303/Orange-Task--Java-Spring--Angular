package com.orange.task.Repositories;

import com.orange.task.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

// repository to inject it to Service Bean at the run time
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
