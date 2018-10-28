package com.etz.handler.service;

import com.etz.handler.model.User;
import java.io.IOException;
import java.util.List;

public interface UserService {

    List<User> findAll() throws IOException;
}
