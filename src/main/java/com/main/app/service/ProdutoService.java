package com.main.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.main.app.model.Produto;

@Service
public class ProdutoService {

	public List<Produto> getAll(){
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		Produto prod1 = new Produto(1,"Leite",7.8);
		Produto prod2 = new Produto(2,"Pão",6.3);
		Produto prod3 = new Produto(3,"Biscoito",3.8);
		produtos.add(prod1);
		produtos.add(prod2);
		produtos.add(prod3);
		
		return produtos;
	}
}
