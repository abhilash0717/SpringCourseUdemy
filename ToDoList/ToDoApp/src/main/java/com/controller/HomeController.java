package com.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.ToDo;

@Controller
public class HomeController {
	
	@Autowired
	ServletContext context;
	
	@RequestMapping("/home")
	public String homePage(Model model) {
		model.addAttribute("page", "home");
		List<ToDo> list = (List<ToDo>) context.getAttribute("list");
		model.addAttribute("todos", list);
		return "home";
	}
	
	@RequestMapping("/add")
	public String addTodo(Model model) {
		ToDo toDo = new ToDo();
		model.addAttribute("page", "add");
		model.addAttribute("todo", toDo);
		return "home";
	}
	
	@PostMapping("/saveTodo")
	public String saveTodo(@ModelAttribute("todo") ToDo toDo, Model model) {
		System.out.println(toDo.toString());
		//getting the todo from context
		List<ToDo> list = (List<ToDo>) context.getAttribute("list");
		list.add(toDo);
		model.addAttribute("success", "added successfully!..");
		return "home";
	}
	
}
