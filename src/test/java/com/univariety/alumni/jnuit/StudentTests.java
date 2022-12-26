package com.univariety.alumni.jnuit;

import com.univariety.alumni.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentTests {

    @Autowired
    StudentService service;
}
