package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.IServicio;

@Controller
public class IndexController {
	
	//de esta manera se hace inyeccion de dependencias de forma generica y desacoplada
	@Autowired
	@Qualifier("miServicioComplejo")
	//@qualifier serleccion el componente segun su nombre para ser ejecutado
	private IServicio servicio;
	
	/*
	 * inyeccion por contruccion con autowired, aunque ahora se puede inyectar de forma auromatica sin necesidad del autowired mediante 
	 * constructor
	 * @Autowired
	 
	public IndexController(IServicio servicio) {
		this.servicio = servicio;
	}
	 */
	



	@GetMapping({"/" , "", "/index"})
	public String index(Model model) {
		
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}

	/*
	 * inyeccion de dependecias mediante setter
	 * 
	@Autowired
	public void setServicio(IServicio servicio) {
		this.servicio = servicio;
	}
	*/
	

}
