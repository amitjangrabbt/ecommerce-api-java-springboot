package com.bytequest.ecommerce.repository;

import com.bytequest.ecommerce.collection.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends MongoRepository<Product,Long> {
    // Add custom methods for data access operations, if needed
}
