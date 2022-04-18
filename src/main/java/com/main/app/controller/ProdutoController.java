package com.main.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.app.model.Produto;
import com.main.app.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
@CrossOrigin
public class ProdutoController {

	@Autowired
	ProdutoService produtoService;
	
	@GetMapping("/getAll")
	public List<Produto> listaProdutos(){
		
		return produtoService.getAll();

	}
}
