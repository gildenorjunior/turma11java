package com.eventosapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eventosapp.model.ConvidadoModel;
import com.eventosapp.model.EventoModel;
import com.eventosapp.repository.ConvidadoRepository;
import com.eventosapp.repository.EventoRepository;

@Controller
public class EventoController {

	
	@Autowired
	//toda vez for preciso usar a interface com o (er) ele vai criar automaticamente uma instancia
	private EventoRepository er;
	
	@Autowired
	private ConvidadoRepository cr;
	
	@RequestMapping(value = "/cadastrarEvento", method=RequestMethod.GET) //define a url que quando for requisitada chama o metodo
	public String form() {
		//retorna a view que deve ser chamada, no caso formEvento que é o doc html e que está dentro da pasta evento
		return "evento/formEvento";
	}
	
	//método post
	@RequestMapping(value = "/cadastrarEvento", method=RequestMethod.POST) //define a url que quando for requisitada chama o metodo
	
	//recebendo como parametro um objeto do tipo eventoModel
	public String form(EventoModel evento) {
		
		//aqui ele vai persistir e ja salvar esse evento no banco de dados
		er.save(evento);
		
		//redireciona para a pagina inicial (meio que uma forma de limpar a tela)
		return "redirect:/cadastrarEvento";
	}
	
	//método para listar os eventos
	@RequestMapping("/eventos")
	public ModelAndView listaEventos() {
		ModelAndView mv = new ModelAndView("index.html");
		Iterable<EventoModel> eventos = er.findAll();
		mv.addObject("eventos", eventos);
		return mv;
	}
	
	@RequestMapping(value="/{codigo}", method=RequestMethod.GET)
	public ModelAndView detalhesEvento(@PathVariable("codigo") Long codigo) {
		EventoModel evento = er.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("evento/detalhesEvento");
		mv.addObject("evento", evento);
		
		Iterable<ConvidadoModel> convidados = cr.findByEvento(evento);
		mv.addObject("convidados", convidados);
		return mv;
	}
	
	@RequestMapping(value="/{codigo}", method=RequestMethod.POST)
	public String detalhesEventoPost(@PathVariable("codigo") Long codigo, @Validated ConvidadoModel convidado, BindingResult result, RedirectAttributes attributes) {
		
		if(result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/{codigo}";
		}
		
		EventoModel evento = er.findByCodigo(codigo);
		convidado.setEvento(evento);
		cr.save(convidado);
		attributes.addFlashAttribute("mensagem", "Convidado adicionado com sucesso!");
		return "redirect:/{codigo}";
	}
	
	
	
}
