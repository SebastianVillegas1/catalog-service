package com.urbandrip.catalogservice.controller;

import com.urbandrip.catalogservice.dto.ProductDTO;
import com.urbandrip.catalogservice.model.Product;
import com.urbandrip.catalogservice.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/products")

public class ProductController {

    @Autowired
    private ProductService service;

    // CREAR PRODUCTO
    @PostMapping
    public Product createProduct(
            @RequestBody ProductDTO dto){

        return service.createProduct(dto);
    }

    // OBTENER TODOS
    @GetMapping
    public List<Product> getProducts(){

        return service.getProducts();
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public Product getProductById(
            @PathVariable Long id){

        return service.getProductById(id);
    }
}
