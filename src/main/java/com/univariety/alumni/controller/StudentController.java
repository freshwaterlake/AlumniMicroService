package com.univariety.alumni.controller;

import com.univariety.alumni.domain.aggregate.Student;
import com.univariety.alumni.service.StudentService;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/{id}")
    public ResponseEntity<Student> findById(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Student> save(@PathVariable("id") UUID profileId,
//        @RequestBody Student student) {
//        return new ResponseEntity<>(service.save(profileId, student), HttpStatus.OK);
//    }

}
