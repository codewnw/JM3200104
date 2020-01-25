package com.jm3200104.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jm3200104.spring.mvc.model.User;

@Controller
@RequestMapping("/users")
public class UserController {

	List<User> users = new ArrayList<>();

	public UserController() {
		users.add(new User("Rohit", "Sharma", 31));
		users.add(new User("Shreyas", "Iyer", 30));
		users.add(new User("KL", "Rahul", 28));
		users.add(new User("Virat", "Kohli", 25));
		users.add(new User("Krunal", "Pandya", 26));
		users.add(new User("Hardik", "Pandya", 25));
	}

	@GetMapping
	public String users(Model model) {
		model.addAttribute("users", users);
		return "users";
	}

	@GetMapping("/{name}")
	public String rohitSharma(Model model, 
			@PathVariable("name") String name) {
		User user = users.stream()
				.filter(u -> u.getFirstName().equals(name))
				.collect(Collectors.toList()).get(0);

		model.addAttribute("user", user);
		return "user";
	}

	@GetMapping("/search")
	public String usersByLastName(Model model, 
			@RequestParam("lastName") String ln) {
		System.out.println(ln);
		List<User> userList = users.stream()
				.filter(u -> u.getLastName().equals(ln))
				.collect(Collectors.toList());
		model.addAttribute("users", userList);
		return "users";
	}
}
