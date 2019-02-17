package com.lti.scholarship.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Student;

@RestController
@CrossOrigin
public class InstituteController {
	
	@Autowired
	private InstituteService instituteService;
	
	
	@RequestMapping(path="/institute/add", method=RequestMethod.POST)
	@CrossOrigin
	public String add(@RequestBody Institute institute) {
		instituteService.add(institute);
		return "record added successfully";

	}
		
}
