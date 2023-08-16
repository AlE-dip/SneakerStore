package com.ale.sneakerstoreapi;

import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.service.*;
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

//		Observable<String> observable = Observable.fromCallable(() -> {
//			Thread.sleep(3000);
//			return "hear";
//		});
//		observable.subscribeOn(Schedulers.io());
//		observable.subscribe(s -> System.out.println(s));
//		System.out.println("tear");



	}

}
