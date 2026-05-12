package com.urbandrip.catalogservice.dto;

import lombok.Data;

@Data

public class ProductDTO {

    private String name;

    private String brand;

    private Double price;

    private Integer stock;

    private String category;
}
