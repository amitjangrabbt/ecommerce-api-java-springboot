package com.bytequest.ecommerce.collection;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document("product")
public class Product {
    @Id
    private Long id;
    private String name;
    private String ean;
    private String description;
    private double price;
}
