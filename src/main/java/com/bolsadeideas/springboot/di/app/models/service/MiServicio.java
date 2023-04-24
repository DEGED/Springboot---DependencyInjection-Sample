package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioPrincipal")
//@Primary
//@Component("miServicioSimple")
//@primary es para poner un componente de primero en la ejecucion de su implementacion
public class MiServicio implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante simple...";
	}
	
	//Notas
	//si se hace un constructor con parametros en los compenentes, se debe hacer un segundo constructor sin argumentos para que
	//Spring lo identifique como por defecto. 
}
