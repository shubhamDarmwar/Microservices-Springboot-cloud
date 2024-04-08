package com.lightning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lightning.request.CreateStudentRequest;
import com.lightning.response.StudentResponse;
import com.lightning.service.StudentService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/create")
	public StudentResponse createStudent(@RequestBody CreateStudentRequest createStudentRequest) {
		return studentService.createStudent(createStudentRequest);
	}
	
	@GetMapping("/getById/{id}")
	public StudentResponse getStudentreResponse(@PathVariable long id) {
		return studentService.getStudent(id);
	}
	
}
