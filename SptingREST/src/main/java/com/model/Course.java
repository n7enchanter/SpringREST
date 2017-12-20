package com.model;

import java.util.List;

public class Course {
	private static int increment = 0; 
	private int id;
	private String name;
	private List<Student> students;
	
	public Course(String name,List<Student> students) {
		this.name = name;
		this.students = students;
		this.id = increment;
		increment++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getId() {
		return id;
	}
	
}
