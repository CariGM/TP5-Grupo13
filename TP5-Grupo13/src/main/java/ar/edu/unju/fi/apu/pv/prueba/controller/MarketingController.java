package ar.edu.unju.fi.apu.pv.prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/g13")
public class MarketingController {

	@GetMapping("/g13/marketing")
	public String Marketing(Model model) {

	    return "marketing";
	}
		
	
}