package com.etz.handler.service.impl;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import com.etz.handler.Base;
import com.etz.handler.model.User;
import java.io.IOException;
import java.util.List;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest extends Base {

    private UserServiceImpl userService;

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Before
    public void setUp() throws Exception {
        userService =
            new UserServiceImpl(BASE_URL);
    }

    @Test
    public void shouldFindAllUser() throws Exception {

        //Act
        List<User> users = userService.findAll();

        //Assert
        collector.checkThat(users.size(), is(1));
    }
}