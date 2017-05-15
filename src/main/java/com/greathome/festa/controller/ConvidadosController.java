package com.greathome.festa.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.greathome.festa.model.Convidado;
import com.greathome.festa.repository.Convidados;


@Controller
public class ConvidadosController {

	@Autowired//interface Convidados
	private Convidados convidados;
	
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
	
	//@GetMapping("/convidados")
	@RequestMapping(value="convidado", method=RequestMethod.DELETE)
	public String excluir(@RequestParam Long id) {
		this.convidados.delete(id);
		return "redirect:/convidados";
	}
}
