package com.univariety.alumni.controller;

import com.univariety.alumni.domain.BasicProfile;
import com.univariety.alumni.repository.BasicProfileRepository;
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
public class BasicProfileController {

    @Autowired
    BasicProfileRepository repository;

    @GetMapping("/{id}/basicInfo")
    public ResponseEntity<BasicProfile> getByAlumniId(@PathVariable("id") UUID userGuid) {
        return new ResponseEntity<>(repository.findByUserGuid(userGuid),
            HttpStatus.OK);
    }

    @PutMapping("/{id}/basicInfo")
    public ResponseEntity<BasicProfile> save(@RequestBody BasicProfile basicProfile) {
        return new ResponseEntity<>(repository.save(basicProfile), HttpStatus.OK);
    }
}
