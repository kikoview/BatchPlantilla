package com.orange.batch.batchplantilla;

import java.util.List;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.orange.batch.batchplantilla.model.User;
import com.orange.batch.batchplantilla.process.Processor;
import com.orange.batch.batchplantilla.process.ProcessorImplement;
import com.orange.batch.batchplantilla.reader.Reader;
import com.orange.batch.batchplantilla.reader.ReaderImplement;
import com.orange.batch.batchplantilla.writer.Writer;
import com.orange.batch.batchplantilla.writer.WriterImplement;

@SpringBootApplication
@EnableBatchProcessing
public class BatchApplication {

    public static void main(String[] args) {
    	
        SpringApplication.run(BatchApplication.class, args);
        
        // Crea instancias de los componentes
        Reader reader = new ReaderImplement();
        Processor processor = new ProcessorImplement();
        Writer writer = new WriterImplement();

        // Lee los usuarios del archivo de entrada
        List<User> users = reader.read();

        // Procesa los usuarios
        List<User> processedUsers = processor.process(users);

        // Escribe los usuarios procesados en el archivo de salida       
        writer.write(processedUsers);
        
    }

}

