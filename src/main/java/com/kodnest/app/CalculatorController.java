package com.kodnest.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class CalculatorController {
	
	@Autowired
	private CalculatorService calculatorService;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@PostMapping("/calculate")
	public String calculate(@RequestParam("num1") double n1, @RequestParam("num1") double n2, @RequestParam("operation") String operation, Model m) {
		double result = 0;
		
		switch (operation) {
			case "add":
				result = calculatorService.add(n1, n2);
				break;
			
			case "sub":
				result = calculatorService.subtract(n1, n2);
				break;
				
			case "mul":
				result = calculatorService.multiply(n1, n2);
				break;
				
			case "div":
				if (n2 != 0) {
					result = calculatorService.divide(n1, n2);
				}
				else {
					m.addAttribute("error", "Division by zero is not allowed.");
					m.addAttribute("num1", n1);
					m.addAttribute("num2", n2);
					return "result";
				}
				break;
				
			default:
				m.addAttribute("error", "Inavlid operation.");
				return "result";	
		}
		
		m.addAttribute("num1", n1);
		m.addAttribute("num2", n2);
		m.addAttribute("operation", operation);
		m.addAttribute("result", result);
		return "result";
		
	}		
}
