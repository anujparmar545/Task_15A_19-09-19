package com.anuj.services;

import java.util.List;

import com.anuj.entities.Student;

public interface StudentService {
	public void studentEntry(Student student);
	public void deleteStudent(int code); 
	public void changeStudentDetails(Student student);
	public Student searchStudent(int code);
	public List<Student> viewAllStudents();
	public void updateStudent(Student student);
}