package com.lightning.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lightning.response.AddressResponse;

//@FeignClient(url = "${address.service.url}", value = "address-feign-client", path = "/api/address")
//@FeignClient(value = "address-service", path = "/api/address")// after  enabling eureka service
@FeignClient(value = "api-gateway") // This will redirect all direct calls to address through api-gateway
public interface AddressFeignClient {
//	@GetMapping("getById/{id}")
	@GetMapping("address-service/getById/{id}")//After api gateway 
	public AddressResponse getById(@PathVariable long id);
}
