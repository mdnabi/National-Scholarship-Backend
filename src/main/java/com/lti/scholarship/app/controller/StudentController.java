package com.lti.scholarship.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.scholarship.app.Message;
import com.lti.scholarship.app.entity.Student;

@RestController
@CrossOrigin
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(path = "/student/add", method = RequestMethod.POST)
	@ResponseBody
	public Message add(@RequestBody Student student) {
		studentService.add(student);
		return new Message("added succesfully");
	}

	@RequestMapping(path = "/student/verify", method = RequestMethod.POST)
	@ResponseBody
	public Message verify(@RequestBody Student student) {
		System.out.println("verify called");
		Student st = studentService.verify(student);
		System.out.println("data fetched");
		if (st != null) {
			return new Message("true");
		}
		return new Message("false");
	}
}
