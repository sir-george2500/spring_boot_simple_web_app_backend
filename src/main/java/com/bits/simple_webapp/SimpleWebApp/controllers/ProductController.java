package com.bits.simple_webapp.SimpleWebApp.controllers;

import com.bits.simple_webapp.SimpleWebApp.models.Product;
import com.bits.simple_webapp.SimpleWebApp.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products") // Base path for all routes in this controller
public class ProductController {

    @Autowired
    ProductServices services;

    // Route: GET /products
    @GetMapping
    public List<Product> getProducts() {
        return services.getProduct();
    }

    // Route: GET /products/{prodId}
    @GetMapping("/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return services.getProductById(prodId);
    }

    // Route: POST /products
    @PostMapping
    public void addProduct(@RequestBody Product prod) {
        services.addProduct(prod); 
    }
}
