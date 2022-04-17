package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.IConvidados;
import com.example.demo.model.Convidado;

@Controller
public class ConvidadosController {
	
	@Autowired
	private IConvidados convidados;
	
	ModelAndView modelAndView;
	
	
	@GetMapping("/convidados")
	public ModelAndView listar() {
		
		 modelAndView = new ModelAndView("ListaConvidados");
		 modelAndView.addObject(new Convidado());
		modelAndView.addObject("convidados", convidados.findAll());
		
		
		return modelAndView;
	}
	@PostMapping("/convidados")
	public String salvar(Convidado convidado) {
		
		this.convidados.save(convidado);
		return "redirect:/convidados";
	}

}
