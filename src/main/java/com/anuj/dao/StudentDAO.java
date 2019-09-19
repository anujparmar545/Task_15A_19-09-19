package com.anuj.dao;

import java.util.List;

import com.anuj.entities.Student;

public interface StudentDAO {
	public void addStudent(Student student);
	public void removeStudent(int code);
	public void updateStudent(Student student);
	public Student getStudentById(int code);
	public List<Student> getAllStudents();
	
		
}
