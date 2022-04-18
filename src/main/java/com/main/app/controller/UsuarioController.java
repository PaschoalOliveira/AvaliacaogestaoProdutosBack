package com.main.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.app.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/validaLogin")
	public Boolean validaLogin(@RequestParam String login, 
							   @RequestParam String senha) {
		
		return usuarioService.validaLogin(login, senha);
	}
}
