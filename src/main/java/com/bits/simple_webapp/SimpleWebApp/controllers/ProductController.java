package com.bits.simple_webapp.SimpleWebApp.controllers;

import com.bits.simple_webapp.SimpleWebApp.models.Product;
import com.bits.simple_webapp.SimpleWebApp.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductController
{
    @Autowired
    ProductServices services;
    @RequestMapping("/products")
    public List<Product> getProducts()
    {
        return services.getProduct();

    }

    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return services.getProductById(prodId);
    }
}
