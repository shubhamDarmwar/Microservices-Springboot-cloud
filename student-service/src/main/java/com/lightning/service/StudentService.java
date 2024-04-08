package com.lightning.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.reactive.function.client.WebClient;

import com.lightning.repository.StudentRepository;
import com.lightning.request.CreateStudentRequest;
import com.lightning.response.AddressResponse;
import com.lightning.response.StudentResponse;

import reactor.core.publisher.Mono;

import com.lightning.entity.Student;
import com.lightning.feignclients.AddressFeignClient;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
//	@Autowired
//	WebClient webClient;
	
	@Autowired
	AddressFeignClient addressFeignClient;;
	
	public StudentResponse createStudent(@RequestBody CreateStudentRequest createStudentRequest) {
		
		
		Student student = new Student();
		student.setFirstName(createStudentRequest.getFirstName());
		student.setLastName(createStudentRequest.getLastName());
		student.setEmail(createStudentRequest.getEmail());
		student.setAddress_id(createStudentRequest.getAddressId());
		Student persistedStudent = studentRepository.save(student);
		
		StudentResponse stueResponse = new StudentResponse(persistedStudent);
//		stueResponse.setAddressResponse(getAddressById(createStudentRequest.getAddressId()));
		stueResponse.setAddressResponse(addressFeignClient.getById(createStudentRequest.getAddressId()));
		return stueResponse;
	}
	
	public StudentResponse getStudent(long id) {
		Optional<Student> s = studentRepository.findById(id);
		StudentResponse stueResponse = new StudentResponse(s.get());
//		stueResponse.setAddressResponse(getAddressById(s.get().getAddress_id()));
		stueResponse.setAddressResponse(addressFeignClient.getById(s.get().getAddress_id()));
		return stueResponse;
	}
	
//	public AddressResponse getAddressById(long id) {
//		Mono<AddressResponse> addressResponse = webClient.get().uri("/getBYId/" + id)
//		.retrieve().bodyToMono(AddressResponse.class);
//		return addressResponse.block();
//	}
	
	
}
