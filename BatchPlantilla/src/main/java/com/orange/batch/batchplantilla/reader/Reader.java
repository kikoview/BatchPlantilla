package com.orange.batch.batchplantilla.reader;

import java.util.List;

import org.springframework.stereotype.Component;

import com.orange.batch.batchplantilla.model.User;
@Component
public interface Reader {
	List<User> read();
}
