package com.etz.handler.service.impl;

import com.etz.handler.client.UserClient;
import com.etz.handler.model.User;
import com.etz.handler.service.BaseService;
import com.etz.handler.service.UserService;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import retrofit2.Call;
import retrofit2.Response;

public class UserServiceImpl extends BaseService implements UserService {

    private UserClient client;

    public UserServiceImpl(String baseUrl) {
        client = getInstance(baseUrl).create(UserClient.class);
    }

    public List<User> findAll() throws IOException {
        Call<List<User>> call = client.getUsers();
        Response<List<User>> response = call.execute();
        return response.body();
    }
}
