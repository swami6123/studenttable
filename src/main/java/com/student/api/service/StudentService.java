package com.student.api.service;

import java.util.List;

import com.student.api.model.Student;

public interface StudentService {
	//save Student Details
	Student savestudent(Student sb);
	
	//get student Details
	List<Student> getAllStudent();
	
	//get the student details
	Student getStudentById(long id);
	
	//update the student details
	Student updateSrudentdetails(Student sb, long id);
	
	//delete the student details	
	void deleteStudent(long id);

}
