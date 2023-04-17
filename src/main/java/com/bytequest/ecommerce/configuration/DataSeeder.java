package com.bytequest.ecommerce.configuration;

import com.bytequest.ecommerce.collection.Product;
import com.bytequest.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        // Create and save product fixtures
        Product product1 = new Product();
        product1.setId(1l);
        product1.setName("Product 1");
        product1.setDescription("Description 1");
        product1.setEan("00-00000-00000-0");
        product1.setPrice(9.99);
        productRepository.save(product1);

        Product product2 = new Product();
        product2.setId(2l);
        product2.setName("Product 2");
        product2.setDescription("Description 2");
        product2.setEan("00-00000-00000-0");
        product2.setPrice(19.99);
        productRepository.save(product2);

        // More fixtures can be added here

        // Log a message indicating that the fixtures have been loaded
        System.out.println("Base data fixtures loaded.");
    }
}

