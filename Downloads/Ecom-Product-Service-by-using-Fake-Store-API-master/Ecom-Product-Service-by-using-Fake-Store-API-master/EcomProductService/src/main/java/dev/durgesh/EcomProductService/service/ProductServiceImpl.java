package dev.durgesh.EcomProductService.service;

import dev.durgesh.EcomProductService.dto.FakeStoreProductResponseDTO;
import dev.durgesh.EcomProductService.entity.Product;
import dev.durgesh.EcomProductService.exception.ProductNotFoundException;
import dev.durgesh.EcomProductService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service("productService")
public class ProductServiceImpl implements ProductService{  //will call to db

    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(UUID productId) throws ProductNotFoundException{
        //basic code to implement null check
//        Product savedProduct = productRepository.findById(productId).get();
//        if(savedProduct == null){
//            throw new ProductNotFoundException("Product not found for id: "+ productId);
//        }
//        return savedProduct;
       return productRepository.findById(productId).orElseThrow(
                () -> new ProductNotFoundException("product not found for id: "+ productId)
        );
       //saved code by using lamda
    }

    @Override
    public Product createProduct(Product product) {
        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }

    @Override  //to update product we must need to fetch the product first
    public Product updateproduct(Product updatedProduct, UUID productId) {
        Product savedProduct = productRepository.findById(productId).orElseThrow(
                () -> new ProductNotFoundException("Product not found for id: " + productId)
        );
        //allowing particular product to update not createdAt and updatedAt from BaseModel
        savedProduct.setTitle(updatedProduct.getTitle());
        savedProduct.setCategory(updatedProduct.getCategory());
        savedProduct.setRating(updatedProduct.getRating());
        savedProduct.setImageURl(updatedProduct.getImageURl());
        savedProduct.setPrice(updatedProduct.getPrice());
        savedProduct.setDescription(updatedProduct.getDescription());
        savedProduct = productRepository.save(savedProduct);
        return savedProduct;
    }

    @Override
    public boolean deleteProduct(UUID prouctId) {
        productRepository.deleteById(prouctId);
        return true;
    }
}
