package com.jm3200104.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jm3200104.spring.mvc.model.Student;

@Controller
@RequestMapping("/students")
public class StudentController {

	@GetMapping
	public String form(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}

	@PostMapping("/procress-form")
	public String profile(@ModelAttribute("student") Student std) {
		return "student-profile";
	}
}
