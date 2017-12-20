package com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentServiceImpl;

@RestController
public class StudentRESTController {
	private StudentServiceImpl studentService = new StudentServiceImpl();

	@RequestMapping(value = "/setup", method = RequestMethod.GET)
	public List<Student> getDefault() {
		studentService.setup();
		return studentService.getAllStudents();
	}

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Student> getAllStudents() {

		return studentService.getAllStudents();
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("id") int id) {
		return studentService.getStudent(id);

	}

	@RequestMapping(value = "/student/delete/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id") int id) {
		studentService.deleteStudent(id);
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.PUT)
	public void updateStudent(@PathVariable("id") int id, @RequestBody Student student) {
		studentService.updateStudent(student, id);

	}

	@RequestMapping(value = "/student/save", method = RequestMethod.POST)
	public void saveStudent(@RequestBody Student student) {
		studentService.saveStudent(student);

	}

}
