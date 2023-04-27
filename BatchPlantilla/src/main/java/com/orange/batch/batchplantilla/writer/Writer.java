package com.orange.batch.batchplantilla.writer;

import java.util.List;

import com.orange.batch.batchplantilla.model.User;

public interface Writer {
    void write(List<User> users);
}
