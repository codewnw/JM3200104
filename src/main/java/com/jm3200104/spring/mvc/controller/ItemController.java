package com.jm3200104.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jm3200104.spring.mvc.model.Item;
import com.jm3200104.spring.mvc.service.ItemService;

@Controller
@RequestMapping("/items")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@GetMapping("/{id}")
	public @ResponseBody String getItem(@PathVariable("id") long id) {
		return itemService.getItem(id).toString();
	}

	@GetMapping("/fail")
	public @ResponseBody String failtIt() {
		int i = 10 / 0;
		return "This should get failed.";
	}

	@GetMapping("/")
	public @ResponseBody String getAllItems() {
		int random = (int) (Math.random() * 10);
		System.out.println("Random Number: "+random);
		return random > 5 ? "We will not show any item" : null;
	}
}
