package dev.durgesh.EcomProductService.controller;

import dev.durgesh.EcomProductService.dto.FakeStoreProductResponseDTO;
import dev.durgesh.EcomProductService.entity.Product;
import dev.durgesh.EcomProductService.exception.InvalidInputException;
import dev.durgesh.EcomProductService.exception.RandomException;
import dev.durgesh.EcomProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ProductController {

    @Autowired
    @Qualifier("productService")
    private ProductService productService;

    //GET ALL PRODUCT
    @GetMapping("/product")
    public ResponseEntity getAllProducts(){
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity getProductById(@PathVariable("id") UUID id){
        if(id == null){
            throw new InvalidInputException("Input is not correct");
        }
        Product product = productService.getProduct(id);
        return ResponseEntity.ok(product);
    }


    @PutMapping("/product/{id}")
    public ResponseEntity updateProduct(@PathVariable("id") UUID id, @RequestBody Product product){
        Product updatedProduct = productService.updateproduct(product,id);
        return ResponseEntity.ok(updatedProduct);
    }

    @PostMapping("/product")
    public ResponseEntity createProduct(@RequestBody Product product){
        Product savedProduct = productService.createProduct(product);
        return ResponseEntity.ok(savedProduct);
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity deleteProduct(@PathVariable("id") UUID id){
        if (id == null) {
            throw new InvalidInputException("Product ID is required");
        }
        return ResponseEntity.ok(
                productService.deleteProduct(id));
    }




/*
    //used for demo of controller advice
    @GetMapping("/productexception")
    public ResponseEntity getProductException(){
        throw new RandomException("Exception from product");
    }
 */

}
