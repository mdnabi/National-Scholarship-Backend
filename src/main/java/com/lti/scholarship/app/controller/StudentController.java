package com.lti.scholarship.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lti.scholarship.app.entity.Student;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(path="/s")
	@CrossOrigin
	public String test() {
		return "Data added";
	}
	
	@RequestMapping(path="/student/add", method=RequestMethod.POST)
	@CrossOrigin
	public String add(@RequestBody Student student) {
		studentService.add(student);
		return "record added successfully";
	}
	
}
