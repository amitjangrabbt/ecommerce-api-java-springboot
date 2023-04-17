package com.bytequest.ecommerce.service.interfac;

import com.bytequest.ecommerce.collection.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getAllProducts();
    public Product getProductById(Long id);
    public Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    public boolean deleteProduct(Long id);
}
