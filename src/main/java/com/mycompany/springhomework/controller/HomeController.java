package com.mycompany.springhomework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	public HomeController() {
		log.info("실행");
	}
	//http://localhost:8080/springwebapp
	@RequestMapping("/")
	public String index() {
		
		log.info("실행1");
<<<<<<< HEAD
		return "home";
=======
		log.info("실행2");
		return "index";
>>>>>>> branch 'master' of https://github.com/noismik/springhomework.git
		
		
	}
}
