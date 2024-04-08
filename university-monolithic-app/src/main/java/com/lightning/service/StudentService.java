package com.lightning.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.lightning.repository.StudentRepository;
import com.lightning.request.CreateStudentRequest;
import com.lightning.response.StudentResponse;
import com.lightning.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public StudentResponse createStudent(@RequestBody CreateStudentRequest createStudentRequest) {
		
		
		Student student = new Student();
		student.setFirstName(createStudentRequest.getFirstName());
		student.setLastName(createStudentRequest.getLastName());
		student.setEmail(createStudentRequest.getEmail());
		Student persistedStudent = studentRepository.save(student);
		
		StudentResponse stueResponse = new StudentResponse(persistedStudent);
		
		return stueResponse;
	}
	
	public StudentResponse getStudent(long id) {
		Optional<Student> s = studentRepository.findById(id);
		StudentResponse stueResponse = new StudentResponse(s.get());
		return stueResponse;
	}
	
	
}
