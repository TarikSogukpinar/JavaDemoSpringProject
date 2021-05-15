package com.example.demo.business.abstracts;

import com.example.demo.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
