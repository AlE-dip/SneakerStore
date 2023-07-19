package com.ale.sneakerstoreapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Color color;
    private String imageUrl;
//    private List<String> imageUrlDetails;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @OneToMany(mappedBy = "productDetail", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ProductSize> productSizes;


    public enum Color{
        WHITE,
        BLUE,
        RED,
        BLACK,
        YELLOW,
        PINK
    }
}
