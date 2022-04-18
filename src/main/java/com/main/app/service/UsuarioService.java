package com.main.app.service;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	public Boolean validaLogin(String login, String senha) {
		
		if(login.equals("admin") && senha.equals("admin")) {
			return true;
		}else {
			return false;
		}
	}
	
}
