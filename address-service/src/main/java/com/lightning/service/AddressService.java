package com.lightning.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightning.entity.Address;
import com.lightning.repository.AddressRepository;
import com.lightning.request.CreateAddressRequest;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;
	
	public Address createAddress(CreateAddressRequest createAddressRequest) {
		
		Address address = new Address();
		address.setCity(createAddressRequest.getCity());
		address.setStreet(createAddressRequest.getStreet());
		Address persisted = addressRepository.save(address);
		return persisted;
	}
	
	public Optional<Address> getAddress(Long id) {
		return addressRepository.findById(id);
	}
}
