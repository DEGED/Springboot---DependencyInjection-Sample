package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante complicado...";
	}
	
	//Notas
	//si se hace un constructor con parametros en los compenentes, se debe hacer un segundo constructor sin argumentos para que
	//Spring lo identifique como por defecto. 
}
