package dev.durgesh.EcomProductService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Product extends BaseModel {
    private String title;
    private double price;
    private String description;
    private String category;
    private String imageURl;
    private double rating;
}
