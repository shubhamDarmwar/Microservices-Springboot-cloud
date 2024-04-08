package com.lightning.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lightning.entity.Address;
import com.lightning.request.CreateAddressRequest;
import com.lightning.response.AddressResponse;
import com.lightning.service.AddressService;

@RestController
@RequestMapping("/api/address")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@PostMapping("/create")
	public AddressResponse createAddress(@RequestBody CreateAddressRequest createAddressRequest) {
		Address persisted = addressService.createAddress(createAddressRequest);
		return new AddressResponse(persisted);
				
	}
	
	@GetMapping("getById/{id}")
	public AddressResponse getAddress(@PathVariable long id) {
		Optional<Address> persisted = addressService.getAddress(id);
		
		return new AddressResponse(persisted.get());
	}
}
