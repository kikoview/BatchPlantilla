package com.orange.batch.batchplantilla.process;

import java.util.List;

import com.orange.batch.batchplantilla.model.User;

public class ProcessorImplement implements Processor {
	  
	@Override
	public List<User> process(List<User> users) {

		// Aquí iría la lógica para procesar los modelos
		System.out.println("Procesando Fichero");
		// Por simplicidad, retornamos la misma lista recibida
		
		return users;
	}
}
