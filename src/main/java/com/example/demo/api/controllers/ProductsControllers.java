package com.example.demo.api.controllers;

import com.example.demo.business.abstracts.ProductService;
import com.example.demo.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductsControllers {

    private ProductService productService;

    @Autowired
    public ProductsControllers(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/getall")
    public List<Product> getAll() {
        return this.productService.getAll();
    }
}
