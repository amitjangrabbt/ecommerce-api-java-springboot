package com.bytequest.ecommerce.service.implementation;

import com.bytequest.ecommerce.collection.Product;
import com.bytequest.ecommerce.exception.ResourceNotFoundException;
import com.bytequest.ecommerce.repository.ProductRepository;
import com.bytequest.ecommerce.service.interfac.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        // Logic to retrieve all products from repository
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        // Logic to retrieve product by ID from repository
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
    }

    public Product createProduct(Product product) {
        // Logic to create a new product in repository
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        // Logic to update product by ID in repository
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));

        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());

        return productRepository.save(existingProduct);
    }

    public boolean deleteProduct(Long id) {
        // Logic to delete product by ID from repository
        return productRepository.findById(id).map(product -> {productRepository.delete(product); return true;}).orElse(false);
    }
}
