package com.greathome.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.greathome.festa.model.Convidado;
import com.greathome.festa.repository.Convidados;

import ch.qos.logback.classic.Logger;


@Controller
public class ConvidadosController {

	@Autowired//interface Convidados
	private Convidados convidados;
	
	private Logger logger;
	
	private ModelAndView modelAndView = new ModelAndView("ListaConvidados");
	
	@GetMapping("/convidados")
	public ModelAndView listarConvidados() {		
		modelAndView.addObject("convidados",convidados.findAll());		
		modelAndView.addObject("convidado", new Convidado());
		
		return modelAndView;
	}
	
	@PostMapping("/convidados")
	public String salvar(Convidado convidado){
		this.convidados.save(convidado);
		return "redirect:/convidados";
	}
	
	@RequestMapping(value="/convidados/{id}", method=RequestMethod.GET)
	public String excluir(Convidado convidado) {	
		this.convidados.delete(convidado.getId());
		//modelAndView.addObject("convidados",convidados.findAll());
		return "redirect:/convidados";
	}
}
