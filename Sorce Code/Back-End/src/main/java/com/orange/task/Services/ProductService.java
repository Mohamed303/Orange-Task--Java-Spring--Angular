package com.orange.task.Services;

import com.orange.task.Models.Product;
import com.orange.task.Repositories.CategoryRepository;
import com.orange.task.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;


    public List<Product> findAll()
    {
        return (List<Product>) productRepository.findAll();
    }

    public Optional<Product> findById(long id)
    {
        return productRepository.findById(id);
    }
    public  List<Product> getProductsByCat(long id)
    {
        return productRepository.getProductsByCategory(categoryRepository.getOne(id));
    }
    public Product save(Product pro)
    {
        return productRepository.save(pro);
    }

    public void deleteById(long id)
    {
        productRepository.deleteById(id);

    }

}