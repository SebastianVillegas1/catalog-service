package com.urbandrip.catalogservice.config;

import com.urbandrip.catalogservice.model.Product;
import com.urbandrip.catalogservice.repository.ProductRepository;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class DataInitializer {

    @Autowired
    private ProductRepository repository;

    @PostConstruct
    public void init(){

        // EVITAR DUPLICADOS
        if(repository.count() == 0){

            Product product1 = new Product(
                    null,
                    "Nike Air Force",
                    "Nike",
                    120000.0,
                    10,
                    "Zapatillas"
            );

            Product product2 = new Product(
                    null,
                    "SpeedCat OG",
                    "Puma",
                    80000.0,
                    15,
                    "Zapatillas"
            );

            Product product3 = new Product(
                    null,
                    "Adidas Campus",
                    "Adidas",
                    95000.0,
                    8,
                    "Zapatillas"
            );

            repository.save(product1);
            repository.save(product2);
            repository.save(product3);

            System.out.println(
                    "Productos iniciales cargados"
            );
        }
    }
}
