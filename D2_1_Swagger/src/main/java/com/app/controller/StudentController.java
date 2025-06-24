package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.serviceint.StudentServiceInt;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class StudentController {

	@Autowired
	StudentServiceInt ssi;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		log.info("this is add Student method...!!!");
		log.error("!!!!!");
		log.warn("!!!!!!");
		Student s=ssi.saveStudent(student);
		return null;
	}
	
	@GetMapping("/getStudentsAPI")
	public List<Student> getStudents()
	{
		log.info("this is getStudents Method....");
		List<Student> stuList=ssi.getStudents();
		return stuList;
		
	}
	
	@DeleteMapping
	public void deleteStudent() {
		
		log.info("---------------");
	}
}
