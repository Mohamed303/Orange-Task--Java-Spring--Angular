package com.orange.task.Controllers;


import com.orange.task.Models.Product;
import com.orange.task.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class ProductController {

    @Autowired
    private ProductService productSerivce;
// return all products
    @GetMapping("")
    public List<Product> getProducts()
    {
        return (List<Product>) productSerivce.findAll();

    }
    //return product by passed id
    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable long id)
    {
        return productSerivce.findById(id);
    }
    //add new product
    @PostMapping("")
    public Product createProduct(@RequestBody Product product)
    {
        return productSerivce.save(product);
    }
    //update product attributes
    @PutMapping("")
    public Product updateProduct(@RequestBody Product product)
    {
        return productSerivce.save(product);

    }
// delete product
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id)
    {
        productSerivce.deleteById(id);

    }

}