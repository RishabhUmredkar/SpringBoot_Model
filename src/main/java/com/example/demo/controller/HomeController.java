package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class HomeController {

	@RequestMapping("/")
	String Myfun() {
		return "index.html";
	}
	
	@RequestMapping("/page1.html")
	String MyPage1(Model m) {
		m.addAttribute("data","Rishabh");
		return "page1.html";
	}
	
	@RequestMapping("/page2.html")
	String MyPage2(Model m) {
		Student st = new Student(101, "Rishabh", "79.6");
		m.addAttribute("data2", st);
		return "page2.html";
		
	}
}

