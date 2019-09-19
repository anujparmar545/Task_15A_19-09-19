package com.anuj.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.anuj.entities.Student;

@Controller
public class SearchStudent {
	
	@RequestMapping("SearchStudent")
	public ModelAndView addStudent( @ModelAttribute("studentInfo") Student stdmodel)
	{
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=sf.openSession();
		//String hql="insert into Student values("+stdmodel.getId()+","+stdmodel.getName()+","+stdmodel.getAddress()+","+stdmodel.getMobile()+")";
		
		ModelAndView mv=new ModelAndView("SearchStudent");
		stdmodel=session.get(Student.class, stdmodel.getRno());
		mv.addObject("studentInfo", stdmodel);
		return mv;
	}

}
