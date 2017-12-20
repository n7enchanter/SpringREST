package com.service;

import java.util.List;

import com.model.Student;


public interface StudentService {
	void saveStudent(Student student);
	void deleteStudent(int id);
	Student getStudent(int id);
	List<Student> getAllStudents();
	void updateStudent(Student student , int id);

}
