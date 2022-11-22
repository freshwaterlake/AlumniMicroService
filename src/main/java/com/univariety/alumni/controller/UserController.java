package com.univariety.alumni.controller;

import com.univariety.alumni.domain.Alumni;
import com.univariety.alumni.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/alumni")
public class UserController {
    @Autowired
    UserRepository repository;

    @GetMapping("/{id}")
    public ResponseEntity<Alumni> findById(@PathVariable("id") Long id) {
        return new ResponseEntity<Alumni>(repository.getReferenceById(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Alumni> save(@RequestBody Alumni alumni) {
        return new ResponseEntity<Alumni>(repository.save(alumni), HttpStatus.OK);
    }
}
