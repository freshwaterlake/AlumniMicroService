package com.univariety.alumni.controller;

import com.univariety.alumni.domain.User;
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
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping("/{id}/user")
    public ResponseEntity<User> findById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(repository.getReferenceById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}/user")
    public ResponseEntity<User> save(@RequestBody User user) {
        return new ResponseEntity<>(repository.save(user), HttpStatus.OK);
    }
}
