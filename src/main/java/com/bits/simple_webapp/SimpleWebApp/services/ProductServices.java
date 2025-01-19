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

    public void updateProduct(Product prod) {

        //loop and get the product by ID then set it
        int index = 0;

        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getProdId() == prod.getProdId()){
                index = i;
            }
        }

        products.set(index,prod);
    }
}
