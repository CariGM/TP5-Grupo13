package ar.edu.unju.fi.apu.pv.prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ar.edu.unju.fi.apu.pv.prueba.model.Alumno;

@Controller

public class IndexController {

	@GetMapping("/index")
	public String Index(Model model) {
		Alumno unAlumno = new Alumno(40636205,"carlos","madrigal","igna@gmail.com",388469789);
		model.addAttribute("alumno", unAlumno);
	    return "index";
	}
		
	
}
