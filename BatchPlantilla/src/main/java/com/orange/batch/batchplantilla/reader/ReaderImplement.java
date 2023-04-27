package com.orange.batch.batchplantilla.reader;

import java.util.ArrayList;
import java.util.List;

import com.orange.batch.batchplantilla.model.User;


public class ReaderImplement implements Reader{
	
	  	@Override
	    public List<User> read() {
		  
	        // Aquí iría la lógica para leer los modelos desde una fuente de datos
		  	System.out.println("Leyendo Fichero");
	        // Por simplicidad, retornamos una lista vacía
		  
	        return new ArrayList<>();
	    }
}
