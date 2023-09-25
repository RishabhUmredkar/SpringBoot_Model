package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
}
