package dev.durgesh.EcomProductService.mapper;

import dev.durgesh.EcomProductService.dto.ProductResponseDTO;
import dev.durgesh.EcomProductService.entity.Product;

public class ProductEntityDTOMapper {
    public static ProductResponseDTO converProductEntityToProductResponseDTO(Product product){
        ProductResponseDTO responseDTO = new ProductResponseDTO();
        responseDTO.setTitle(product.getTitle());
        responseDTO.setCategory(product.getCategory());
        responseDTO.setRating(product.getRating());
        responseDTO.setPrice(product.getPrice());
        responseDTO.setImageURL(product.getImageURl());
        responseDTO.setDescription(product.getDescription());
        return responseDTO;
    }
}
