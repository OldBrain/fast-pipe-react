package ru.react.fastpipe.services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;

class UserServiceTest {
    private static final Long id=1l;
    private UserService service;
    @BeforeEach
    void setUp() {
        service = mock(UserService.class);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAll() {

    }

    @Test
    void addUser() {
    }
}