package com.etz.handler.client;

import com.etz.handler.model.User;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface UserClient {

    @GET("api/users")
    Call<List<User>> getUsers();
}
