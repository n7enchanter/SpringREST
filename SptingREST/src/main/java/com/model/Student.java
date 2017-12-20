package com.model;

import java.util.List;


public class Student {
	public static int increment = 0;
	private int id ;
	private String firstName;
	private String lastName;
	private String email;
	private List<Course> courses;
	public Student() {
		
	};
	public Student(String firstName, String lastName, String email) {
		this.firstName = firstName ;
		this.lastName = lastName;
		this.email = email;
		this.id = increment;
		increment++;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	
	
	

}
