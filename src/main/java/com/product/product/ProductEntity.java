package com.product.product;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductEntity {
    @Id
    private String id;

    private String name;

    private String brand;

    private String typeId;

    private double price;

    private String imageURL;

    @Override
    public String toString() {
        return String.format(
                "Product[id=%s, name='%s', brand='%s', typeId='%s', price='%f%n', imageURL='%s']",
                id, name, brand, typeId, price, imageURL);
    }

}
