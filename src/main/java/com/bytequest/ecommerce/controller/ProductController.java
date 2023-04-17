package com.bytequest.ecommerce.controller;

import com.bytequest.ecommerce.collection.Product;
import com.bytequest.ecommerce.respone.CustomResponseEntity;
import com.bytequest.ecommerce.service.interfac.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ApiOperation(value = "Get all products", notes = "Retrieve a list of all products")
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @ApiOperation(value = "Get product by ID", notes = "Retrieve a product by its ID")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Product found", response = Product.class),
            @ApiResponse(code = 404, message = "Product not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        if (product == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product);
    }

    @ApiOperation(value = "Create a new product", notes = "Create a new product")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Product created", response = Product.class)
    })
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product createdProduct = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }

    @ApiOperation(value = "Update a product", notes = "Update an existing product")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Product updated", response = Product.class),
            @ApiResponse(code = 404, message = "Product not found")
    })
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        Product updatedProduct = productService.updateProduct(id, product);
        if (updatedProduct == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedProduct);
    }

    @ApiOperation(value = "Delete a product", notes = "Delete a product by its ID")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Product deleted"),
            @ApiResponse(code = 404, message = "Product not found")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        boolean deleted = productService.deleteProduct(id);
        if (!deleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }

}
