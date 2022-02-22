package com.student.api.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.api.model.Student;
import com.student.api.service.StudentService;

@RestController
@RequestMapping("/api/ai")
public class StudentController {
	private StudentService  Studentservice;


	public StudentController(StudentService studentservice) {
		super();
		Studentservice = studentservice;
	}

	//create Student Details
	@PostMapping()
	public ResponseEntity<Student> St(@RequestBody  Student Studentdetails){
		
		return new ResponseEntity<Student>(Studentservice.savestudent(Studentdetails),HttpStatus.CREATED);
		
	}
	
	//Get Student Details
	@RequestMapping
	public List<Student> getAllStudent(){
		
		return Studentservice.getAllStudent();
	}
	
	//get list of stored student details
	@GetMapping("{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") long Id){
		
		return new ResponseEntity<Student>(Studentservice.getStudentById(Id),HttpStatus.OK);
	}
    //update Student details
	@PutMapping("{id}")
	public ResponseEntity<Student> updateSrudentdetails(@PathVariable("id") long id,@RequestBody Student sb){
		return new ResponseEntity<Student>(Studentservice.updateSrudentdetails(sb, id), HttpStatus.OK);
	}
	
	//Delete student details
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
		return new ResponseEntity<String>("Details delete successfully", HttpStatus.OK);
	}
	
}