package com.student.api.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.student.api.excaption.StudentException;
import com.student.api.model.Student;
import com.student.api.repository.StudentRepository;
import com.student.api.service.StudentService;

@Service
public class Studentimpl implements StudentService {
	
	//calling Repository by declaring class name with reference
	private StudentRepository Srepo;

	//creating a constructor 
	public Studentimpl(StudentRepository srepo) {
		super();
		Srepo = srepo;
	}

	//create a method for create the student details
	@Override
	public Student savestudent(Student sb) {
		
		return  Srepo.save(sb);
	}

	//create a method for get the student details
	@Override
	public List<Student> getAllStudent() {
		
		return Srepo.findAll();
	}
//get the list of student details
	@Override
	public Student getStudentById(long id) {
		
		Optional<Student> sb = Srepo.findById(id);
		if(sb.isPresent()) {
			return sb.get();}
			
				else {
					throw new StudentException("Student", "Id", id);
				
			}
		//Lambda expression below one
			
		//return Srepo.findById(id).orElseThrow(()-> new StudentException("Student", "Id", id));
	}
	
	
    //update the student details
	
	
	@Override
	public Student updateSrudentdetails(Student sb, long id) {
		Student existingStudent = Srepo.findById(id).orElseThrow(()-> new StudentException("Student", "Id", id));
		
		existingStudent.setRollnum(sb.getRollnum());
		existingStudent.setName(sb.getName());
		existingStudent.setEmail(sb.getEmail());;
		Srepo.save(existingStudent);
		return existingStudent ;
	}
    
	
	//delete the student details
	@Override
	public void deleteStudent(long id) {
		Srepo.findById(id).orElseThrow(()-> new StudentException("Student", "Id", id));
		Srepo.deleteById(id);
		
	}
	

	}

	

	

	
	
	
