package com.orange.batch.batchplantilla.process;

import java.util.List;

import com.orange.batch.batchplantilla.model.User;

public interface Processor {
    List<User> process(List<User> users);
}
