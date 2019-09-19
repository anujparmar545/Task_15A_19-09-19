package com.anuj.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anuj.entities.Student;
import com.anuj.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("removestudent")
	public ModelAndView deleteStudent(@RequestParam("id") int code){
		studentService.deleteStudent(code);
		ModelAndView mv=new ModelAndView("redirect:viewall");
		return mv;
	}
	
	@RequestMapping("viewall")
	public ModelAndView showAllRecords(){
		List<Student> students=studentService.viewAllStudents();
		ModelAndView mv=new ModelAndView("studentlist");
		mv.addObject("students", students);
		return mv;
	}
	
	
	
	@RequestMapping("AddStudent")
	public String showDataEntryForm(){
		return "AddStudent";			//jsp page
	}
	
	@RequestMapping("Update")
	public ModelAndView update(){
		ModelAndView mv=new ModelAndView("redirect:viewall");
		return mv;	
	}
	
	@RequestMapping("Remove")
	public ModelAndView remove(){
		ModelAndView mv=new ModelAndView("redirect:viewall");
		return mv;			
	}
	
	@RequestMapping("Search")
	public String search(){
		return "SearchStudent";			//jsp page
	}
	
	@RequestMapping("savestudent")
	public ModelAndView saveStudentInfo(@ModelAttribute("student") Student student){
		studentService.studentEntry(student);
		ModelAndView mv=new ModelAndView("saveconfirm");
		return mv;
	}		
	
	@RequestMapping("searchstudent")
	public ModelAndView searchStudent(@RequestParam("id") int code){
		Student x=studentService.searchStudent(code);
		
		ModelAndView mv=new ModelAndView("SearchStudent");
		mv.addObject("studentInfo", x);
		return mv;
	}
	
	@RequestMapping("updatestudent")
	public ModelAndView updateStudent(@RequestParam("id") int code){
		Student x=studentService.searchStudent(code);
		studentService.updateStudent(x);
		ModelAndView mv=new ModelAndView("redirect:viewall");
		return mv;
	}
	
	
}
