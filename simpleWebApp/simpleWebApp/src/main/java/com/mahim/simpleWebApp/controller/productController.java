package com.mahim.simpleWebApp.controller;

import com.mahim.simpleWebApp.Model.Product;
import com.mahim.simpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/product")
public class productController {
    @Autowired
    ProductService service;

    @GetMapping
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }


    @PostMapping
    public void addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
    }

    @PutMapping
    public void updateProduct(@RequestBody Product prod) {
        service.updateProduct(prod);
    }

    @DeleteMapping("{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
        service.deleteProduct(prodId);
    }
}
