package com.example.demo.dataAccess.abstracts;

import com.example.demo.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
