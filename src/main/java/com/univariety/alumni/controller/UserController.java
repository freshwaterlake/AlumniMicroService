package com.univariety.alumni.controller;

import com.univariety.alumni.domain.aggregate.ProfileInfo;
import com.univariety.alumni.repository.ProfileInfoRepository;
import java.util.UUID;
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
    ProfileInfoRepository repository;

    @GetMapping("/{id}/user")
    public ResponseEntity<ProfileInfo> findById(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(repository.getReferenceById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}/user")
    public ResponseEntity<ProfileInfo> save(@RequestBody ProfileInfo profileInfo) {
        return new ResponseEntity<>(repository.save(profileInfo), HttpStatus.OK);
    }
}
