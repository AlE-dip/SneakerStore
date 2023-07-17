package com.ale.sneakerstoreapi;

import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.service.ProductDetailService;
import com.ale.sneakerstoreapi.service.ProductService;
import com.ale.sneakerstoreapi.service.ProductSizeService;
import com.ale.sneakerstoreapi.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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
			userService.save(
					new User().builder()
							.username("customer")
							.password("customer")
							.role(User.Role.CUSTOMER)
							.build()
			);
		}

	}

}
