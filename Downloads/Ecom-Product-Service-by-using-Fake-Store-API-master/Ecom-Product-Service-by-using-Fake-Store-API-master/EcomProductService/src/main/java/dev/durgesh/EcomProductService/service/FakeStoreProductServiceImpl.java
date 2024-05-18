package dev.durgesh.EcomProductService.service;

import dev.durgesh.EcomProductService.client.FakeStoreClient;
import dev.durgesh.EcomProductService.dto.FakeStoreProductResponseDTO;
import dev.durgesh.EcomProductService.entity.Product;
import dev.durgesh.EcomProductService.exception.NoProductPresentException;
import dev.durgesh.EcomProductService.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("fakeStoreproductService")
public class FakeStoreProductServiceImpl {
    @Autowired
    private FakeStoreClient fakeStoreClient;
    public List<FakeStoreProductResponseDTO> getAllProducts() {
        List<FakeStoreProductResponseDTO> fakeStoreProducts = fakeStoreClient.getAllProduct();
        if(fakeStoreProducts == null){
            throw new NoProductPresentException("No products are found");
        }
        return fakeStoreProducts;
    }


    public FakeStoreProductResponseDTO getProduct(int productId) {
        FakeStoreProductResponseDTO fakeStoreProductResponseDTO = fakeStoreClient.getProductById(productId);
        if(fakeStoreProductResponseDTO == null){
            throw new ProductNotFoundException("Product not found with id: " + productId);
        }
        return fakeStoreProductResponseDTO;
    }


    public Product createProduct(Product product) {
        return null;
    }


    public Product updateproduct(Product updatedProduct, int ProductId) {
        return null;
    }

    public boolean deleteProduct(int prouctId) {
        return false;
    }
}
