package com.bolsadeideas.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({ "/index", "/home", "/", "" })
	public String index(Model model) {
		model.addAttribute("titulo", "Hola spring framework!!");

		return "index";

	}

	public String perfil(Model model) {

		Usuario usuario = new Usuario();
		usuario.setApellido("Chaparro");
		usuario.setNombre("Cristian");

		return "perfil";

	}
}
