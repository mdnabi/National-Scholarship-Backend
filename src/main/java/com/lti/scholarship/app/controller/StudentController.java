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
	
		@RequestMapping(path="/")
		public String add() {
			//studentService.add(student);
			return "Student record created";
		}
		
	
/*		@RequestMapping(path="/student/{adharno}", method=RequestMethod.GET)
		@CrossOrigin
		public Student fetch(@PathVariable("adharno") long adharno) {
			return studentService.fetch(adharno);
		}*/

}
