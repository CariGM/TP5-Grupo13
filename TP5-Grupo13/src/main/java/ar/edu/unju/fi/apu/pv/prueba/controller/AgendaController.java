package ar.edu.unju.fi.apu.pv.prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.apu.pv.prueba.model.Alumno;

@Controller

public class AgendaController {

	@GetMapping("/agenda")
	public String Agenda(Model model) {

	    return "agenda";
	}
		
}
