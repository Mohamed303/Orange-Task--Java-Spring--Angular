package com.orange.task.Services;

import com.orange.task.Models.Category;
import com.orange.task.Models.Product;
import com.orange.task.Repositories.CategoryRepository;
import com.orange.task.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    public List<Category> findAll()
    {
        return (List<Category>) categoryRepository.findAll();
    }

    public Optional<Category> findById(long id)
    {

        return categoryRepository.findById(id);
    }
    public Category getOne(long id)
    {
        return categoryRepository.getOne(id);
    }

    public List<Product> getProductsInCategory(long id)
    {
        return productRepository.getProductsByCategory(categoryRepository.getOne(id));
    }

    public Category save(Category pro)
    {
        return categoryRepository.save(pro);
    }

    public void deleteById(long id)
    {
        categoryRepository.deleteById(id);

    }

}