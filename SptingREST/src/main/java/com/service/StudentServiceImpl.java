package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class StudentServiceImpl implements StudentService {
	private List<Student> students = new ArrayList<Student>();
	
	public void setup() {
		Student.increment = 0;
		students.clear();
		students.add(new Student("John" , "Harper" , "harper@mail" ));
		students.add( new Student("Bobby", "Larson" , "larson@mail"));
		students.add(new Student("Sheldon" , "Cooper", " funwithflags@mail"));
	}
	public void saveStudent(Student student ) {
		boolean b = true;
		int sId = 0;
		for (Student s : students) {
			if (s.getEmail() != student.getEmail()) {
				students.add(student);
			} else {
				b = false;
				sId=s.getId();
			}
		}
		if( b == false) {
			updateStudent(student , sId);
		}

	}

	public void deleteStudent(int id) {
		boolean b = true;
		for(Student s : students) {
			if(s.getId()== id) {
				students.remove(s);
				b = true;
			}else {
				b = false;
			}
		}
		if( b == false) {
			System.out.println("Student don't exist");
		}

	}

	public Student getStudent(int id) {
		boolean b = true;
		for(Student s: students) {
			if (s.getId() == id) {
				return s;
			}else {
				b = false;
			}
		}
		if( b == false) {
			System.out.println("Student don't exist");
			
		}
		return null;
	}

	public List<Student> getAllStudents() {
		return students;
	}
	public void updateStudent(Student student, int id) {
		boolean b = true;
		for (Student s : students) {
			if (s.getId() == id) {
				students.set(students.indexOf(s), student);
				b = true;
			} else {
				b = false;
			}
		}
		if (b==false) {
			saveStudent(student);
		}
	}

}
