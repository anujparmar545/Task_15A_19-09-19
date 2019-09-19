package com.anuj.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuj.dao.StudentDAO;
import com.anuj.entities.Student;

@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
	private StudentDAO studentDAO;

	public void studentEntry(Student student) {
		studentDAO.addStudent(student);
	}

	public void deleteStudent(int code) {
		studentDAO.removeStudent(code);
	}

	public void changeStudentDetails(Student student) {
		studentDAO.updateStudent(student);
	}

	public Student searchStudent(int code) {
		return studentDAO.getStudentById(code);
	}

	public List<Student> viewAllStudents() {
		return studentDAO.getAllStudents();
	}

	public void updateStudent(Student student) {
		studentDAO.updateStudent(student);
	}
	
	
}
