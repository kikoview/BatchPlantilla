package com.orange.batch.batchplantilla.writer;

import java.util.List;

import com.orange.batch.batchplantilla.model.User;

public class WriterImplement implements Writer {

    @Override
    public void write(List<User> users) {
    	
        // Aquí iría la lógica para escribir el modelo en una fuente de datos
    	System.out.println("Escribiendo Fichero");
        // Por simplicidad, no hacemos nada en este ejemplo
    }


}