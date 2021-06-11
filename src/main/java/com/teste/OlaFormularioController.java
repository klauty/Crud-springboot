package com.teste;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OlaFormularioController
{
	@GetMapping("/olaFormulario")
	public String olaForm(Model model) {
		model.addAttribute("olaFormulario",new OlaFormulario());
		return "olaFormulario";
	}
	
	@PostMapping("/olaFormulario")
	public String olaSubmit(@ModelAttribute OlaFormulario olaFormulario,Model model) {
	model.addAttribute("olaFormulario", olaFormulario);
	return "resultado";
	}
	
}
