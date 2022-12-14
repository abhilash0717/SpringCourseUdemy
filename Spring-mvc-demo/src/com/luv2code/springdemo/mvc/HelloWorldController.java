package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		//convert the data to all caps
		theName.toUpperCase();
		
		//create the message
		String result = "Yo!" + theName;
		
		//add the message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String ProcessFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
//		//read the request parameter from the HTML form
//		String theName = request.getParameter("studentName");
		
		//convert the data to all caps
		theName.toUpperCase();
		
		//create the message
		String result = "Yo! bro from version 3" + theName;
		
		//add the message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
