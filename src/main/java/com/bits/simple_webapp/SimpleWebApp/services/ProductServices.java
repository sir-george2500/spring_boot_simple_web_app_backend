package com.bits.simple_webapp.SimpleWebApp.services;

import com.bits.simple_webapp.SimpleWebApp.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServices
{
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"phone",2000),
            new Product(102,"cloth",3000),
            new Product(103,"Band",9000)
    ));
    public List<Product> getProduct(){
        return products;
    }

   public Product getProductById(int prodId){
        return products.stream()
                .filter(p->p.getProdId() == prodId)
                .findFirst().get();
   }

   public void addProduct(Product prod){
        products.add(prod);
   }

}
