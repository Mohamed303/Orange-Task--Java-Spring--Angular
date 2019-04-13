package com.orange.task.Controllers;


import com.orange.task.Models.Category;
import com.orange.task.Models.Product;
import com.orange.task.Services.CategoryService;
import com.orange.task.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

// return all categories
    @GetMapping("")
    public List<Category> getCategories()
    {

        return (List<Category>) categoryService.findAll();
    }
    //return category by passed id
        @GetMapping("/{id}")
    public Optional<Category> getCategory(@PathVariable long id)
    {

        return categoryService.findById(id);
    }
    //return category and his products by id
    @GetMapping("/{id}/products")
    public List<Product> getProductsInCategory(@PathVariable long id)
    {
        return productService.getProductsByCat(id);
    }
    //add new category
    @PostMapping("")
    public Category createCategory(@RequestBody Category category)
    {
        return categoryService.save(category);
    }
    // rename or fully update category attributes
    @PutMapping("")
    public Category updateCategory(@RequestBody Category category)
    {
        return categoryService.save(category);

    }
    //get all product in category and delete it then delete category
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable long id)
    {
        List<Product> list=getProductsInCategory(id);
        for (Product p:list) {
            productService
          .deleteById(p.getId());
        }
        categoryService.deleteById(id);

    }

}