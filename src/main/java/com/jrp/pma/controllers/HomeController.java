package com.jrp.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jrp.pma.dao.EmployeeRepository;
import com.jrp.pma.dao.ProjectRepository;
import com.jrp.pma.entities.Employee;
import com.jrp.pma.entities.Project;

@Controller
public class HomeController {

@Autowired	
EmployeeRepository empRepo;
@Autowired
ProjectRepository prorepo;
 
@GetMapping("/")
public String displayhome(Model model) {
	List <Project> projects= prorepo.findAll();
	model.addAttribute("projectsList", projects);
	
	
	List <Employee> employees= empRepo.findAll();
	model.addAttribute("employeesList", employees);
	return "main/home";
}
}
