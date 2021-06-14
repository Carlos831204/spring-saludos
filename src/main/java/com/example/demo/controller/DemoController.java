package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
	@GetMapping("/saludos")
	public String saludos(@RequestParam(name ="nombre", required=false, defaultValue="Mundo") String nombre, Model model) {
		model.addAttribute("nombre", nombre);
		return "saludos";
	}

}
