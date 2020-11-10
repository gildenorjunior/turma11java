package com.example.GerenciadorDeProdutos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.GerenciadorDeProdutos.entity.ProdutoEntity;
import com.example.GerenciadorDeProdutos.service.ProdutoService;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@RequestMapping
	public String verPaginaInicial(Model model) {
		List<ProdutoEntity> listaProduto = service.listAll();
		model.addAttribute("listaProduto", listaProduto);
		return "index";
	}
	
}
