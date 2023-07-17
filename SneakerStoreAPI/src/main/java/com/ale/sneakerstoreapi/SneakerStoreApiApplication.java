package com.ale.sneakerstoreapi;

import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.entity.ProductSize;
import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.service.ProductDetailService;
import com.ale.sneakerstoreapi.service.ProductService;
import com.ale.sneakerstoreapi.service.ProductSizeService;
import com.ale.sneakerstoreapi.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SneakerStoreApiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SneakerStoreApiApplication.class, args);

		UserService userService = context.getBean(UserService.class);
		ProductService productService = context.getBean(ProductService.class);
		ProductDetailService productDetailService = context.getBean(ProductDetailService.class);
		ProductSizeService productSizeService = context.getBean(ProductSizeService.class);

		if(userService.findFirst() == null) {
			userService.save(
					new User().builder()
							.username("admin")
							.password("admin")
							.role(User.Role.ADMIN)
							.build()
			);
		}
//		userService.save(new User(null, "a", "a", "a"));
//
//
//		ProductSize productSize = productSizeService.save(new ProductSize().builder()
//				.price(34)
//				.quantity(22)
//				.size(ProductSize.Size._40)
//				.build()
//		);
//		ProductDetail productDetail = productDetailService.save(new ProductDetail().builder()
//				.productSizes(List.of(productSize))
//				.color(ProductDetail.Color.BLACK)
//				.build());
//
//		Product product = productService.save(
//				new Product().builder()
//						.description("erty")
//						.name("aaaa")
//						.productDetails(List.of(productDetail))
//						.build()
//		);


	}

}
