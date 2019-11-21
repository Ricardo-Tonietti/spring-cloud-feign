package com.silverfox.spring.feign.api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.silverfox.spring.feign.api.dto.UserResponse;

@FeignClient(name="USER-CLIENT",url="https://jsonplaceholder.typicode.com/")
public interface UserClient {

	@GetMapping("/users")
	public List<UserResponse> getUser();
	
}
