package br.com.gc.relacionamento.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.gc.relacionamento.model.Anexo;
import br.com.gc.relacionamento.service.AnexoService;

@Controller
@RequestMapping("/relacionamento/anexos")
public class AnexoController {
	
	@Autowired
    private AnexoService service;
	
	@GetMapping("/novo")
	public ModelAndView add(Anexo anexo) {

		ModelAndView mv = new ModelAndView("/chamado/formChamado");
		mv.addObject("anexo", anexo);
		return mv;
	}
	
	@GetMapping("/editar/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {

		return add(service.findOne(id));
	}

	@GetMapping("/remover/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView("/chamado/formChamado");

		service.delete(id);

		return mv;
	}
	
	 @PostMapping("/save")
	 public ModelAndView save(@Valid Anexo anexo, BindingResult result) {
		 ModelAndView mv = new ModelAndView("/chamado/formChamado");
     	 if(result.hasErrors()) {
	        return add(anexo);
	        }
	         
	        service.save(anexo);
	         
	        return mv;
	 }

}
