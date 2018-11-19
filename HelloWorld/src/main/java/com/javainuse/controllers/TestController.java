package com.javainuse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class TestController {

	@RequestMapping("/login.html")
	public ModelAndView firstPage() {
		return new ModelAndView("login");
	}

	@RequestMapping("/login_process")
	public ModelAndView loginAction() {
		return new ModelAndView("login", "login", "Login Successful");

	}

	@PostMapping("/api/login")
	public String login_Action() {
		return "Login Successful";

	}

}