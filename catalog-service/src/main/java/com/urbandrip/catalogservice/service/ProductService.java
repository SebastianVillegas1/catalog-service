package com.urbandrip.catalogservice.service;

import com.urbandrip.catalogservice.dto.ProductDTO;
import com.urbandrip.catalogservice.model.Product;
import com.urbandrip.catalogservice.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class ProductService {

    @Autowired
    private ProductRepository repository;

    // CREAR PRODUCTO
    public Product createProduct(ProductDTO dto){

        Product product = new Product();

        product.setName(dto.getName());
        product.setBrand(dto.getBrand());
        product.setPrice(dto.getPrice());
        product.setStock(dto.getStock());
        product.setCategory(dto.getCategory());

        return repository.save(product);
    }

    // OBTENER TODOS
    public List<Product> getProducts(){

        return repository.findAll();
    }

    // BUSCAR POR ID
    public Product getProductById(Long id){

        return repository.findById(id).orElse(null);
    }
}
