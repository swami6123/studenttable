package com.student.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.api.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
