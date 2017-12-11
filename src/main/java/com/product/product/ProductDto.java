package com.product.product;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ProductDto {
    private String id;
    @NotNull
    private String name;
    @NotNull
    private String brand;
    @NotNull
    private String typeId;
    @NotNull
    private double price;
    @NotNull
    private String imageURL;

    public ProductDto(String name, String brand, String typeId, double price, String imageURL){
        this.name = name;
        this.brand = brand;
        this.typeId = typeId;
        this.price = price;
        this.imageURL = imageURL;
    }
}
