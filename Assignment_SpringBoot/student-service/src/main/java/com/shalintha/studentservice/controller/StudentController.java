package com.shalintha.studentservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shalintha.studentservice.model.Student;
import com.shalintha.studentservice.model.StudentModel;

@RestController
public class StudentController {
	
	@RequestMapping("/greeting")
	public String greeting() {
		
		return "<h1>Hello World!</h1>";
	}
	
	@RequestMapping("/students")
	public List<Student> getAllStudents(){
		
		return StudentModel.getAllStudents();
	}

}
