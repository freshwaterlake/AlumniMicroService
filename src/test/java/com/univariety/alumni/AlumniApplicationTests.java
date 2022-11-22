package com.univariety.alumni;

import com.univariety.alumni.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AlumniApplicationTests {

    @Autowired
    UserController controller;

    @Test
    void contextLoads() {
    }
}
