package com.management.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Employee {
	@Autowired
	private EmployeeRepo empRepo;
	
	/*http://localhost:8080/employee*/
	@GetMapping("/employee")
	public String employee(Model model){
		List<EmployeeModel>employeeData=empRepo.findAll();
		model.addAttribute("data", employeeData);
		return "index";
	}

}
