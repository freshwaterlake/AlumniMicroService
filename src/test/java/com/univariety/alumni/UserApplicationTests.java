package com.univariety.alumni;

import com.univariety.alumni.service.ProfileInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserApplicationTests {

    @Autowired
    ProfileInfoService service;

    @Test
    void createProfile() {
        service.createProfile("MANUAL");
        System.out.println("service = " + service);
    }
}
