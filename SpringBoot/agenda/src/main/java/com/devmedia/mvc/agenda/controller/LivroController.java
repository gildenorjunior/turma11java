package com.devmedia.mvc.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devmedia.mvc.agenda.entity.LivroEntity;
import com.devmedia.mvc.agenda.repository.LivroRepository;

@Controller
@RequestMapping("/")
public class LivroController {

	//INSTÂNCIANDO O OBJETO "livroRepository" da Classe LivroRepository já criada para embaixo criar o método
	private LivroRepository livroRepository;
	
	@Autowired
	public LivroController(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}
	
	
	//LISTA OS LIVROS DE UM DETERMINADO AUTOR E SERÁ ACESSADO QUANDO A REQUISIÇÃO FOR GET
	@RequestMapping(value = "/{autor}", method = RequestMethod.GET)
	public String listaLivros(@PathVariable("autor") String autor, Model model) {
		List<LivroEntity> listaLivros = livroRepository.findByAutor(autor);
		if (listaLivros != null) {
			model.addAttribute("livros", listaLivros);
		}
		return "listaLivros";
	}
	
	//ADICIONA LIVRO QUANDO A REQUISIÇÃO FOR POST
	@RequestMapping(value = "/{autor}", method = RequestMethod.POST)
	public String adicionalLivroAutor(@PathVariable("autor") String autor, LivroEntity livro) {
		livro.setAutor(autor);
		livroRepository.save(livro);
		return "redirect:/{autor}";
	}
}
