package com.example.demo.business.concretes;

import com.example.demo.business.abstracts.ProductService;
import com.example.demo.dataAccess.abstracts.ProductDao;
import com.example.demo.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;
    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }


    @Override
    public List<Product> getAll() {
        return productDao.findAll();

    }
}
