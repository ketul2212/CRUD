package com.ketul.demo.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ketul.demo.CRUDRepo.CRUDRepo;
import com.ketul.demo.model.Employee;


@Controller
public class EmployeeController {
	
	@Autowired
	CRUDRepo repo;
	
	@RequestMapping("reg")
	public String insert(Employee e) {
		repo.save(e);
		return("insert.jsp");
	}
	
	@RequestMapping("ser")
	public ModelAndView search(@RequestParam int eid) {
		ModelAndView mv = new ModelAndView("show.jsp");
		Employee e = repo.findById(eid).orElse(new Employee());
		mv.addObject("employee",e);
		return mv;
	}
	
	@RequestMapping("upd")
	public String update(@RequestParam int eid, String ename, String etech) {
		Employee e = repo.findById(eid).orElse(new Employee());
		e.setEname(ename);
		e.setEtech(etech);
		repo.save(e);
		return "search.jsp";
	}
	
	@RequestMapping("del")
	public String delete(@RequestParam int eid) {
		Employee e = repo.findById(eid).orElse(new Employee());
		repo.delete(e);
		return "search.jsp";
	}
	
	@RequestMapping("serwt")
	public ModelAndView searchWithTech(@RequestParam String etech ) {
		ModelAndView mv = new ModelAndView("show.jsp");
		ArrayList<Employee> l = repo.findByEtech(etech);
		mv.addObject("employee", l);		
		return mv;
	}
	
	@RequestMapping("gtbyid")
	public ModelAndView gtByID(@RequestParam int eid) {
		ModelAndView mv = new ModelAndView("show.jsp");
		ArrayList<Employee> l = repo.findByEidGreaterThan(eid);
		mv.addObject("employee", l);
		return mv;
	}
	
	@RequestMapping("sort")
	public ModelAndView sort(@RequestParam String etech) {
		ModelAndView mv = new ModelAndView("show.jsp");
		ArrayList<Employee> l = repo.findByEtechSorted(etech);
		mv.addObject("employee", l);
		return mv;
	}
}
