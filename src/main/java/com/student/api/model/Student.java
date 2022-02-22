package com.student.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Student")
public class Student {
	Student(){
		
	}
	public Student(long rollnum, String name, String email) {
		super();
		this.rollnum = rollnum;
		this.name = name;
		this.email = email;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long rollnum;
private String name;
private String email;
public long getRollnum() {
	return rollnum;
}
public void setRollnum(long rollnum) {
	this.rollnum = rollnum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "StudentEntity [rollnum=" + rollnum + ", name=" + name + ", email=" + email + "]";
}

}
