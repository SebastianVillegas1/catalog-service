package com.urbandrip.catalogservice.controller;

import com.urbandrip.catalogservice.dto.ProductDTO;
import com.urbandrip.catalogservice.model.Product;
import com.urbandrip.catalogservice.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/products")


public class ProductController {

    @Autowired
    private ProductService service;

    // CREAR PRODUCTO
    @PostMapping
    public ResponseEntity<Product> createProduct(
            @RequestBody ProductDTO dto){

        return new ResponseEntity<>(
                service.createProduct(dto),
                HttpStatus.CREATED
        );
    }

    // OBTENER TODOS
    @GetMapping
    public ResponseEntity<List<Product>> getProducts(){

        return ResponseEntity.ok(
                service.getProducts()
        );
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(
            @PathVariable Long id){

        Product product =
                service.getProductById(id);

        if(product == null){

            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Producto no encontrado");
        }

        return ResponseEntity.ok(product);
    }
}
