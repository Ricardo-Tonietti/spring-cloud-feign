package com.silverfox.spring.feign.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silverfox.spring.feign.api.client.UserClient;
import com.silverfox.spring.feign.api.dto.UserResponse;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringCloudFeingApplication {

	@Autowired
	private UserClient client;

	@GetMapping("/findAllUser")
	public List<UserResponse> getAllUser() {
		return client.getUser();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeingApplication.class, args);
	}

}
